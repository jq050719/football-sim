package V1;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        boolean x = true;
        String input = "";
        String exit = "e";
        while (x) {
            try {
                Scanner sc = new Scanner(System.in);
                int homeGoals=0;
                int awayGoals=0;
                int homeChances=0;
                int awayChances=0;
                int minute=1;
                int firstHalfStoppage=0;
                int secondHalfStoppage=0;
                String homeTeamName;
                String awayTeamName;

                // creating hash map for teams
                Map<String, Team> teams = new HashMap<>();
                try (Scanner file = new Scanner(new FileReader("FootySimTeams.csv"))) {
                    while (file.hasNextLine()) {
                        String line = file.nextLine();
                        String[] parts = line.split(",");
                        String teamName = parts[0];
                        double attack = Double.parseDouble(parts[1]);
                        double midfield = Double.parseDouble(parts[2]);
                        double defense = Double.parseDouble(parts[3]);

                        teams.put(teamName.toLowerCase(), new Team(teamName, attack, midfield, defense));
                    }
                } catch (FileNotFoundException _) {
                    System.out.println("csv file not found");
                }

                System.out.print("Home team: ");
                String homeInput = sc.nextLine();
                Team home = teams.get(homeInput.toLowerCase().trim());
                System.out.println("Home: "+home);
                System.out.println();
                System.out.print("Away team: ");
                String awayInput = sc.nextLine();
                Team away = teams.get(awayInput.toLowerCase().trim());
                System.out.println("Away: " + away);
                System.out.println();
                System.out.print("Home advantage? The greater the number, the greater the advantage."); // -0.67 good value for neutral ground
                double homeAdv = sc.nextDouble();
                sc.nextLine();
                System.out.print("Play extra time if tied? (true or false)");
                boolean extraTime = sc.nextBoolean();
                sc.nextLine();
                System.out.print("How many times to simulate? ");
                int numSimulations = sc.nextInt();
                sc.nextLine();

                //team overalls
                homeTeamName = home.getName();
                awayTeamName = away.getName();
                double homeAttack = home.getAttack();
                double homeMidfield = home.getMidfield();
                double homeDefense = home.getDefense();
                double awayAttack = home.getAttack();
                double awayMidfield = away.getMidfield();
                double awayDefense = away.getDefense();
                double homeOverall = (homeAttack+homeMidfield+homeDefense)/3;
                double awayOverall = (awayAttack+awayMidfield+awayDefense)/3;
                //chance probabilities per minute
                double homeChanceProb=(homeMidfield/(homeMidfield+awayMidfield)*(homeMidfield/2.5));
                homeChanceProb=homeChanceProb+homeAdv+((homeOverall-awayOverall)/7);
                if (homeChanceProb < 2)
                {
                    homeChanceProb = 2;
                }
                if(homeChanceProb>55)
                {
                    homeChanceProb=55;
                }
                double awayChanceProb=(awayMidfield/(homeMidfield+awayMidfield)*(awayMidfield/2.5));
                awayChanceProb=awayChanceProb-homeAdv+((awayOverall-homeOverall)/7);
                if(awayChanceProb < 2)
                {
                    awayChanceProb = 2;
                }
                if(awayChanceProb>55)
                {
                    awayChanceProb=55;
                }
                //goal probabilities per chance
                double homeGoalProb=(homeAttack/(homeAttack+awayDefense))*(homeAttack/(2*awayDefense))*100;
                homeGoalProb=homeGoalProb+homeAdv-12;
                if(homeGoalProb<1)
                {
                    homeGoalProb=1;
                }
                if(homeGoalProb>67)
                {
                    homeGoalProb=67;
                }
                double awayGoalProb=(awayAttack/(awayAttack+homeDefense))*(awayAttack/(2*homeDefense))*100;
                awayGoalProb=awayGoalProb-homeAdv-12;
                if(awayGoalProb<1)
                {
                    awayGoalProb=1;
                }
                if(awayGoalProb>67)
                {
                    awayGoalProb=67;
                }

                int totalHomeGoals = 0;
                int totalAwayGoals = 0;
                int totalHomeScoreless = 0;
                int totalAwayScoreless = 0;
                System.out.println(homeTeamName+" vs. "+awayTeamName);
                System.out.println();
                System.out.println("The game has kicked off!");

                for (int i = 0; i < numSimulations; i++) {
                    int[] result = simulate(minute, homeChanceProb, homeGoalProb, homeGoals, homeChances, firstHalfStoppage, homeTeamName, awayGoals, awayChanceProb, awayGoalProb, awayChances, awayTeamName, secondHalfStoppage, extraTime);
                    int hg = result[0];
                    int ag = result[1];
                    totalHomeGoals += hg;
                    totalAwayGoals += ag;
                    if (hg == 0) {
                        totalHomeScoreless += 1;
                    }
                    if (ag == 0) {
                        totalAwayScoreless += 1;
                    }
                }

                double avgHome = (double) totalHomeGoals /  numSimulations;
                double avgAway = (double) totalAwayGoals /  numSimulations;
                int roundedHome = (int) Math.round(avgHome);
                int roundedAway = (int) Math.round(avgAway);

                if (avgHome < 1) {
                    roundedHome = 0;
                }
                if (avgAway < 1) {
                    roundedAway = 0;
                }
                if (numSimulations >= 100) {
                    if ((double) totalHomeScoreless / numSimulations >= 0.3) {
                        roundedHome = 0;
                    }
                    if ((double) totalAwayScoreless / numSimulations >= 0.3) {
                        roundedAway = 0;
                    }
                }

                System.out.println("Average scoreline after " + numSimulations + " simulations:");
                System.out.println(homeTeamName + " " + roundedHome + "-" + roundedAway + " " + awayTeamName);
                System.out.printf("Decimal average: %.2f - %.2f%n", avgHome, avgAway);
                System.out.println(homeTeamName + " scored 0 goals " + totalHomeScoreless + " times");
                System.out.println(awayTeamName + " scored 0 goals " + totalAwayScoreless + " times");

                // ask if user wants to continue
                System.out.print("Enter any key to continue, or enter E to exit.");
                input = sc.nextLine();
                if(input.equalsIgnoreCase(exit))
                {
                    x = false;
                }
            }
            catch(Exception _)
            {
                System.out.println("Please enter a valid value.");
                System.out.println();
            }
        }
        System.out.println("Loop ended");
    }

    private static int[] simulate(int minute, double homeChanceProb, double homeGoalProb, int homeGoals, int homeChances, int firstHalfStoppage, String homeTeamName, int awayGoals, double awayChanceProb, double awayGoalProb, int awayChances, String awayTeamName, int secondHalfStoppage, boolean extraTime) {
        for(int i=1;i<=45;i++)
        {
            System.out.println(minute +"'");
            if(Math.random()*(100-1+1)+1 <= homeChanceProb)//home team gets a chance
            {
                if(Math.random()*(100-1+1)+1 <= homeGoalProb)//home team scores
                {
                    homeGoals++;
                    homeChances++;
                    firstHalfStoppage++;
                    System.out.println("Goal for "+ homeTeamName +"! ("+ homeGoals +"-"+ awayGoals +")");
                }
                else//home team misses chance
                {
                    System.out.println("Chance missed by "+ homeTeamName);
                    homeChances++;
                }
            }
            else//home team does not get a chance
            {
                if(Math.random()*(100-1+1)+1 <= awayChanceProb)//away team gets a chance
                {
                    if(Math.random()*(100-1+1)+1 <= awayGoalProb)//away team scores
                    {
                        awayGoals++;
                        awayChances++;
                        firstHalfStoppage++;
                        System.out.println("Goal for "+ awayTeamName +"! ("+ homeGoals +"-"+ awayGoals +")");
                    }
                    else//away team misses chance
                    {
                        System.out.println("Chance missed by "+ awayTeamName);
                        awayChances++;
                    }
                }
                else//away team does not get a chance
                {
                    System.out.println("No chances for either team.");
                }
            }
            System.out.println();
            minute++;
        }
        //stoppage time, 1 minute for each goal scored
        for(int i = 1; i<= firstHalfStoppage; i++)
        {
            System.out.println("45+"+i+"'");
            if(Math.random()*(100-1+1)+1 <= homeChanceProb)//home team gets a chance
            {
                if(Math.random()*(100-1+1)+1 <= homeGoalProb)//home team scores
                {
                    homeGoals++;
                    homeChances++;
                    System.out.println("Goal for "+ homeTeamName +"! ("+ homeGoals +"-"+ awayGoals +")");
                }
                else//home team misses chance
                {
                    System.out.println("Chance missed by "+ homeTeamName);
                    homeChances++;
                }
            }
            else//home team does not get a chance
            {
                if(Math.random()*(100-1+1)+1 <= awayChanceProb)//away team gets a chance
                {
                    if(Math.random()*(100-1+1)+1 <= awayGoalProb)//away team scores
                    {
                        awayGoals++;
                        awayChances++;
                        System.out.println("Goal for "+ awayTeamName +"! ("+ homeGoals +"-"+ awayGoals +")");
                    }
                    else//away team misses chance
                    {
                        System.out.println("Chance missed by "+ awayTeamName);
                        awayChances++;
                    }
                }
                else//away team does not get a chance
                {
                    System.out.println("No chances for either team.");
                }
            }
            System.out.println();
        }
        System.out.println("Half-time");
        System.out.println(homeTeamName +" "+ homeGoals +"-"+ awayGoals +" "+ awayTeamName);
        System.out.println(homeTeamName +": "+ homeChances +" shots"+"\t"+ awayTeamName +": "+ awayChances +" shots");
        System.out.println();
        System.out.println("The second half has kicked off!");
        for(int i=46;i<=90;i++)
        {
            System.out.println(minute +"'");
            if(Math.random()*(100-1+1)+1 <= homeChanceProb)//home team gets a chance
            {
                if(Math.random()*(100-1+1)+1 <= homeGoalProb)//home team scores
                {
                    homeGoals++;
                    homeChances++;
                    secondHalfStoppage++;
                    System.out.println("Goal for "+ homeTeamName +"! ("+ homeGoals +"-"+ awayGoals +")");
                }
                else//home team misses chance
                {
                    System.out.println("Chance missed by "+ homeTeamName);
                    homeChances++;
                }
            }
            else//home team does not get a chance
            {
                if(Math.random()*(100-1+1)+1 <= awayChanceProb)//away team gets a chance
                {
                    if(Math.random()*(100-1+1)+1 <= awayGoalProb)//away team scores
                    {
                        awayGoals++;
                        awayChances++;
                        secondHalfStoppage++;
                        System.out.println("Goal for "+ awayTeamName +"! ("+ homeGoals +"-"+ awayGoals +")");
                    }
                    else//away team misses chance
                    {
                        System.out.println("Chance missed by "+ awayTeamName);
                        awayChances++;
                    }
                }
                else//away team does not get a chance
                {
                    System.out.println("No chances for either team.");
                }
            }
            System.out.println();
            minute++;
        }
        //stoppage time, 1 minute for each goal scored
        for(int i = 1; i<= secondHalfStoppage; i++)
        {
            System.out.println("90+"+i+"'");
            if(Math.random()*(100-1+1)+1 <= homeChanceProb)//home team gets a chance
            {
                if(Math.random()*(100-1+1)+1 <= homeGoalProb)//home team scores
                {
                    homeGoals++;
                    homeChances++;
                    System.out.println("Goal for "+ homeTeamName +"! ("+ homeGoals +"-"+ awayGoals +")");
                }
                else//home team misses chance
                {
                    System.out.println("Chance missed by "+ homeTeamName);
                    homeChances++;
                }
            }
            else//home team does not get a chance
            {
                if(Math.random()*(100-1+1)+1 <= awayChanceProb)//away team gets a chance
                {
                    if(Math.random()*(100-1+1)+1 <= awayGoalProb)//away team scores
                    {
                        awayGoals++;
                        awayChances++;
                        System.out.println("Goal for "+ awayTeamName +"! ("+ homeGoals +"-"+ awayGoals +")");
                    }
                    else//away team misses chance
                    {
                        System.out.println("Chance missed by "+ awayTeamName);
                        awayChances++;
                    }
                }
                else//away team does not get a chance
                {
                    System.out.println("No chances for either team.");
                }
            }
            System.out.println();
        }
        if(!extraTime || (extraTime && homeGoals != awayGoals))
        {
            System.out.println("Full-time");
            System.out.println(homeTeamName +" "+ homeGoals +"-"+ awayGoals +" "+ awayTeamName);
            System.out.println(homeTeamName +": "+ homeChances +" shots"+"\t"+ awayTeamName +": "+ awayChances +" shots");
        }
        else if(extraTime && homeGoals == awayGoals)
        {
            System.out.println("End of regulation");
            System.out.println(homeTeamName +" "+ homeGoals +"-"+ awayGoals +" "+ awayTeamName);
            System.out.println(homeTeamName +": "+ homeChances +" shots"+"\t"+ awayTeamName +": "+ awayChances +" shots");
            for(int i=91;i<=120;i++)
            {
                System.out.println(minute +"'");
                if(Math.random()*(100-1+1)+1 <= homeChanceProb)//home team gets a chance
                {
                    if(Math.random()*(100-1+1)+1 <= homeGoalProb)//home team scores
                    {
                        homeGoals++;
                        homeChances++;
                        System.out.println("Goal for "+ homeTeamName +"! ("+ homeGoals +"-"+ awayGoals +")");
                    }
                    else//home team misses chance
                    {
                        System.out.println("Chance missed by "+ homeTeamName);
                        homeChances++;
                    }
                }
                else//home team does not get a chance
                {
                    if(Math.random()*(100-1+1)+1 <= awayChanceProb)//away team gets a chance
                    {
                        if(Math.random()*(100-1+1)+1 <= awayGoalProb)//away team scores
                        {
                            awayGoals++;
                            awayChances++;
                            System.out.println("Goal for "+ awayTeamName +"! ("+ homeGoals +"-"+ awayGoals +")");
                        }
                        else//away team misses chance
                        {
                            System.out.println("Chance missed by "+ awayTeamName);
                            awayChances++;
                        }
                    }
                    else//away team does not get a chance
                    {
                        System.out.println("No chances for either team.");
                    }
                }
                System.out.println();
                minute++;
            }
            System.out.println("End of extra time");
            System.out.println(homeTeamName +" "+ homeGoals +"-"+ awayGoals +" "+ awayTeamName);
            System.out.println(homeTeamName +": "+ homeChances +" shots"+"     "+ awayTeamName +": "+ awayChances +" shots");
        }
        int[] results = {homeGoals, awayGoals};
        return results;
    }
}


class Team
{
    private String name;
    private double attack;
    private double midfield;
    private double defense;
    public Team(String name,double attack,double midfield,double defense)//overloaded constructor
    {
        this.name=name;
        this.attack=attack;
        this.midfield=midfield;
        this.defense=defense;
    }
    public String getName()
    {
        return name;
    }
    public double getAttack()
    {
        return attack;
    }
    public double getMidfield()
    {
        return midfield;
    }
    public double getDefense()
    {
        return defense;
    }
    public String toString()
    {
        return name+"\n"+"ATT: "+attack+", MID: "+midfield+", DEF: "+defense;
    }
}
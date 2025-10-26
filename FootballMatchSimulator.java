package V1;
import java.util.Scanner;

public class FootballMatchSimulator
{
    public static void main(String[]args)
    {
        boolean x=true;
        String input="";
        String exit="e";
        while(x==true)
        {
            try
            {
                Scanner sc=new Scanner(System.in);
                double homeTeamChanceProb=0;
                double homeTeamGoalProb=0;
                double awayTeamChanceProb=0;
                double awayTeamGoalProb=0;
                int homeGoals=0;
                int awayGoals=0;
                int homeChances=0;
                int awayChances=0;
                int minute=1;
                int firstHalfStoppage=0;
                int secondHalfStoppage=0;
                String homeTeamName=null;
                String awayTeamName=null;
                double homeAttack=0;
                double homeMidfield=0;
                double homeDefense=0;
                double awayAttack=0;
                double awayMidfield=0;
                double awayDefense=0;
                Team home=new Team();
                Team away=new Team();
                System.out.print("Home team: ");
                homeTeamName=sc.nextLine();
                if(homeTeamName.equalsIgnoreCase("Spain"))
                {
                    home.setName("Spain");
                    home.setAttack(83);
                    home.setMidfield(85);
                    home.setDefense(84);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Brazil"))
                {
                    home.setName("Brazil");
                    home.setAttack(82);
                    home.setMidfield(86);
                    home.setDefense(83);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("England"))
                {
                    home.setName("England");
                    home.setAttack(85);
                    home.setMidfield(83);
                    home.setDefense(83);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Portugal"))
                {
                    home.setName("Portugal");
                    home.setAttack(85);
                    home.setMidfield(82);
                    home.setDefense(84);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("France"))
                {
                    home.setName("France");
                    home.setAttack(86);
                    home.setMidfield(83);
                    home.setDefense(82);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Argentina"))
                {
                    home.setName("Argentina");
                    home.setAttack(86);
                    home.setMidfield(82);
                    home.setDefense(81);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Germany"))
                {
                    home.setName("Germany");
                    home.setAttack(82);
                    home.setMidfield(85);
                    home.setDefense(82);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Italy"))
                {
                    home.setName("Italy");
                    home.setAttack(83);
                    home.setMidfield(84);
                    home.setDefense(82);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Netherlands"))
                {
                    home.setName("Netherlands");
                    home.setAttack(82);
                    home.setMidfield(81);
                    home.setDefense(84);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Belgium"))
                {
                    home.setName("Belgium");
                    home.setAttack(82);
                    home.setMidfield(84);
                    home.setDefense(79);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Uruguay"))
                {
                    home.setName("Uruguay");
                    home.setAttack(81);
                    home.setMidfield(80);
                    home.setDefense(80);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Croatia"))
                {
                    home.setName("Croatia");
                    home.setAttack(79);
                    home.setMidfield(83);
                    home.setDefense(78);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Colombia"))
                {
                    home.setName("Colombia");
                    home.setAttack(80);
                    home.setMidfield(80);
                    home.setDefense(77);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Denmark"))
                {
                    home.setName("Denmark");
                    home.setAttack(77);
                    home.setMidfield(80);
                    home.setDefense(79);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Ivory Coast")||homeTeamName.equalsIgnoreCase("Cote d'Ivoire"))
                {
                    home.setName("Ivory Coast");
                    home.setAttack(79);
                    home.setMidfield(80);
                    home.setDefense(76);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Serbia"))
                {
                    home.setName("Serbia");
                    home.setAttack(80);
                    home.setMidfield(80);
                    home.setDefense(75);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Austria"))
                {
                    home.setName("Austria");
                    home.setAttack(79);
                    home.setMidfield(75);
                    home.setDefense(79);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Switzerland"))
                {
                    home.setName("Switzerland");
                    home.setAttack(77);
                    home.setMidfield(78);
                    home.setDefense(78);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Ghana"))
                {
                    home.setName("Ghana");
                    home.setAttack(81);
                    home.setMidfield(76);
                    home.setDefense(75);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Mexico"))
                {
                    home.setName("Mexico");
                    home.setAttack(79);
                    home.setMidfield(77);
                    home.setDefense(76);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Morocco"))
                {
                    home.setName("Morocco");
                    home.setAttack(79);
                    home.setMidfield(74);
                    home.setDefense(79);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Norway"))
                {
                    home.setName("Norway");
                    home.setAttack(82);
                    home.setMidfield(76);
                    home.setDefense(74);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Senegal"))
                {
                    home.setName("Senegal");
                    home.setAttack(79);
                    home.setMidfield(76);
                    home.setDefense(77);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Algeria"))
                {
                    home.setName("Algeria");
                    home.setAttack(77);
                    home.setMidfield(78);
                    home.setDefense(76);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Turkey"))
                {
                    home.setName("Turkey");
                    home.setAttack(77);
                    home.setMidfield(78);
                    home.setDefense(76);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Poland"))
                {
                    home.setName("Poland");
                    home.setAttack(80);
                    home.setMidfield(76);
                    home.setDefense(74);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Sweden"))
                {
                    home.setName("Sweden");
                    home.setAttack(79);
                    home.setMidfield(75);
                    home.setDefense(76);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Chile"))
                {
                    home.setName("Chile");
                    home.setAttack(76);
                    home.setMidfield(77);
                    home.setDefense(76);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Nigeria"))
                {
                    home.setName("Nigeria");
                    home.setAttack(80);
                    home.setMidfield(75);
                    home.setDefense(74);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Czech Republic")||homeTeamName.equalsIgnoreCase("Czechia"))
                {
                    home.setName("Czech Republic");
                    home.setAttack(79);
                    home.setMidfield(76);
                    home.setDefense(73);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Ecuador"))
                {
                    home.setName("Ecuador");
                    home.setAttack(75);
                    home.setMidfield(77);
                    home.setDefense(76);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Greece"))
                {
                    home.setName("Greece");
                    home.setAttack(75);
                    home.setMidfield(75);
                    home.setDefense(77);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Scotland"))
                {
                    home.setName("Scotland");
                    home.setAttack(73);
                    home.setMidfield(77);
                    home.setDefense(77);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Ukraine"))
                {
                    home.setName("Ukraine");
                    home.setAttack(76);
                    home.setMidfield(77);
                    home.setDefense(74);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("USA")||homeTeamName.equalsIgnoreCase("United States"))
                {
                    home.setName("USA");
                    home.setAttack(76);
                    home.setMidfield(76);
                    home.setDefense(75);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("DRC")||homeTeamName.equalsIgnoreCase("DR Congo")||homeTeamName.equalsIgnoreCase("Democratic Republic of the Congo"))
                {
                    home.setName("DR Congo");
                    home.setAttack(77);
                    home.setMidfield(74);
                    home.setDefense(74);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Japan"))
                {
                    home.setName("Japan");
                    home.setAttack(74);
                    home.setMidfield(77);
                    home.setDefense(74);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("South Korea"))
                {
                    home.setName("South Korea");
                    home.setAttack(78);
                    home.setMidfield(74);
                    home.setDefense(73);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Venezuela"))
                {
                    home.setName("Venezuela");
                    home.setAttack(78);
                    home.setMidfield(75);
                    home.setDefense(72);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Bosnia and Herzegovina"))
                {
                    home.setName("Bosnia and Herzegovina");
                    home.setAttack(77);
                    home.setMidfield(75);
                    home.setDefense(72);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Cameroon"))
                {
                    home.setName("Cameroon");
                    home.setAttack(74);
                    home.setMidfield(76);
                    home.setDefense(74);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Mali"))
                {
                    home.setName("Mali");
                    home.setAttack(75);
                    home.setMidfield(76);
                    home.setDefense(73);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Russia"))
                {
                    home.setName("Russia");
                    home.setAttack(76);
                    home.setMidfield(75);
                    home.setDefense(73);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Slovakia"))
                {
                    home.setName("Slovakia");
                    home.setAttack(73);
                    home.setMidfield(75);
                    home.setDefense(76);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Egypt"))
                {
                    home.setName("Egypt");
                    home.setAttack(73);
                    home.setMidfield(77);
                    home.setDefense(73);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Paraguay"))
                {
                    home.setName("Paraguay");
                    home.setAttack(74);
                    home.setMidfield(75);
                    home.setDefense(74);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Guinea"))
                {
                    home.setName("Guinea");
                    home.setAttack(74);
                    home.setMidfield(75);
                    home.setDefense(73);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Wales"))
                {
                    home.setName("Wales");
                    home.setAttack(75);
                    home.setMidfield(73);
                    home.setDefense(74);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Iran"))
                {
                    home.setName("Iran");
                    home.setAttack(76);
                    home.setMidfield(73);
                    home.setDefense(72);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("South Africa"))
                {
                    home.setName("South Africa");
                    home.setAttack(79);
                    home.setMidfield(72);
                    home.setDefense(70);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Albania"))
                {
                    home.setName("Albania");
                    home.setAttack(73);
                    home.setMidfield(73);
                    home.setDefense(74);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Costa Rica"))
                {
                    home.setName("Costa Rica");
                    home.setAttack(75);
                    home.setMidfield(72);
                    home.setDefense(73);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Cuba"))
                {
                    home.setName("Cuba");
                    home.setAttack(75);
                    home.setMidfield(72);
                    home.setDefense(73);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Hungary"))
                {
                    home.setName("Hungary");
                    home.setAttack(74);
                    home.setMidfield(72);
                    home.setDefense(73);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Slovenia"))
                {
                    home.setName("Slovenia");
                    home.setAttack(72);
                    home.setMidfield(74);
                    home.setDefense(73);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Burkina Faso"))
                {
                    home.setName("Burkina Faso");
                    home.setAttack(73);
                    home.setMidfield(72);
                    home.setDefense(73);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Canada"))
                {
                    home.setName("Canada");
                    home.setAttack(76);
                    home.setMidfield(72);
                    home.setDefense(70);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Kosovo"))
                {
                    home.setName("Kosovo");
                    home.setAttack(75);
                    home.setMidfield(71);
                    home.setDefense(72);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Angola"))
                {
                    home.setName("Angola");
                    home.setAttack(73);
                    home.setMidfield(70);
                    home.setDefense(74);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Gabon"))
                {
                    home.setName("Gabon");
                    home.setAttack(77);
                    home.setMidfield(72);
                    home.setDefense(68);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Australia"))
                {
                    home.setName("Australia");
                    home.setAttack(75);
                    home.setMidfield(71);
                    home.setDefense(70);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Ireland"))
                {
                    home.setName("Ireland");
                    home.setAttack(70);
                    home.setMidfield(73);
                    home.setDefense(73);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Montenegro"))
                {
                    home.setName("Montenegro");
                    home.setAttack(71);
                    home.setMidfield(70);
                    home.setDefense(75);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Peru"))
                {
                    home.setName("Peru");
                    home.setAttack(72);
                    home.setMidfield(73);
                    home.setDefense(71);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Romania"))
                {
                    home.setName("Romania");
                    home.setAttack(71);
                    home.setMidfield(73);
                    home.setDefense(71);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Cape Verde")||homeTeamName.equalsIgnoreCase("Cabo Verde"))
                {
                    home.setName("Cape Verde");
                    home.setAttack(75);
                    home.setMidfield(71);
                    home.setDefense(68);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Israel"))
                {
                    home.setName("Israel");
                    home.setAttack(74);
                    home.setMidfield(70);
                    home.setDefense(70);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Jamaica"))
                {
                    home.setName("Jamaica");
                    home.setAttack(74);
                    home.setMidfield(71);
                    home.setDefense(69);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Honduras"))
                {
                    home.setName("Honduras");
                    home.setAttack(73);
                    home.setMidfield(70);
                    home.setDefense(70);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Tunisia"))
                {
                    home.setName("Tunisia");
                    home.setAttack(71);
                    home.setMidfield(72);
                    home.setDefense(70);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("UAE")||homeTeamName.equalsIgnoreCase("United Arab Emirates"))
                {
                    home.setName("United Arab Emirates");
                    home.setAttack(74);
                    home.setMidfield(70);
                    home.setDefense(69);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Guinea-Bissau")||homeTeamName.equalsIgnoreCase("Guinea Bissau"))
                {
                    home.setName("Guinea-Bissau");
                    home.setAttack(72);
                    home.setMidfield(71);
                    home.setDefense(69);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Comoros"))
                {
                    home.setName("Comoros");
                    home.setAttack(66);
                    home.setMidfield(74);
                    home.setDefense(71);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Georgia"))
                {
                    home.setName("Georgia");
                    home.setAttack(72);
                    home.setMidfield(70);
                    home.setDefense(69);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Iceland"))
                {
                    home.setName("Iceland");
                    home.setAttack(71);
                    home.setMidfield(70);
                    home.setDefense(70);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Qatar"))
                {
                    home.setName("Qatar");
                    home.setAttack(73);
                    home.setMidfield(70);
                    home.setDefense(68);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Benin"))
                {
                    home.setName("Benin");
                    home.setAttack(71);
                    home.setMidfield(70);
                    home.setDefense(69);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Panama"))
                {
                    home.setName("Panama");
                    home.setAttack(71);
                    home.setMidfield(69);
                    home.setDefense(70);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Saudi Arabia"))
                {
                    home.setName("Saudi Arabia");
                    home.setAttack(68);
                    home.setMidfield(71);
                    home.setDefense(71);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Uzbekistan"))
                {
                    home.setName("Uzbekistan");
                    home.setAttack(72);
                    home.setMidfield(69);
                    home.setDefense(69);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Finland"))
                {
                    home.setName("Finland");
                    home.setAttack(70);
                    home.setMidfield(72);
                    home.setDefense(67);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("North Macedonia"))
                {
                    home.setName("North Macedonia");
                    home.setAttack(68);
                    home.setMidfield(71);
                    home.setDefense(70);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Northern Ireland"))
                {
                    home.setName("Northern Ireland");
                    home.setAttack(66);
                    home.setMidfield(71);
                    home.setDefense(72);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Zimbabwe"))
                {
                    home.setName("Zimbabwe");
                    home.setAttack(71);
                    home.setMidfield(67);
                    home.setDefense(71);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Republic of the Congo"))
                {
                    home.setName("Republic of the Congo");
                    home.setAttack(73);
                    home.setMidfield(69);
                    home.setDefense(66);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Mozambique"))
                {
                    home.setName("Mozambique");
                    home.setAttack(66);
                    home.setMidfield(70);
                    home.setDefense(71);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Suriname"))
                {
                    home.setName("Suriname");
                    home.setAttack(72);
                    home.setMidfield(65);
                    home.setDefense(70);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Armenia"))
                {
                    home.setName("Armenia");
                    home.setAttack(70);
                    home.setMidfield(70);
                    home.setDefense(66);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("China"))
                {
                    home.setName("China");
                    home.setAttack(69);
                    home.setMidfield(68);
                    home.setDefense(69);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("New Zealand"))
                {
                    home.setName("New Zealand");
                    home.setAttack(70);
                    home.setMidfield(68);
                    home.setDefense(68);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Philippines"))
                {
                    home.setName("Philippines");
                    home.setAttack(74);
                    home.setMidfield(68);
                    home.setDefense(64);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Belarus"))
                {
                    home.setName("Belarus");
                    home.setAttack(69);
                    home.setMidfield(68);
                    home.setDefense(68);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Bulgaria"))
                {
                    home.setName("Bulgaria");
                    home.setAttack(67);
                    home.setMidfield(69);
                    home.setDefense(69);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Togo"))
                {
                    home.setName("Togo");
                    home.setAttack(70);
                    home.setMidfield(67);
                    home.setDefense(68);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Kenya"))
                {
                    home.setName("Kenya");
                    home.setAttack(71);
                    home.setMidfield(66);
                    home.setDefense(67);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Sierra Leone"))
                {
                    home.setName("Sierra Leone");
                    home.setAttack(70);
                    home.setMidfield(65);
                    home.setDefense(69);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Zambia"))
                {
                    home.setName("Zambia");
                    home.setAttack(72);
                    home.setMidfield(69);
                    home.setDefense(63);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Haiti"))
                {
                    home.setName("Haiti");
                    home.setAttack(68);
                    home.setMidfield(66);
                    home.setDefense(69);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Cyprus"))
                {
                    home.setName("Cyprus");
                    home.setAttack(68);
                    home.setMidfield(67);
                    home.setDefense(67);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Equatorial Guinea"))
                {
                    home.setName("Equatorial Guinea");
                    home.setAttack(67);
                    home.setMidfield(68);
                    home.setDefense(67);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Ethiopia"))
                {
                    home.setName("Ethiopia");
                    home.setAttack(69);
                    home.setMidfield(65);
                    home.setDefense(67);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Curacao"))
                {
                    home.setName("Curacao");
                    home.setAttack(67);
                    home.setMidfield(69);
                    home.setDefense(64);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Dominican Republic"))
                {
                    home.setName("Dominican Republic");
                    home.setAttack(69);
                    home.setMidfield(63);
                    home.setDefense(68);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Madagascar"))
                {
                    home.setName("Madagascar");
                    home.setAttack(64);
                    home.setMidfield(68);
                    home.setDefense(68);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Uganda"))
                {
                    home.setName("Uganda");
                    home.setAttack(68);
                    home.setMidfield(66);
                    home.setDefense(66);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Central African Republic"))
                {
                    home.setName("Central African Republic");
                    home.setAttack(64);
                    home.setMidfield(69);
                    home.setDefense(66);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Kazakhstan"))
                {
                    home.setName("Kazakhstan");
                    home.setAttack(65);
                    home.setMidfield(68);
                    home.setDefense(66);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Liberia"))
                {
                    home.setName("Liberia");
                    home.setAttack(66);
                    home.setMidfield(67);
                    home.setDefense(66);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Luxembourg"))
                {
                    home.setName("Luxembourg");
                    home.setAttack(63);
                    home.setMidfield(70);
                    home.setDefense(66);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Bahrain"))
                {
                    home.setName("Bahrain");
                    home.setAttack(66);
                    home.setMidfield(68);
                    home.setDefense(64);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Oman"))
                {
                    home.setName("Oman");
                    home.setAttack(71);
                    home.setMidfield(64);
                    home.setDefense(63);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Azerbaijan"))
                {
                    home.setName("Azerbaijan");
                    home.setAttack(65);
                    home.setMidfield(66);
                    home.setDefense(66);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Bolivia"))
                {
                    home.setName("Bolivia");
                    home.setAttack(66);
                    home.setMidfield(66);
                    home.setDefense(65);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Iraq"))
                {
                    home.setName("Iraq");
                    home.setAttack(65);
                    home.setMidfield(68);
                    home.setDefense(64);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("North Korea"))
                {
                    home.setName("North Korea");
                    home.setAttack(67);
                    home.setMidfield(61);
                    home.setDefense(69);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Trinidad and Tobago"))
                {
                    home.setName("Trinidad and Tobago");
                    home.setAttack(66);
                    home.setMidfield(65);
                    home.setDefense(66);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Mauritania"))
                {
                    home.setName("Mauritania");
                    home.setAttack(65);
                    home.setMidfield(66);
                    home.setDefense(64);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Malawi"))
                {
                    home.setName("Malawi");
                    home.setAttack(71);
                    home.setMidfield(64);
                    home.setDefense(59);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Moldova"))
                {
                    home.setName("Moldova");
                    home.setAttack(63);
                    home.setMidfield(65);
                    home.setDefense(66);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Burundi"))
                {
                    home.setName("Burundi");
                    home.setAttack(64);
                    home.setMidfield(65);
                    home.setDefense(64);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Estonia"))
                {
                    home.setName("Estonia");
                    home.setAttack(63);
                    home.setMidfield(65);
                    home.setDefense(65);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Lebanon"))
                {
                    home.setName("Lebanon");
                    home.setAttack(64);
                    home.setMidfield(65);
                    home.setDefense(64);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Libya"))
                {
                    home.setName("Libya");
                    home.setAttack(62);
                    home.setMidfield(69);
                    home.setDefense(62);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Jordan"))
                {
                    home.setName("Jordan");
                    home.setAttack(63);
                    home.setMidfield(63);
                    home.setDefense(66);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Niger"))
                {
                    home.setName("Niger");
                    home.setAttack(64);
                    home.setMidfield(69);
                    home.setDefense(59);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Palestine"))
                {
                    home.setName("Palestine");
                    home.setAttack(64);
                    home.setMidfield(64);
                    home.setDefense(64);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Thailand"))
                {
                    home.setName("Thailand");
                    home.setAttack(64);
                    home.setMidfield(65);
                    home.setDefense(63);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Guatemala"))
                {
                    home.setName("Guatemala");
                    home.setAttack(65);
                    home.setMidfield(64);
                    home.setDefense(62);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Guyana"))
                {
                    home.setName("Guyana");
                    home.setAttack(63);
                    home.setMidfield(65);
                    home.setDefense(63);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Lithuania"))
                {
                    home.setName("Lithuania");
                    home.setAttack(65);
                    home.setMidfield(63);
                    home.setDefense(63);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Syria"))
                {
                    home.setName("Syria");
                    home.setAttack(65);
                    home.setMidfield(63);
                    home.setDefense(62);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Tanzania"))
                {
                    home.setName("Tanzania");
                    home.setAttack(65);
                    home.setMidfield(63);
                    home.setDefense(62);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Grenada"))
                {
                    home.setName("Grenada");
                    home.setAttack(62);
                    home.setMidfield(66);
                    home.setDefense(61);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Kuwait"))
                {
                    home.setName("Kuwait");
                    home.setAttack(64);
                    home.setMidfield(63);
                    home.setDefense(61);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Latvia"))
                {
                    home.setName("Latvia");
                    home.setAttack(66);
                    home.setMidfield(58);
                    home.setDefense(64);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Hong Kong"))
                {
                    home.setName("Hong Kong");
                    home.setAttack(66);
                    home.setMidfield(58);
                    home.setDefense(63);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Sudan"))
                {
                    home.setName("Sudan");
                    home.setAttack(64);
                    home.setMidfield(61);
                    home.setDefense(62);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("India"))
                {
                    home.setName("India");
                    home.setAttack(65);
                    home.setMidfield(60);
                    home.setDefense(61);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Martinique"))
                {
                    home.setName("Martinique");
                    home.setAttack(63);
                    home.setMidfield(62);
                    home.setDefense(61);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Vietnam"))
                {
                    home.setName("Vietnam");
                    home.setAttack(61);
                    home.setMidfield(63);
                    home.setDefense(62);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Antigua and Barbuda"))
                {
                    home.setName("Antigua and Barbuda");
                    home.setAttack(62);
                    home.setMidfield(61);
                    home.setDefense(61);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Turkmenistan"))
                {
                    home.setName("Turkmenistan");
                    home.setAttack(62);
                    home.setMidfield(61);
                    home.setDefense(61);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Botswana"))
                {
                    home.setName("Botswana");
                    home.setAttack(63);
                    home.setMidfield(62);
                    home.setDefense(58);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("El Salvador"))
                {
                    home.setName("El Salvador");
                    home.setAttack(62);
                    home.setMidfield(61);
                    home.setDefense(60);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Tahiti")||homeTeamName.equalsIgnoreCase("French Polynesia"))
                {
                    home.setName("Tahiti");
                    home.setAttack(63);
                    home.setMidfield(59);
                    home.setDefense(61);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Afghanistan"))
                {
                    home.setName("Afghanistan");
                    home.setAttack(61);
                    home.setMidfield(60);
                    home.setDefense(61);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Rwanda"))
                {
                    home.setName("Rwanda");
                    home.setAttack(59);
                    home.setMidfield(63);
                    home.setDefense(60);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("St Kitts and Nevis")||homeTeamName.equalsIgnoreCase("Saint Kitts and Nevis"))
                {
                    home.setName("St Kitts and Nevis");
                    home.setAttack(61);
                    home.setMidfield(61);
                    home.setDefense(60);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Chad"))
                {
                    home.setName("Chad");
                    home.setAttack(64);
                    home.setMidfield(60);
                    home.setDefense(57);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Lesotho"))
                {
                    home.setName("Lesotho");
                    home.setAttack(60);
                    home.setMidfield(60);
                    home.setDefense(60);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Malta"))
                {
                    home.setName("Malta");
                    home.setAttack(58);
                    home.setMidfield(63);
                    home.setDefense(59);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Namibia"))
                {
                    home.setName("Namibia");
                    home.setAttack(66);
                    home.setMidfield(55);
                    home.setDefense(59);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Faroe Islands"))
                {
                    home.setName("Faroe Islands");
                    home.setAttack(62);
                    home.setMidfield(59);
                    home.setDefense(58);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Montserrat"))
                {
                    home.setName("Montserrat");
                    home.setAttack(60);
                    home.setMidfield(61);
                    home.setDefense(58);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Tajikistan"))
                {
                    home.setName("Tajikistan");
                    home.setAttack(61);
                    home.setMidfield(59);
                    home.setDefense(58);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Malaysia"))
                {
                    home.setName("Malaysia");
                    home.setAttack(57);
                    home.setMidfield(59);
                    home.setDefense(61);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Kyrgyzstan"))
                {
                    home.setName("Kyrgyzstan");
                    home.setAttack(58);
                    home.setMidfield(60);
                    home.setDefense(58);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Puerto Rico"))
                {
                    home.setName("Puerto Rico");
                    home.setAttack(62);
                    home.setMidfield(53);
                    home.setDefense(61);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Taiwan"))
                {
                    home.setName("Taiwan");
                    home.setAttack(58);
                    home.setMidfield(62);
                    home.setDefense(56);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Indonesia"))
                {
                    home.setName("Indonesia");
                    home.setAttack(60);
                    home.setMidfield(57);
                    home.setDefense(58);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Liechtenstein"))
                {
                    home.setName("Liechtenstein");
                    home.setAttack(55);
                    home.setMidfield(61);
                    home.setDefense(60);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Singapore"))
                {
                    home.setName("Singapore");
                    home.setAttack(58);
                    home.setMidfield(57);
                    home.setDefense(59);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Sao Tome and Principe"))
                {
                    home.setName("Sao Tome and Principe");
                    home.setAttack(60);
                    home.setMidfield(55);
                    home.setDefense(58);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Gibraltar"))
                {
                    home.setName("Gibraltar");
                    home.setAttack(56);
                    home.setMidfield(58);
                    home.setDefense(58);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Bermuda"))
                {
                    home.setName("Bermuda");
                    home.setAttack(61);
                    home.setMidfield(55);
                    home.setDefense(55);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Nicaragua"))
                {
                    home.setName("Nicaragua");
                    home.setAttack(60);
                    home.setMidfield(55);
                    home.setDefense(56);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Barbados"))
                {
                    home.setName("Barbados");
                    home.setAttack(58);
                    home.setMidfield(53);
                    home.setDefense(59);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Mauritius"))
                {
                    home.setName("Mauritius");
                    home.setAttack(55);
                    home.setMidfield(58);
                    home.setDefense(57);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("St Vincent and the Grenadines")||homeTeamName.equalsIgnoreCase("St Vincent"))
                {
                    home.setName("St Vincent and the Grenadines");
                    home.setAttack(57);
                    home.setMidfield(57);
                    home.setDefense(56);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Aruba"))
                {
                    home.setName("Aruba");
                    home.setAttack(53);
                    home.setMidfield(57);
                    home.setDefense(58);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("New Caledonia"))
                {
                    home.setName("New Caledonia");
                    home.setAttack(55);
                    home.setMidfield(55);
                    home.setDefense(58);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("South Sudan"))
                {
                    home.setName("South Sudan");
                    home.setAttack(57);
                    home.setMidfield(56);
                    home.setDefense(55);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Yemen"))
                {
                    home.setName("Yemen");
                    home.setAttack(56);
                    home.setMidfield(57);
                    home.setDefense(55);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Andorra"))
                {
                    home.setName("Andorra");
                    home.setAttack(55);
                    home.setMidfield(55);
                    home.setDefense(57);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Guam"))
                {
                    home.setName("Guam");
                    home.setAttack(54);
                    home.setMidfield(58);
                    home.setDefense(55);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Papua New Guinea"))
                {
                    home.setName("Papua New Guinea");
                    home.setAttack(55);
                    home.setMidfield(57);
                    home.setDefense(55);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Fiji"))
                {
                    home.setName("Fiji");
                    home.setAttack(60);
                    home.setMidfield(52);
                    home.setDefense(54);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("St Lucia")||homeTeamName.equalsIgnoreCase("Saint Lucia"))
                {
                    home.setName("St Lucia");
                    home.setAttack(56);
                    home.setMidfield(52);
                    home.setDefense(58);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Belize"))
                {
                    home.setName("Belize");
                    home.setAttack(53);
                    home.setMidfield(60);
                    home.setDefense(52);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Eritrea"))
                {
                    home.setName("Eritrea");
                    home.setAttack(57);
                    home.setMidfield(57);
                    home.setDefense(51);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Pakistan"))
                {
                    home.setName("Pakistan");
                    home.setAttack(54);
                    home.setMidfield(55);
                    home.setDefense(56);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Eswatini"))
                {
                    home.setName("Eswatini");
                    home.setAttack(53);
                    home.setMidfield(55);
                    home.setDefense(56);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Laos"))
                {
                    home.setName("Laos");
                    home.setAttack(56);
                    home.setMidfield(55);
                    home.setDefense(53);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Somalia"))
                {
                    home.setName("Somalia");
                    home.setAttack(53);
                    home.setMidfield(58);
                    home.setDefense(53);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Solomon Islands"))
                {
                    home.setName("Solomon Islands");
                    home.setAttack(55);
                    home.setMidfield(54);
                    home.setDefense(54);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Bangladesh"))
                {
                    home.setName("Bangladesh");
                    home.setAttack(55);
                    home.setMidfield(54);
                    home.setDefense(52);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Nepal"))
                {
                    home.setName("Nepal");
                    home.setAttack(55);
                    home.setMidfield(53);
                    home.setDefense(53);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Dominica"))
                {
                    home.setName("Dominica");
                    home.setAttack(54);
                    home.setMidfield(52);
                    home.setDefense(54);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Bahamas"))
                {
                    home.setName("Bahamas");
                    home.setAttack(57);
                    home.setMidfield(50);
                    home.setDefense(52);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Maldives"))
                {
                    home.setName("Maldives");
                    home.setAttack(57);
                    home.setMidfield(55);
                    home.setDefense(46);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Seychelles"))
                {
                    home.setName("Seychelles");
                    home.setAttack(52);
                    home.setMidfield(54);
                    home.setDefense(52);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Sri Lanka"))
                {
                    home.setName("Sri Lanka");
                    home.setAttack(53);
                    home.setMidfield(51);
                    home.setDefense(54);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Bhutan"))
                {
                    home.setName("Bhutan");
                    home.setAttack(55);
                    home.setMidfield(52);
                    home.setDefense(49);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Myanmar")||homeTeamName.equalsIgnoreCase("Burma"))
                {
                    home.setName("Myanmar");
                    home.setAttack(55);
                    home.setMidfield(53);
                    home.setDefense(48);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Brunei"))
                {
                    home.setName("Brunei");
                    home.setAttack(53);
                    home.setMidfield(51);
                    home.setDefense(51);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Bonaire"))
                {
                    home.setName("Bonaire");
                    home.setAttack(55);
                    home.setMidfield(49);
                    home.setDefense(51);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Vanuatu"))
                {
                    home.setName("Vanuatu");
                    home.setAttack(50);
                    home.setMidfield(52);
                    home.setDefense(52);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Jersey"))
                {
                    home.setName("Jersey");
                    home.setAttack(51);
                    home.setMidfield(51);
                    home.setDefense(51);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Cayman Islands"))
                {
                    home.setName("Cayman Islands");
                    home.setAttack(51);
                    home.setMidfield(52);
                    home.setDefense(49);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Cambodia"))
                {
                    home.setName("Cambodia");
                    home.setAttack(53);
                    home.setMidfield(49);
                    home.setDefense(48);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Djibouti"))
                {
                    home.setName("Djibouti");
                    home.setAttack(52);
                    home.setMidfield(50);
                    home.setDefense(48);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Mongolia"))
                {
                    home.setName("Mongolia");
                    home.setAttack(53);
                    home.setMidfield(50);
                    home.setDefense(47);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("US Virgin Islands"))
                {
                    home.setName("US Virgin Islands");
                    home.setAttack(52);
                    home.setMidfield(50);
                    home.setDefense(48);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Sint Maarten"))
                {
                    home.setName("Sint Maarten");
                    home.setAttack(53);
                    home.setMidfield(48);
                    home.setDefense(49);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Saint Martin"))
                {
                    home.setName("Saint Martin");
                    home.setAttack(54);
                    home.setMidfield(52);
                    home.setDefense(53);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("San Marino"))
                {
                    home.setName("San Marino");
                    home.setAttack(51);
                    home.setMidfield(49);
                    home.setDefense(49);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Samoa"))
                {
                    home.setName("Samoa");
                    home.setAttack(51);
                    home.setMidfield(49);
                    home.setDefense(48);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Cook Islands"))
                {
                    home.setName("Cook Islands");
                    home.setAttack(50);
                    home.setMidfield(47);
                    home.setDefense(45);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Tonga"))
                {
                    home.setName("Tonga");
                    home.setAttack(46);
                    home.setMidfield(48);
                    home.setDefense(47);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Timor-Leste")||homeTeamName.equalsIgnoreCase("East Timor")||homeTeamName.equalsIgnoreCase("Timor Leste"))
                {
                    home.setName("Timor-Leste");
                    home.setAttack(53);
                    home.setMidfield(44);
                    home.setDefense(43);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Macau")||homeTeamName.equalsIgnoreCase("Macao"))
                {
                    home.setName("Macau");
                    home.setAttack(41);
                    home.setMidfield(51);
                    home.setDefense(46);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Turks and Caicos Islands"))
                {
                    home.setName("Turks and Caicos Islands");
                    home.setAttack(49);
                    home.setMidfield(43);
                    home.setDefense(43);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Guernsey"))
                {
                    home.setName("Guernsey");
                    home.setAttack(46);
                    home.setMidfield(45);
                    home.setDefense(44);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Anguilla"))
                {
                    home.setName("Anguilla");
                    home.setAttack(47);
                    home.setMidfield(44);
                    home.setDefense(43);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Greenland"))
                {
                    home.setName("Greenland");
                    home.setAttack(44);
                    home.setMidfield(44);
                    home.setDefense(44);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("British Virgin Islands"))
                {
                    home.setName("British Virgin Islands");
                    home.setAttack(45);
                    home.setMidfield(42);
                    home.setDefense(43);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Tuvalu"))
                {
                    home.setName("Tuvalu");
                    home.setAttack(43);
                    home.setMidfield(42);
                    home.setDefense(40);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("American Samoa"))
                {
                    home.setName("American Samoa");
                    home.setAttack(39);
                    home.setMidfield(42);
                    home.setDefense(41);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Northern Mariana Islands"))
                {
                    home.setName("Northern Mariana Islands");
                    home.setAttack(41);
                    home.setMidfield(37);
                    home.setDefense(40);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("St Pierre and Miquelon")||homeTeamName.equalsIgnoreCase("Saint Pierre and Miquelon"))
                {
                    home.setName("St Pierre and Miquelon");
                    home.setAttack(36);
                    home.setMidfield(38);
                    home.setDefense(36);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Saint Barthelemy")||homeTeamName.equalsIgnoreCase("St Barthelemy"))
                {
                    home.setName("Saint Barthelemy");
                    home.setAttack(36);
                    home.setMidfield(36);
                    home.setDefense(36);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Kiribati"))
                {
                    home.setName("Kiribati");
                    home.setAttack(31);
                    home.setMidfield(35);
                    home.setDefense(32);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Palau"))
                {
                    home.setName("Palau");
                    home.setAttack(31);
                    home.setMidfield(33);
                    home.setDefense(30);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Micronesia"))
                {
                    home.setName("Micronesia");
                    home.setAttack(29);
                    home.setMidfield(28);
                    home.setDefense(27);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Christmas Island"))
                {
                    home.setName("Christmas Island");
                    home.setAttack(26);
                    home.setMidfield(25);
                    home.setDefense(24);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("North Sentinel Island"))
                {
                    home.setName("North Sentinel Island");
                    home.setAttack(3);
                    home.setMidfield(3);
                    home.setDefense(3);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Monaco"))
                {
                    home.setName("Monaco");
                    home.setAttack(48);
                    home.setMidfield(49);
                    home.setDefense(55);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Vatican City")||homeTeamName.equalsIgnoreCase("Vatican")||homeTeamName.equalsIgnoreCase("Holy See"))
                {
                    home.setName("Vatican City");
                    home.setAttack(31);
                    home.setMidfield(30);
                    home.setDefense(29);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Isle of Man"))
                {
                    home.setName("Isle of Man");
                    home.setAttack(52);
                    home.setMidfield(52);
                    home.setDefense(51);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Niue"))
                {
                    home.setName("Niue");
                    home.setAttack(15);
                    home.setMidfield(13);
                    home.setDefense(10);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Pitcairn Islands")||homeTeamName.equalsIgnoreCase("Pitcairn"))
                {
                    home.setName("Pitcairn Islands");
                    home.setAttack(15);
                    home.setMidfield(11);
                    home.setDefense(13);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Andaman and Nicobar Islands")||homeTeamName.equalsIgnoreCase("Andaman and Nicobar"))
                {
                    home.setName("Andaman and Nicobar Islands");
                    home.setAttack(32);
                    home.setMidfield(29);
                    home.setDefense(32);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("South Georgia and the South Sandwich Islands")||homeTeamName.equalsIgnoreCase("SGSSI"))
                {
                    home.setName("SGSSI");
                    home.setAttack(6);
                    home.setMidfield(5);
                    home.setDefense(11);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("French Guiana"))
                {
                    home.setName("French Guiana");
                    home.setAttack(59);
                    home.setMidfield(56);
                    home.setDefense(59);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Norfolk Island"))
                {
                    home.setName("Norfolk Island");
                    home.setAttack(25);
                    home.setMidfield(25);
                    home.setDefense(25);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Saint Helena")||homeTeamName.equalsIgnoreCase("St Helena"))
                {
                    home.setName("Saint Helena");
                    home.setAttack(30);
                    home.setMidfield(25);
                    home.setDefense(20);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Tristan da Cunha")||homeTeamName.equalsIgnoreCase("Tristan"))
                {
                    home.setName("Tristan da Cunha");
                    home.setAttack(10);
                    home.setMidfield(15);
                    home.setDefense(10);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Reunion"))
                {
                    home.setName("Reunion");
                    home.setAttack(59);
                    home.setMidfield(62);
                    home.setDefense(61);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else if(homeTeamName.equalsIgnoreCase("Guadeloupe"))
                {
                    home.setName("Guadeloupe");
                    home.setAttack(56);
                    home.setMidfield(51);
                    home.setDefense(53);
                    homeTeamName=home.getName();
                    homeAttack=home.getAttack();
                    homeMidfield=home.getMidfield();
                    homeDefense=home.getDefense();
                }
                else
                {
                    System.out.println("Team not recognized. Please enter stats.");
                    System.out.print("ATT: ");
                    homeAttack=sc.nextDouble();
                    sc.nextLine();
                    System.out.print("MID: ");
                    homeMidfield=sc.nextDouble();
                    sc.nextLine();
                    System.out.print("DEF: ");
                    homeDefense=sc.nextDouble();
                    sc.nextLine();
                    home.setName(homeTeamName);
                    home.setAttack(homeAttack);
                    home.setMidfield(homeMidfield);
                    home.setDefense(homeDefense);
                }
                System.out.println("Home: "+home);
                System.out.println();
                System.out.print("Away team: ");
                awayTeamName=sc.nextLine();
                if(awayTeamName.equalsIgnoreCase("Spain"))
                {
                    away.setName("Spain");
                    away.setAttack(83);
                    away.setMidfield(85);
                    away.setDefense(84);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Brazil"))
                {
                    away.setName("Brazil");
                    away.setAttack(82);
                    away.setMidfield(86);
                    away.setDefense(83);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("England"))
                {
                    away.setName("England");
                    away.setAttack(85);
                    away.setMidfield(83);
                    away.setDefense(83);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Portugal"))
                {
                    away.setName("Portugal");
                    away.setAttack(85);
                    away.setMidfield(82);
                    away.setDefense(84);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("France"))
                {
                    away.setName("France");
                    away.setAttack(86);
                    away.setMidfield(83);
                    away.setDefense(82);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Argentina"))
                {
                    away.setName("Argentina");
                    away.setAttack(86);
                    away.setMidfield(82);
                    away.setDefense(81);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Germany"))
                {
                    away.setName("Germany");
                    away.setAttack(82);
                    away.setMidfield(85);
                    away.setDefense(82);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Italy"))
                {
                    away.setName("Italy");
                    away.setAttack(83);
                    away.setMidfield(84);
                    away.setDefense(82);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Netherlands"))
                {
                    away.setName("Netherlands");
                    away.setAttack(82);
                    away.setMidfield(81);
                    away.setDefense(84);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Belgium"))
                {
                    away.setName("Belgium");
                    away.setAttack(82);
                    away.setMidfield(84);
                    away.setDefense(79);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Uruguay"))
                {
                    away.setName("Uruguay");
                    away.setAttack(81);
                    away.setMidfield(80);
                    away.setDefense(80);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Croatia"))
                {
                    away.setName("Croatia");
                    away.setAttack(79);
                    away.setMidfield(83);
                    away.setDefense(78);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Colombia"))
                {
                    away.setName("Colombia");
                    away.setAttack(80);
                    away.setMidfield(80);
                    away.setDefense(77);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Denmark"))
                {
                    away.setName("Denmark");
                    away.setAttack(77);
                    away.setMidfield(80);
                    away.setDefense(79);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Ivory Coast")||awayTeamName.equalsIgnoreCase("Cote d'Ivoire"))
                {
                    away.setName("Ivory Coast");
                    away.setAttack(79);
                    away.setMidfield(80);
                    away.setDefense(76);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Serbia"))
                {
                    away.setName("Serbia");
                    away.setAttack(80);
                    away.setMidfield(80);
                    away.setDefense(75);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Austria"))
                {
                    away.setName("Austria");
                    away.setAttack(79);
                    away.setMidfield(75);
                    away.setDefense(79);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Switzerland"))
                {
                    away.setName("Switzerland");
                    away.setAttack(77);
                    away.setMidfield(78);
                    away.setDefense(78);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Ghana"))
                {
                    away.setName("Ghana");
                    away.setAttack(81);
                    away.setMidfield(76);
                    away.setDefense(75);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Mexico"))
                {
                    away.setName("Mexico");
                    away.setAttack(79);
                    away.setMidfield(77);
                    away.setDefense(76);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Morocco"))
                {
                    away.setName("Morocco");
                    away.setAttack(79);
                    away.setMidfield(74);
                    away.setDefense(79);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Norway"))
                {
                    away.setName("Norway");
                    away.setAttack(82);
                    away.setMidfield(76);
                    away.setDefense(74);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Senegal"))
                {
                    away.setName("Senegal");
                    away.setAttack(79);
                    away.setMidfield(76);
                    away.setDefense(77);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Algeria"))
                {
                    away.setName("Algeria");
                    away.setAttack(77);
                    away.setMidfield(78);
                    away.setDefense(76);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Turkey"))
                {
                    away.setName("Turkey");
                    away.setAttack(77);
                    away.setMidfield(78);
                    away.setDefense(76);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Poland"))
                {
                    away.setName("Poland");
                    away.setAttack(80);
                    away.setMidfield(76);
                    away.setDefense(74);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Sweden"))
                {
                    away.setName("Sweden");
                    away.setAttack(79);
                    away.setMidfield(75);
                    away.setDefense(76);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Chile"))
                {
                    away.setName("Chile");
                    away.setAttack(76);
                    away.setMidfield(77);
                    away.setDefense(76);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Nigeria"))
                {
                    away.setName("Nigeria");
                    away.setAttack(80);
                    away.setMidfield(75);
                    away.setDefense(74);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Czech Republic")||awayTeamName.equalsIgnoreCase("Czechia"))
                {
                    away.setName("Czech Republic");
                    away.setAttack(79);
                    away.setMidfield(76);
                    away.setDefense(73);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Ecuador"))
                {
                    away.setName("Ecuador");
                    away.setAttack(75);
                    away.setMidfield(77);
                    away.setDefense(76);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Greece"))
                {
                    away.setName("Greece");
                    away.setAttack(75);
                    away.setMidfield(75);
                    away.setDefense(77);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Scotland"))
                {
                    away.setName("Scotland");
                    away.setAttack(73);
                    away.setMidfield(77);
                    away.setDefense(77);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Ukraine"))
                {
                    away.setName("Ukraine");
                    away.setAttack(76);
                    away.setMidfield(77);
                    away.setDefense(74);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("USA")||awayTeamName.equalsIgnoreCase("United States"))
                {
                    away.setName("USA");
                    away.setAttack(76);
                    away.setMidfield(76);
                    away.setDefense(75);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("DRC")||awayTeamName.equalsIgnoreCase("DR Congo")||awayTeamName.equalsIgnoreCase("Democratic Republic of the Congo"))
                {
                    away.setName("DR Congo");
                    away.setAttack(77);
                    away.setMidfield(74);
                    away.setDefense(74);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Japan"))
                {
                    away.setName("Japan");
                    away.setAttack(74);
                    away.setMidfield(77);
                    away.setDefense(74);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("South Korea"))
                {
                    away.setName("South Korea");
                    away.setAttack(78);
                    away.setMidfield(74);
                    away.setDefense(73);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Venezuela"))
                {
                    away.setName("Venezuela");
                    away.setAttack(78);
                    away.setMidfield(75);
                    away.setDefense(72);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Bosnia and Herzegovina"))
                {
                    away.setName("Bosnia and Herzegovina");
                    away.setAttack(77);
                    away.setMidfield(75);
                    away.setDefense(72);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Cameroon"))
                {
                    away.setName("Cameroon");
                    away.setAttack(74);
                    away.setMidfield(76);
                    away.setDefense(74);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Mali"))
                {
                    away.setName("Mali");
                    away.setAttack(75);
                    away.setMidfield(76);
                    away.setDefense(73);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Russia"))
                {
                    away.setName("Russia");
                    away.setAttack(76);
                    away.setMidfield(75);
                    away.setDefense(73);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Slovakia"))
                {
                    away.setName("Slovakia");
                    away.setAttack(73);
                    away.setMidfield(75);
                    away.setDefense(76);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Egypt"))
                {
                    away.setName("Egypt");
                    away.setAttack(73);
                    away.setMidfield(77);
                    away.setDefense(73);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Paraguay"))
                {
                    away.setName("Paraguay");
                    away.setAttack(74);
                    away.setMidfield(75);
                    away.setDefense(74);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Guinea"))
                {
                    away.setName("Guinea");
                    away.setAttack(74);
                    away.setMidfield(75);
                    away.setDefense(73);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Wales"))
                {
                    away.setName("Wales");
                    away.setAttack(75);
                    away.setMidfield(73);
                    away.setDefense(74);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Iran"))
                {
                    away.setName("Iran");
                    away.setAttack(76);
                    away.setMidfield(73);
                    away.setDefense(72);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("South Africa"))
                {
                    away.setName("South Africa");
                    away.setAttack(79);
                    away.setMidfield(72);
                    away.setDefense(70);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Albania"))
                {
                    away.setName("Albania");
                    away.setAttack(73);
                    away.setMidfield(73);
                    away.setDefense(74);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Costa Rica"))
                {
                    away.setName("Costa Rica");
                    away.setAttack(75);
                    away.setMidfield(72);
                    away.setDefense(73);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Cuba"))
                {
                    away.setName("Cuba");
                    away.setAttack(75);
                    away.setMidfield(72);
                    away.setDefense(73);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Hungary"))
                {
                    away.setName("Hungary");
                    away.setAttack(74);
                    away.setMidfield(72);
                    away.setDefense(73);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Slovenia"))
                {
                    away.setName("Slovenia");
                    away.setAttack(72);
                    away.setMidfield(74);
                    away.setDefense(73);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Burkina Faso"))
                {
                    away.setName("Burkina Faso");
                    away.setAttack(73);
                    away.setMidfield(72);
                    away.setDefense(73);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Canada"))
                {
                    away.setName("Canada");
                    away.setAttack(76);
                    away.setMidfield(72);
                    away.setDefense(70);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Kosovo"))
                {
                    away.setName("Kosovo");
                    away.setAttack(75);
                    away.setMidfield(71);
                    away.setDefense(72);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Angola"))
                {
                    away.setName("Angola");
                    away.setAttack(73);
                    away.setMidfield(70);
                    away.setDefense(74);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Gabon"))
                {
                    away.setName("Gabon");
                    away.setAttack(77);
                    away.setMidfield(72);
                    away.setDefense(68);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Australia"))
                {
                    away.setName("Australia");
                    away.setAttack(75);
                    away.setMidfield(71);
                    away.setDefense(70);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Ireland"))
                {
                    away.setName("Ireland");
                    away.setAttack(70);
                    away.setMidfield(73);
                    away.setDefense(73);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Montenegro"))
                {
                    away.setName("Montenegro");
                    away.setAttack(71);
                    away.setMidfield(70);
                    away.setDefense(75);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Peru"))
                {
                    away.setName("Peru");
                    away.setAttack(72);
                    away.setMidfield(73);
                    away.setDefense(71);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Romania"))
                {
                    away.setName("Romania");
                    away.setAttack(71);
                    away.setMidfield(73);
                    away.setDefense(71);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Cape Verde")||awayTeamName.equalsIgnoreCase("Cabo Verde"))
                {
                    away.setName("Cape Verde");
                    away.setAttack(75);
                    away.setMidfield(71);
                    away.setDefense(68);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Israel"))
                {
                    away.setName("Israel");
                    away.setAttack(74);
                    away.setMidfield(70);
                    away.setDefense(70);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Jamaica"))
                {
                    away.setName("Jamaica");
                    away.setAttack(74);
                    away.setMidfield(71);
                    away.setDefense(69);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Honduras"))
                {
                    away.setName("Honduras");
                    away.setAttack(73);
                    away.setMidfield(70);
                    away.setDefense(70);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Tunisia"))
                {
                    away.setName("Tunisia");
                    away.setAttack(71);
                    away.setMidfield(72);
                    away.setDefense(70);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("UAE")||awayTeamName.equalsIgnoreCase("United Arab Emirates"))
                {
                    away.setName("United Arab Emirates");
                    away.setAttack(74);
                    away.setMidfield(70);
                    away.setDefense(69);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Guinea-Bissau")||awayTeamName.equalsIgnoreCase("Guinea Bissau"))
                {
                    away.setName("Guinea-Bissau");
                    away.setAttack(72);
                    away.setMidfield(71);
                    away.setDefense(69);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Comoros"))
                {
                    away.setName("Comoros");
                    away.setAttack(66);
                    away.setMidfield(74);
                    away.setDefense(71);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Georgia"))
                {
                    away.setName("Georgia");
                    away.setAttack(72);
                    away.setMidfield(70);
                    away.setDefense(69);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Iceland"))
                {
                    away.setName("Iceland");
                    away.setAttack(71);
                    away.setMidfield(70);
                    away.setDefense(70);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Qatar"))
                {
                    away.setName("Qatar");
                    away.setAttack(73);
                    away.setMidfield(70);
                    away.setDefense(68);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Benin"))
                {
                    away.setName("Benin");
                    away.setAttack(71);
                    away.setMidfield(70);
                    away.setDefense(69);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Panama"))
                {
                    away.setName("Panama");
                    away.setAttack(71);
                    away.setMidfield(69);
                    away.setDefense(70);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Saudi Arabia"))
                {
                    away.setName("Saudi Arabia");
                    away.setAttack(68);
                    away.setMidfield(71);
                    away.setDefense(71);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Uzbekistan"))
                {
                    away.setName("Uzbekistan");
                    away.setAttack(72);
                    away.setMidfield(69);
                    away.setDefense(69);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Finland"))
                {
                    away.setName("Finland");
                    away.setAttack(70);
                    away.setMidfield(72);
                    away.setDefense(67);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("North Macedonia"))
                {
                    away.setName("North Macedonia");
                    away.setAttack(68);
                    away.setMidfield(71);
                    away.setDefense(70);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Northern Ireland"))
                {
                    away.setName("Northern Ireland");
                    away.setAttack(66);
                    away.setMidfield(71);
                    away.setDefense(72);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Zimbabwe"))
                {
                    away.setName("Zimbabwe");
                    away.setAttack(71);
                    away.setMidfield(67);
                    away.setDefense(71);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Republic of the Congo"))
                {
                    away.setName("Republic of the Congo");
                    away.setAttack(73);
                    away.setMidfield(69);
                    away.setDefense(66);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Mozambique"))
                {
                    away.setName("Mozambique");
                    away.setAttack(66);
                    away.setMidfield(70);
                    away.setDefense(71);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Suriname"))
                {
                    away.setName("Suriname");
                    away.setAttack(72);
                    away.setMidfield(65);
                    away.setDefense(70);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Armenia"))
                {
                    away.setName("Armenia");
                    away.setAttack(70);
                    away.setMidfield(70);
                    away.setDefense(66);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("China"))
                {
                    away.setName("China");
                    away.setAttack(69);
                    away.setMidfield(68);
                    away.setDefense(69);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("New Zealand"))
                {
                    away.setName("New Zealand");
                    away.setAttack(70);
                    away.setMidfield(68);
                    away.setDefense(68);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Philippines"))
                {
                    away.setName("Philippines");
                    away.setAttack(74);
                    away.setMidfield(68);
                    away.setDefense(64);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Belarus"))
                {
                    away.setName("Belarus");
                    away.setAttack(69);
                    away.setMidfield(68);
                    away.setDefense(68);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Bulgaria"))
                {
                    away.setName("Bulgaria");
                    away.setAttack(67);
                    away.setMidfield(69);
                    away.setDefense(69);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Togo"))
                {
                    away.setName("Togo");
                    away.setAttack(70);
                    away.setMidfield(67);
                    away.setDefense(68);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Kenya"))
                {
                    away.setName("Kenya");
                    away.setAttack(71);
                    away.setMidfield(66);
                    away.setDefense(67);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Sierra Leone"))
                {
                    away.setName("Sierra Leone");
                    away.setAttack(70);
                    away.setMidfield(65);
                    away.setDefense(69);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Zambia"))
                {
                    away.setName("Zambia");
                    away.setAttack(72);
                    away.setMidfield(69);
                    away.setDefense(63);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Haiti"))
                {
                    away.setName("Haiti");
                    away.setAttack(68);
                    away.setMidfield(66);
                    away.setDefense(69);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Cyprus"))
                {
                    away.setName("Cyprus");
                    away.setAttack(68);
                    away.setMidfield(67);
                    away.setDefense(67);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Equatorial Guinea"))
                {
                    away.setName("Equatorial Guinea");
                    away.setAttack(67);
                    away.setMidfield(68);
                    away.setDefense(67);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Ethiopia"))
                {
                    away.setName("Ethiopia");
                    away.setAttack(69);
                    away.setMidfield(65);
                    away.setDefense(67);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Curacao"))
                {
                    away.setName("Curacao");
                    away.setAttack(67);
                    away.setMidfield(69);
                    away.setDefense(64);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Dominican Republic"))
                {
                    away.setName("Dominican Republic");
                    away.setAttack(69);
                    away.setMidfield(63);
                    away.setDefense(68);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Madagascar"))
                {
                    away.setName("Madagascar");
                    away.setAttack(64);
                    away.setMidfield(68);
                    away.setDefense(68);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Uganda"))
                {
                    away.setName("Uganda");
                    away.setAttack(68);
                    away.setMidfield(66);
                    away.setDefense(66);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Central African Republic"))
                {
                    away.setName("Central African Republic");
                    away.setAttack(64);
                    away.setMidfield(69);
                    away.setDefense(66);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Kazakhstan"))
                {
                    away.setName("Kazakhstan");
                    away.setAttack(65);
                    away.setMidfield(68);
                    away.setDefense(66);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Liberia"))
                {
                    away.setName("Liberia");
                    away.setAttack(66);
                    away.setMidfield(67);
                    away.setDefense(66);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Luxembourg"))
                {
                    away.setName("Luxembourg");
                    away.setAttack(63);
                    away.setMidfield(70);
                    away.setDefense(66);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Bahrain"))
                {
                    away.setName("Bahrain");
                    away.setAttack(66);
                    away.setMidfield(68);
                    away.setDefense(64);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Oman"))
                {
                    away.setName("Oman");
                    away.setAttack(71);
                    away.setMidfield(64);
                    away.setDefense(63);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Azerbaijan"))
                {
                    away.setName("Azerbaijan");
                    away.setAttack(65);
                    away.setMidfield(66);
                    away.setDefense(66);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Bolivia"))
                {
                    away.setName("Bolivia");
                    away.setAttack(66);
                    away.setMidfield(66);
                    away.setDefense(65);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Iraq"))
                {
                    away.setName("Iraq");
                    away.setAttack(65);
                    away.setMidfield(68);
                    away.setDefense(64);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("North Korea"))
                {
                    away.setName("North Korea");
                    away.setAttack(67);
                    away.setMidfield(61);
                    away.setDefense(69);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Trinidad and Tobago"))
                {
                    away.setName("Trinidad and Tobago");
                    away.setAttack(66);
                    away.setMidfield(65);
                    away.setDefense(66);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Mauritania"))
                {
                    away.setName("Mauritania");
                    away.setAttack(65);
                    away.setMidfield(66);
                    away.setDefense(64);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Malawi"))
                {
                    away.setName("Malawi");
                    away.setAttack(71);
                    away.setMidfield(64);
                    away.setDefense(59);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Moldova"))
                {
                    away.setName("Moldova");
                    away.setAttack(63);
                    away.setMidfield(65);
                    away.setDefense(66);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Burundi"))
                {
                    away.setName("Burundi");
                    away.setAttack(64);
                    away.setMidfield(65);
                    away.setDefense(64);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Estonia"))
                {
                    away.setName("Estonia");
                    away.setAttack(63);
                    away.setMidfield(65);
                    away.setDefense(65);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Lebanon"))
                {
                    away.setName("Lebanon");
                    away.setAttack(64);
                    away.setMidfield(65);
                    away.setDefense(64);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Libya"))
                {
                    away.setName("Libya");
                    away.setAttack(62);
                    away.setMidfield(69);
                    away.setDefense(62);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Jordan"))
                {
                    away.setName("Jordan");
                    away.setAttack(63);
                    away.setMidfield(63);
                    away.setDefense(66);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Niger"))
                {
                    away.setName("Niger");
                    away.setAttack(64);
                    away.setMidfield(69);
                    away.setDefense(59);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Palestine"))
                {
                    away.setName("Palestine");
                    away.setAttack(64);
                    away.setMidfield(64);
                    away.setDefense(64);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Thailand"))
                {
                    away.setName("Thailand");
                    away.setAttack(64);
                    away.setMidfield(65);
                    away.setDefense(63);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Guatemala"))
                {
                    away.setName("Guatemala");
                    away.setAttack(65);
                    away.setMidfield(64);
                    away.setDefense(62);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Guyana"))
                {
                    away.setName("Guyana");
                    away.setAttack(63);
                    away.setMidfield(65);
                    away.setDefense(63);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Lithuania"))
                {
                    away.setName("Lithuania");
                    away.setAttack(65);
                    away.setMidfield(63);
                    away.setDefense(63);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Syria"))
                {
                    away.setName("Syria");
                    away.setAttack(65);
                    away.setMidfield(63);
                    away.setDefense(62);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Tanzania"))
                {
                    away.setName("Tanzania");
                    away.setAttack(65);
                    away.setMidfield(63);
                    away.setDefense(62);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Grenada"))
                {
                    away.setName("Grenada");
                    away.setAttack(62);
                    away.setMidfield(66);
                    away.setDefense(61);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Kuwait"))
                {
                    away.setName("Kuwait");
                    away.setAttack(64);
                    away.setMidfield(63);
                    away.setDefense(61);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Latvia"))
                {
                    away.setName("Latvia");
                    away.setAttack(66);
                    away.setMidfield(58);
                    away.setDefense(64);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Hong Kong"))
                {
                    away.setName("Hong Kong");
                    away.setAttack(66);
                    away.setMidfield(58);
                    away.setDefense(63);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Sudan"))
                {
                    away.setName("Sudan");
                    away.setAttack(64);
                    away.setMidfield(61);
                    away.setDefense(62);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("India"))
                {
                    away.setName("India");
                    away.setAttack(65);
                    away.setMidfield(60);
                    away.setDefense(61);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Martinique"))
                {
                    away.setName("Martinique");
                    away.setAttack(63);
                    away.setMidfield(62);
                    away.setDefense(61);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Vietnam"))
                {
                    away.setName("Vietnam");
                    away.setAttack(61);
                    away.setMidfield(63);
                    away.setDefense(62);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Antigua and Barbuda"))
                {
                    away.setName("Antigua and Barbuda");
                    away.setAttack(62);
                    away.setMidfield(61);
                    away.setDefense(61);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Turkmenistan"))
                {
                    away.setName("Turkmenistan");
                    away.setAttack(62);
                    away.setMidfield(61);
                    away.setDefense(61);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Botswana"))
                {
                    away.setName("Botswana");
                    away.setAttack(63);
                    away.setMidfield(62);
                    away.setDefense(58);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("El Salvador"))
                {
                    away.setName("El Salvador");
                    away.setAttack(62);
                    away.setMidfield(61);
                    away.setDefense(60);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Tahiti")||awayTeamName.equalsIgnoreCase("French Polynesia"))
                {
                    away.setName("Tahiti");
                    away.setAttack(63);
                    away.setMidfield(59);
                    away.setDefense(61);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Afghanistan"))
                {
                    away.setName("Afghanistan");
                    away.setAttack(61);
                    away.setMidfield(60);
                    away.setDefense(61);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Rwanda"))
                {
                    away.setName("Rwanda");
                    away.setAttack(59);
                    away.setMidfield(63);
                    away.setDefense(60);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("St Kitts and Nevis")||awayTeamName.equalsIgnoreCase("Saint Kitts and Nevis"))
                {
                    away.setName("St Kitts and Nevis");
                    away.setAttack(61);
                    away.setMidfield(61);
                    away.setDefense(60);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Chad"))
                {
                    away.setName("Chad");
                    away.setAttack(64);
                    away.setMidfield(60);
                    away.setDefense(57);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Lesotho"))
                {
                    away.setName("Lesotho");
                    away.setAttack(60);
                    away.setMidfield(60);
                    away.setDefense(60);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Malta"))
                {
                    away.setName("Malta");
                    away.setAttack(58);
                    away.setMidfield(63);
                    away.setDefense(59);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Namibia"))
                {
                    away.setName("Namibia");
                    away.setAttack(66);
                    away.setMidfield(55);
                    away.setDefense(59);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Faroe Islands"))
                {
                    away.setName("Faroe Islands");
                    away.setAttack(62);
                    away.setMidfield(59);
                    away.setDefense(58);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Montserrat"))
                {
                    away.setName("Montserrat");
                    away.setAttack(60);
                    away.setMidfield(61);
                    away.setDefense(58);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Tajikistan"))
                {
                    away.setName("Tajikistan");
                    away.setAttack(61);
                    away.setMidfield(59);
                    away.setDefense(58);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Malaysia"))
                {
                    away.setName("Malaysia");
                    away.setAttack(57);
                    away.setMidfield(59);
                    away.setDefense(61);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Kyrgyzstan"))
                {
                    away.setName("Kyrgyzstan");
                    away.setAttack(58);
                    away.setMidfield(60);
                    away.setDefense(58);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Puerto Rico"))
                {
                    away.setName("Puerto Rico");
                    away.setAttack(62);
                    away.setMidfield(53);
                    away.setDefense(61);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Taiwan"))
                {
                    away.setName("Taiwan");
                    away.setAttack(58);
                    away.setMidfield(62);
                    away.setDefense(56);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Indonesia"))
                {
                    away.setName("Indonesia");
                    away.setAttack(60);
                    away.setMidfield(57);
                    away.setDefense(58);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Liechtenstein"))
                {
                    away.setName("Liechtenstein");
                    away.setAttack(55);
                    away.setMidfield(61);
                    away.setDefense(60);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Singapore"))
                {
                    away.setName("Singapore");
                    away.setAttack(58);
                    away.setMidfield(57);
                    away.setDefense(59);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Sao Tome and Principe"))
                {
                    away.setName("Sao Tome and Principe");
                    away.setAttack(60);
                    away.setMidfield(55);
                    away.setDefense(58);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Gibraltar"))
                {
                    away.setName("Gibraltar");
                    away.setAttack(56);
                    away.setMidfield(58);
                    away.setDefense(58);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Bermuda"))
                {
                    away.setName("Bermuda");
                    away.setAttack(61);
                    away.setMidfield(55);
                    away.setDefense(55);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Nicaragua"))
                {
                    away.setName("Nicaragua");
                    away.setAttack(60);
                    away.setMidfield(55);
                    away.setDefense(56);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Barbados"))
                {
                    away.setName("Barbados");
                    away.setAttack(58);
                    away.setMidfield(53);
                    away.setDefense(59);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Mauritius"))
                {
                    away.setName("Mauritius");
                    away.setAttack(55);
                    away.setMidfield(58);
                    away.setDefense(57);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("St Vincent and the Grenadines")||awayTeamName.equalsIgnoreCase("St Vincent"))
                {
                    away.setName("St Vincent and the Grenadines");
                    away.setAttack(57);
                    away.setMidfield(57);
                    away.setDefense(56);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Aruba"))
                {
                    away.setName("Aruba");
                    away.setAttack(53);
                    away.setMidfield(57);
                    away.setDefense(58);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("New Caledonia"))
                {
                    away.setName("New Caledonia");
                    away.setAttack(55);
                    away.setMidfield(55);
                    away.setDefense(58);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("South Sudan"))
                {
                    away.setName("South Sudan");
                    away.setAttack(57);
                    away.setMidfield(56);
                    away.setDefense(55);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Yemen"))
                {
                    away.setName("Yemen");
                    away.setAttack(56);
                    away.setMidfield(57);
                    away.setDefense(55);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Andorra"))
                {
                    away.setName("Andorra");
                    away.setAttack(55);
                    away.setMidfield(55);
                    away.setDefense(57);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Guam"))
                {
                    away.setName("Guam");
                    away.setAttack(54);
                    away.setMidfield(58);
                    away.setDefense(55);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Papua New Guinea"))
                {
                    away.setName("Papua New Guinea");
                    away.setAttack(55);
                    away.setMidfield(57);
                    away.setDefense(55);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Fiji"))
                {
                    away.setName("Fiji");
                    away.setAttack(60);
                    away.setMidfield(52);
                    away.setDefense(54);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("St Lucia")||awayTeamName.equalsIgnoreCase("Saint Lucia"))
                {
                    away.setName("St Lucia");
                    away.setAttack(56);
                    away.setMidfield(52);
                    away.setDefense(58);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Belize"))
                {
                    away.setName("Belize");
                    away.setAttack(53);
                    away.setMidfield(60);
                    away.setDefense(52);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Eritrea"))
                {
                    away.setName("Eritrea");
                    away.setAttack(57);
                    away.setMidfield(57);
                    away.setDefense(51);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Pakistan"))
                {
                    away.setName("Pakistan");
                    away.setAttack(54);
                    away.setMidfield(55);
                    away.setDefense(56);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Eswatini"))
                {
                    away.setName("Eswatini");
                    away.setAttack(53);
                    away.setMidfield(55);
                    away.setDefense(56);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Laos"))
                {
                    away.setName("Laos");
                    away.setAttack(56);
                    away.setMidfield(55);
                    away.setDefense(53);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Somalia"))
                {
                    away.setName("Somalia");
                    away.setAttack(53);
                    away.setMidfield(58);
                    away.setDefense(53);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Solomon Islands"))
                {
                    away.setName("Solomon Islands");
                    away.setAttack(55);
                    away.setMidfield(54);
                    away.setDefense(54);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Bangladesh"))
                {
                    away.setName("Bangladesh");
                    away.setAttack(55);
                    away.setMidfield(54);
                    away.setDefense(52);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Nepal"))
                {
                    away.setName("Nepal");
                    away.setAttack(55);
                    away.setMidfield(53);
                    away.setDefense(53);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Dominica"))
                {
                    away.setName("Dominica");
                    away.setAttack(54);
                    away.setMidfield(52);
                    away.setDefense(54);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Bahamas"))
                {
                    away.setName("Bahamas");
                    away.setAttack(57);
                    away.setMidfield(50);
                    away.setDefense(52);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Maldives"))
                {
                    away.setName("Maldives");
                    away.setAttack(57);
                    away.setMidfield(55);
                    away.setDefense(46);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Seychelles"))
                {
                    away.setName("Seychelles");
                    away.setAttack(52);
                    away.setMidfield(54);
                    away.setDefense(52);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Sri Lanka"))
                {
                    away.setName("Sri Lanka");
                    away.setAttack(53);
                    away.setMidfield(51);
                    away.setDefense(54);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Bhutan"))
                {
                    away.setName("Bhutan");
                    away.setAttack(55);
                    away.setMidfield(52);
                    away.setDefense(49);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Myanmar")||awayTeamName.equalsIgnoreCase("Burma"))
                {
                    away.setName("Myanmar");
                    away.setAttack(55);
                    away.setMidfield(53);
                    away.setDefense(48);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Brunei"))
                {
                    away.setName("Brunei");
                    away.setAttack(53);
                    away.setMidfield(51);
                    away.setDefense(51);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Bonaire"))
                {
                    away.setName("Bonaire");
                    away.setAttack(55);
                    away.setMidfield(49);
                    away.setDefense(51);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Vanuatu"))
                {
                    away.setName("Vanuatu");
                    away.setAttack(50);
                    away.setMidfield(52);
                    away.setDefense(52);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Jersey"))
                {
                    away.setName("Jersey");
                    away.setAttack(51);
                    away.setMidfield(51);
                    away.setDefense(51);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Cayman Islands"))
                {
                    away.setName("Cayman Islands");
                    away.setAttack(51);
                    away.setMidfield(52);
                    away.setDefense(49);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Cambodia"))
                {
                    away.setName("Cambodia");
                    away.setAttack(53);
                    away.setMidfield(49);
                    away.setDefense(48);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Djibouti"))
                {
                    away.setName("Djibouti");
                    away.setAttack(52);
                    away.setMidfield(50);
                    away.setDefense(48);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Mongolia"))
                {
                    away.setName("Mongolia");
                    away.setAttack(53);
                    away.setMidfield(50);
                    away.setDefense(47);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("US Virgin Islands"))
                {
                    away.setName("US Virgin Islands");
                    away.setAttack(52);
                    away.setMidfield(50);
                    away.setDefense(48);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Sint Maarten"))
                {
                    away.setName("Sint Maarten");
                    away.setAttack(53);
                    away.setMidfield(48);
                    away.setDefense(49);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Saint Martin"))
                {
                    away.setName("Saint Martin");
                    away.setAttack(54);
                    away.setMidfield(52);
                    away.setDefense(53);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("San Marino"))
                {
                    away.setName("San Marino");
                    away.setAttack(51);
                    away.setMidfield(49);
                    away.setDefense(49);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Samoa"))
                {
                    away.setName("Samoa");
                    away.setAttack(51);
                    away.setMidfield(49);
                    away.setDefense(48);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Cook Islands"))
                {
                    away.setName("Cook Islands");
                    away.setAttack(50);
                    away.setMidfield(47);
                    away.setDefense(45);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Tonga"))
                {
                    away.setName("Tonga");
                    away.setAttack(46);
                    away.setMidfield(48);
                    away.setDefense(47);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Timor-Leste")||awayTeamName.equalsIgnoreCase("East Timor")||awayTeamName.equalsIgnoreCase("Timor Leste"))
                {
                    away.setName("Timor-Leste");
                    away.setAttack(53);
                    away.setMidfield(44);
                    away.setDefense(43);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Macau")||awayTeamName.equalsIgnoreCase("Macao"))
                {
                    away.setName("Macau");
                    away.setAttack(41);
                    away.setMidfield(51);
                    away.setDefense(46);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Turks and Caicos Islands"))
                {
                    away.setName("Turks and Caicos Islands");
                    away.setAttack(49);
                    away.setMidfield(43);
                    away.setDefense(43);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Guernsey"))
                {
                    away.setName("Guernsey");
                    away.setAttack(46);
                    away.setMidfield(45);
                    away.setDefense(44);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Anguilla"))
                {
                    away.setName("Anguilla");
                    away.setAttack(47);
                    away.setMidfield(44);
                    away.setDefense(43);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Greenland"))
                {
                    away.setName("Greenland");
                    away.setAttack(44);
                    away.setMidfield(44);
                    away.setDefense(44);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("British Virgin Islands"))
                {
                    away.setName("British Virgin Islands");
                    away.setAttack(45);
                    away.setMidfield(42);
                    away.setDefense(43);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Tuvalu"))
                {
                    away.setName("Tuvalu");
                    away.setAttack(43);
                    away.setMidfield(42);
                    away.setDefense(40);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("American Samoa"))
                {
                    away.setName("American Samoa");
                    away.setAttack(39);
                    away.setMidfield(42);
                    away.setDefense(41);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Northern Mariana Islands"))
                {
                    away.setName("Northern Mariana Islands");
                    away.setAttack(41);
                    away.setMidfield(37);
                    away.setDefense(40);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("St Pierre and Miquelon")||awayTeamName.equalsIgnoreCase("Saint Pierre and Miquelon"))
                {
                    away.setName("St Pierre and Miquelon");
                    away.setAttack(36);
                    away.setMidfield(38);
                    away.setDefense(36);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Saint Barthelemy")||awayTeamName.equalsIgnoreCase("St Barthelemy"))
                {
                    away.setName("Saint Barthelemy");
                    away.setAttack(36);
                    away.setMidfield(36);
                    away.setDefense(36);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Kiribati"))
                {
                    away.setName("Kiribati");
                    away.setAttack(31);
                    away.setMidfield(35);
                    away.setDefense(32);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Palau"))
                {
                    away.setName("Palau");
                    away.setAttack(31);
                    away.setMidfield(33);
                    away.setDefense(30);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Micronesia"))
                {
                    away.setName("Micronesia");
                    away.setAttack(29);
                    away.setMidfield(28);
                    away.setDefense(27);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Christmas Island"))
                {
                    away.setName("Christmas Island");
                    away.setAttack(26);
                    away.setMidfield(25);
                    away.setDefense(24);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("North Sentinel Island"))
                {
                    away.setName("North Sentinel Island");
                    away.setAttack(3);
                    away.setMidfield(3);
                    away.setDefense(3);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Monaco"))
                {
                    away.setName("Monaco");
                    away.setAttack(48);
                    away.setMidfield(49);
                    away.setDefense(55);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Vatican City")||awayTeamName.equalsIgnoreCase("Vatican")||awayTeamName.equalsIgnoreCase("Holy See"))
                {
                    away.setName("Vatican City");
                    away.setAttack(31);
                    away.setMidfield(30);
                    away.setDefense(29);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Isle of Man"))
                {
                    away.setName("Isle of Man");
                    away.setAttack(52);
                    away.setMidfield(52);
                    away.setDefense(51);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Niue"))
                {
                    away.setName("Niue");
                    away.setAttack(15);
                    away.setMidfield(13);
                    away.setDefense(10);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Pitcairn Islands")||awayTeamName.equalsIgnoreCase("Pitcairn"))
                {
                    away.setName("Pitcairn Islands");
                    away.setAttack(15);
                    away.setMidfield(11);
                    away.setDefense(13);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Andaman and Nicobar Islands")||awayTeamName.equalsIgnoreCase("Andaman and Nicobar"))
                {
                    away.setName("Andaman and Nicobar Islands");
                    away.setAttack(32);
                    away.setMidfield(29);
                    away.setDefense(32);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("South Georgia and the South Sandwich Islands")||awayTeamName.equalsIgnoreCase("SGSSI"))
                {
                    away.setName("SGSSI");
                    away.setAttack(6);
                    away.setMidfield(5);
                    away.setDefense(11);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("French Guiana"))
                {
                    away.setName("French Guiana");
                    away.setAttack(59);
                    away.setMidfield(56);
                    away.setDefense(59);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Norfolk Island"))
                {
                    away.setName("Norfolk Island");
                    away.setAttack(25);
                    away.setMidfield(25);
                    away.setDefense(25);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Saint Helena")||awayTeamName.equalsIgnoreCase("St Helena"))
                {
                    away.setName("Saint Helena");
                    away.setAttack(30);
                    away.setMidfield(25);
                    away.setDefense(20);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Tristan da Cunha")||awayTeamName.equalsIgnoreCase("Tristan"))
                {
                    away.setName("Tristan da Cunha");
                    away.setAttack(10);
                    away.setMidfield(15);
                    away.setDefense(10);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Reunion"))
                {
                    away.setName("Reunion");
                    away.setAttack(59);
                    away.setMidfield(62);
                    away.setDefense(61);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else if(awayTeamName.equalsIgnoreCase("Guadeloupe"))
                {
                    away.setName("Guadeloupe");
                    away.setAttack(56);
                    away.setMidfield(51);
                    away.setDefense(53);
                    awayTeamName=away.getName();
                    awayAttack=away.getAttack();
                    awayMidfield=away.getMidfield();
                    awayDefense=away.getDefense();
                }
                else
                {
                    System.out.println("Team not recognized. Please enter stats.");
                    System.out.print("ATT: ");
                    awayAttack=sc.nextDouble();
                    sc.nextLine();
                    System.out.print("MID: ");
                    awayMidfield=sc.nextDouble();
                    sc.nextLine();
                    System.out.print("DEF: ");
                    awayDefense=sc.nextDouble();
                    sc.nextLine();
                    away.setName(awayTeamName);
                    away.setAttack(awayAttack);
                    away.setMidfield(awayMidfield);
                    away.setDefense(awayDefense);
                }
                System.out.println("Away: "+away);
                System.out.println();
                System.out.print("Home advantage? The greater the number, the greater the advantage.");
                double homeAdv=sc.nextDouble();
                sc.nextLine();
                System.out.print("Play extra time if tied? (true or false)");
                boolean extraTime=sc.nextBoolean();
                sc.nextLine();
                //team overalls
                double homeOverall=(homeAttack+homeMidfield+homeDefense)/3;
                double awayOverall=(awayAttack+awayMidfield+awayDefense)/3;
                //chance probabilities per minute
                double homeChanceProb=(homeMidfield/(homeMidfield+awayMidfield)*(homeMidfield/2.5));
                homeChanceProb=homeChanceProb+homeAdv+((homeOverall-awayOverall)/7);
                if(homeChanceProb<1)
                {
                    homeChanceProb=1;
                }
                if(homeChanceProb>55)
                {
                    homeChanceProb=55;
                }
                double awayChanceProb=(awayMidfield/(homeMidfield+awayMidfield)*(awayMidfield/2.5));
                awayChanceProb=awayChanceProb-homeAdv+((awayOverall-homeOverall)/7);
                if(awayChanceProb<1)
                {
                    awayChanceProb=1;
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
                System.out.println(homeTeamName+" vs. "+awayTeamName);
                System.out.println();
                System.out.println("The game has kicked off!");
                for(int i=1;i<=45;i++)
                {
                    System.out.println(minute+"'");
                    if(Math.random()*(100-1+1)+1 <=homeChanceProb)//home team gets a chance
                    {
                        if(Math.random()*(100-1+1)+1 <= homeGoalProb)//home team scores
                        {
                        	homeGoals++;
                            homeChances++;
                            firstHalfStoppage++;
                        	System.out.println("Goal for "+homeTeamName+"! ("+homeGoals+"-"+awayGoals+")");
                        }
                        else//home team misses chance
                        {
                            System.out.println("Chance missed by "+homeTeamName);
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
                            	System.out.println("Goal for "+awayTeamName+"! ("+homeGoals+"-"+awayGoals+")");
                            }
                            else//away team misses chance
                            {
                                System.out.println("Chance missed by "+awayTeamName);
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
                for(int i=1;i<=firstHalfStoppage;i++)
                {
                	System.out.println("45+"+i+"'");
                    if(Math.random()*(100-1+1)+1 <=homeChanceProb)//home team gets a chance
                    {
                        if(Math.random()*(100-1+1)+1 <= homeGoalProb)//home team scores
                        {
                        	homeGoals++;
                            homeChances++;
                        	System.out.println("Goal for "+homeTeamName+"! ("+homeGoals+"-"+awayGoals+")");
                        }
                        else//home team misses chance
                        {
                            System.out.println("Chance missed by "+homeTeamName);
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
                            	System.out.println("Goal for "+awayTeamName+"! ("+homeGoals+"-"+awayGoals+")");
                            }
                            else//away team misses chance
                            {
                                System.out.println("Chance missed by "+awayTeamName);
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
                System.out.println(homeTeamName+" "+homeGoals+"-"+awayGoals+" "+awayTeamName);
                System.out.println(homeTeamName+": "+homeChances+" shots"+"\t"+awayTeamName+": "+awayChances+" shots");
                System.out.println();
                System.out.println("The second half has kicked off!");
                for(int i=46;i<=90;i++)
                {
                    System.out.println(minute+"'");
                    if(Math.random()*(100-1+1)+1 <=homeChanceProb)//home team gets a chance
                    {
                        if(Math.random()*(100-1+1)+1 <= homeGoalProb)//home team scores
                        {
                        	homeGoals++;
                            homeChances++;
                            secondHalfStoppage++;
                        	System.out.println("Goal for "+homeTeamName+"! ("+homeGoals+"-"+awayGoals+")");
                        }
                        else//home team misses chance
                        {
                            System.out.println("Chance missed by "+homeTeamName);
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
                            	System.out.println("Goal for "+awayTeamName+"! ("+homeGoals+"-"+awayGoals+")");
                            }
                            else//away team misses chance
                            {
                                System.out.println("Chance missed by "+awayTeamName);
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
                for(int i=1;i<=secondHalfStoppage;i++)
                {
                	System.out.println("90+"+i+"'");
                    if(Math.random()*(100-1+1)+1 <=homeChanceProb)//home team gets a chance
                    {
                        if(Math.random()*(100-1+1)+1 <= homeGoalProb)//home team scores
                        {
                        	homeGoals++;
                            homeChances++;
                        	System.out.println("Goal for "+homeTeamName+"! ("+homeGoals+"-"+awayGoals+")");
                        }
                        else//home team misses chance
                        {
                            System.out.println("Chance missed by "+homeTeamName);
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
                            	System.out.println("Goal for "+awayTeamName+"! ("+homeGoals+"-"+awayGoals+")");
                            }
                            else//away team misses chance
                            {
                                System.out.println("Chance missed by "+awayTeamName);
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
                if(extraTime==false || (extraTime==true && homeGoals!=awayGoals))
                {
                    System.out.println("Full-time");
                    System.out.println(homeTeamName+" "+homeGoals+"-"+awayGoals+" "+awayTeamName);
                    System.out.println(homeTeamName+": "+homeChances+" shots"+"\t"+awayTeamName+": "+awayChances+" shots");
                }
                else if(extraTime==true && homeGoals==awayGoals)
                {
                    System.out.println("End of regulation");
                    System.out.println(homeTeamName+" "+homeGoals+"-"+awayGoals+" "+awayTeamName);
                    System.out.println(homeTeamName+": "+homeChances+" shots"+"\t"+awayTeamName+": "+awayChances+" shots");
                    for(int i=91;i<=120;i++)
                    {
                        System.out.println(minute+"'");
                        if(Math.random()*(100-1+1)+1 <= homeChanceProb)//home team gets a chance
                        {
                            if(Math.random()*(100-1+1)+1 <= homeGoalProb)//home team scores
                            {
                            	homeGoals++;
                                homeChances++;
                            	System.out.println("Goal for "+homeTeamName+"! ("+homeGoals+"-"+awayGoals+")");
                            }
                            else//home team misses chance
                            {
                                System.out.println("Chance missed by "+homeTeamName);
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
                                	System.out.println("Goal for "+awayTeamName+"! ("+homeGoals+"-"+awayGoals+")");
                                }
                                else//away team misses chance
                                {
                                    System.out.println("Chance missed by "+awayTeamName);
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
                    System.out.println(homeTeamName+" "+homeGoals+"-"+awayGoals+" "+awayTeamName);
                    System.out.println(homeTeamName+": "+homeChances+" shots"+"     "+awayTeamName+": "+awayChances+" shots");
                }
                // ask if user wants to continue
                System.out.print("Press any key to continue. Press E to exit.");
                input=sc.nextLine();
                if(input.equalsIgnoreCase(exit))
                {
                    x=false;
                }
                else
                {
                    x=true;
                }
            }
            catch(Exception e)
            {
                System.out.println("Please enter a valid value.");
                System.out.println();
            }
        }
        System.out.println("Loop ended");
    }
}
class Team
{
    private String name;
    private double attack;
    private double midfield;
    private double defense;
    public Team()//default constructor
    {
        
    }
    public Team(String name,double attack,double midfield,double defense)//overloaded constructor
    {
        this.name=name;
        this.attack=attack;
        this.midfield=midfield;
        this.defense=defense;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAttack(double attack)
    {
        this.attack=attack;
    }
    public void setMidfield(double midfield)
    {
        this.midfield=midfield;
    }
    public void setDefense(double defense)
    {
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
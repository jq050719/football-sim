package V1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class HomeScreen extends Frame implements ActionListener
{   
    Button singlePlayer;//button to play vs BOT
    Button multiplayer;//button to play vs human opponent
    String msg="";
    public boolean singlePlayerSelected;
    public boolean multiplayerSelected;
    public HomeScreen()
    {
        singlePlayer=new Button("1 Player");
        add(singlePlayer);
        multiplayer=new Button("2 Player");
        add(multiplayer);
        //connecting buttons to action listener
        singlePlayer.addActionListener(this);
        multiplayer.addActionListener(this);
        setSize(500,500);
        setLocationRelativeTo(null);//centre the frame on the screen
        setLayout(new FlowLayout());
        setVisible(true);
    }
    //action performed method
    public void actionPerformed(ActionEvent e)
    {
        String s=e.getActionCommand();
        if(s.equals("1 Player"))
        {
            singlePlayerSelected=true;
            dispose();
            new TeamSelect();
        }
        if(s.equals("2 Player"))
        {
            multiplayerSelected=true;
            dispose();
            new TeamSelect();
        }
    }
    //paint method
    public void paint(Graphics g)
    {
        
    }
}

class TeamSelect extends Frame implements ActionListener
{   
    Button premierLeague;
    Button laLiga;
    Button bundesliga;
    Button ligue1;
    Button serieA;
    String msg="";
    boolean premierLeagueSelected;
    boolean laLigaSelected;
    boolean bundesligaSelected;
    boolean ligue1Selected;
    boolean serieASelected;
    public TeamSelect()
    {
        premierLeague=new Button("Premier League");
        add(premierLeague);
        laLiga=new Button("La Liga");
        add(laLiga);
        bundesliga=new Button("Bundesliga");
        add(bundesliga);
        ligue1=new Button("Ligue 1");
        add(ligue1);
        serieA=new Button("Serie A");
        add(serieA);
        //connecting buttons to action listener
        premierLeague.addActionListener(this);
        laLiga.addActionListener(this);
        bundesliga.addActionListener(this);
        ligue1.addActionListener(this);
        serieA.addActionListener(this);
        setSize(500,500);
        setLocationRelativeTo(null);//centre the frame on the screen
        setLayout(new FlowLayout());
        setVisible(true);
    }
    //action performed method
    public void actionPerformed(ActionEvent e)
    {
        String s=e.getActionCommand();
        if(s.equals("Premier League"))
        {
            premierLeagueSelected=true;
            dispose();
            new PremierLeague();
        }
        if(s.equals("La Liga"))
        {
            Graphics g=getGraphics();
            g.drawString("Select La Liga team",100,100);
            laLigaSelected=true;
        }
        if(s.equals("Bundesliga"))
        {
            Graphics g=getGraphics();
            g.drawString("Select Bundesliga team",100,100);
            bundesligaSelected=true;
        }
        if(s.equals("Ligue 1"))
        {
            Graphics g=getGraphics();
            g.drawString("Select Ligue 1 team",100,100);
            ligue1Selected=true;
        }
        if(s.equals("Serie A"))
        {
            Graphics g=getGraphics();
            g.drawString("Select Serie A team",100,100);
            serieASelected=true;
        }
    }
    //paint method
    public void paint(Graphics g)
    {
        
    }
}

class PremierLeague extends Frame implements ActionListener
{   
    Button arsenal;
    Button astonVilla;
    Button bournemouth;
    Button brentford;
    Button brighton;
    Button burnley;
    Button chelsea;
    Button crystalPalace;
    Button everton;
    Button fulham;
    Button liverpool;
    Button lutonTown;
    Button manCity;
    Button manUnited;
    Button newcastle;
    Button nottinghamForest;
    Button sheffieldUnited;
    Button tottenham;
    Button westHam;
    Button wolves;
    public PremierLeague()
    {
        arsenal=new Button("Arsenal");
        add(arsenal);
        astonVilla=new Button("Aston Villa");
        add(astonVilla);
        bournemouth=new Button("Bournemouth");
        add(bournemouth);
        brentford=new Button("Brentford");
        add(brentford);
        brighton=new Button("Brighton");
        add(brighton);
        burnley=new Button("Burnley");
        add(burnley);
        chelsea=new Button("Chelsea");
        add(chelsea);
        crystalPalace=new Button("Crystal Palace");
        add(crystalPalace);
        everton=new Button("Everton");
        add(everton);
        fulham=new Button("Fulham");
        add(fulham);
        liverpool=new Button("Liverpool");
        add(liverpool);
        lutonTown=new Button("Luton Town");
        add(lutonTown);
        manCity=new Button("Manchester City");
        add(manCity);
        manUnited=new Button("Manchester United");
        add(manUnited);
        newcastle=new Button("Newcastle");
        add(newcastle);
        nottinghamForest=new Button("Nottingham Forest");
        add(nottinghamForest);
        sheffieldUnited=new Button("Sheffield United");
        add(sheffieldUnited);
        tottenham=new Button("Tottenham");
        add(tottenham);
        westHam=new Button("West Ham");
        add(westHam);
        wolves=new Button("Wolves");
        add(wolves);
        //connecting buttons to action listener
        arsenal.addActionListener(this);
        astonVilla.addActionListener(this);
        bournemouth.addActionListener(this);
        brentford.addActionListener(this);
        brighton.addActionListener(this);
        burnley.addActionListener(this);
        chelsea.addActionListener(this);
        crystalPalace.addActionListener(this);
        everton.addActionListener(this);
        fulham.addActionListener(this);
        liverpool.addActionListener(this);
        lutonTown.addActionListener(this);
        manCity.addActionListener(this);
        manUnited.addActionListener(this);
        newcastle.addActionListener(this);
        nottinghamForest.addActionListener(this);
        sheffieldUnited.addActionListener(this);
        tottenham.addActionListener(this);
        westHam.addActionListener(this);
        wolves.addActionListener(this);
        setSize(500,500);
        setLocationRelativeTo(null);//centre the frame on the screen
        setLayout(new FlowLayout());
        setVisible(true);
    }
    //action performed method
    public void actionPerformed(ActionEvent e)
    {
        String s=e.getActionCommand();
        if(s.equals("Arsenal"))
        {
            Graphics g=getGraphics();
            g.drawString("Arsenal selected",100,100);
        }
        if(s.equals("Aston Villa"))
        {
            Graphics g=getGraphics();
            g.drawString("Aston Villa selected",100,100);
        }
        if(s.equals("Bournemouth"))
        {
            Graphics g=getGraphics();
            g.drawString("Bournemouth selected",100,100);
        }
        if(s.equals("Brentford"))
        {
            Graphics g=getGraphics();
            g.drawString("Brentford selected",100,100);
        }
        if(s.equals("Brighton"))
        {
            Graphics g=getGraphics();
            g.drawString("Brighton selected",100,100);
        }
        if(s.equals("Burnley"))
        {
            Graphics g=getGraphics();
            g.drawString("Burnley selected",100,100);
        }
        if(s.equals("Chelsea"))
        {
            Graphics g=getGraphics();
            g.drawString("Chelsea selected",100,100);
        }
        if(s.equals("Crystal Palace"))
        {
            Graphics g=getGraphics();
            g.drawString("Crystal Palace selected",100,100);
        }
        if(s.equals("Everton"))
        {
            Graphics g=getGraphics();
            g.drawString("Everton selected",100,100);
        }
        if(s.equals("Fulham"))
        {
            Graphics g=getGraphics();
            g.drawString("Fulham selected",100,100);
        }
        if(s.equals("Liverpool"))
        {
            Graphics g=getGraphics();
            g.drawString("Liverpool selected",100,100);
        }
        if(s.equals("Luton Town"))
        {
            Graphics g=getGraphics();
            g.drawString("Luton Town selected",100,100);
        }
        if(s.equals("Manchester City"))
        {
            Graphics g=getGraphics();
            g.drawString("Manchester City selected",100,100);
        }
        if(s.equals("Manchester United"))
        {
            Graphics g=getGraphics();
            g.drawString("Manchester United selected",100,100);
        }
        if(s.equals("Newcastle"))
        {
            Graphics g=getGraphics();
            g.drawString("Newcastle selected",100,100);
        }
        if(s.equals("Nottingham Forest"))
        {
            Graphics g=getGraphics();
            g.drawString("Nottingham Forest selected",100,100);
        }
        if(s.equals("Sheffield United"))
        {
            Graphics g=getGraphics();
            g.drawString("Sheffield United selected",100,100);
        }
        if(s.equals("Tottenham"))
        {
            Graphics g=getGraphics();
            g.drawString("Tottenham selected",100,100);
        }
        if(s.equals("West Ham"))
        {
            Graphics g=getGraphics();
            g.drawString("West Ham selected",100,100);
        }
        if(s.equals("Wolves"))
        {
            Graphics g=getGraphics();
            g.drawString("Wolves selected",100,100);
        }
    }
    //paint method
    public void paint(Graphics g)
    {
        
    }
}

public class HomeScreenTester
{
    public static void main(String[]args)
    {
        new HomeScreen();
    }
}
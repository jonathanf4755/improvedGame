import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Battle implements Location
{
    private String nameOfBattle;
    private String descOfFoe;
    private List<String> skillsAllowed;
    private String enemyName;
    private int enemytHealth;
    private List<Skill> enemySkills;
    private String nextLocation;
    
    public Battle(String nameBatt, String foeName, String foeDesc, List<String> skillsAvail, int eHealth, List<Skill> enemySkillsAvail) throws IllegalArgumentException
    {
        nameOfBattle = nameBatt;
        descOfFoe = foeDesc;
        enemyName = foeName;
        skillsAllowed = skillsAvail;
        enemySkills = enemySkillsAvail;
        if(eHealth <= 0)
        {
            throw new IllegalArgumentException("Please use a positive value of health");
        }
        else
        {
            enemytHealth = eHealth;
        }
    }
    
    /**
     * Gets the name of the location in the text adventure game.
     * Every location in a {@link Game} should have a unique name so that an
     * {@link Engine} can properly track the state of the game.
     *
     * @return a unique identifier for each level
     */
    public String getName()
    {
        return nameOfBattle;
    }

    /**
     * Causes the {@link Player} to enter the location and returns
     * the name of the next game location.
     *
     * @param p the {@link Player} entering the location
     * @return the name of the next location
     * @throws InterruptedException if the game is paused and gets interrupted
     */
    public String enter(Player p) throws InterruptedException
    {
        Print a = new Print();
        Scanner sc = new Scanner(System.in);
        a = new Print(1000, "You encounter a\n" + enemyName + "\n" + descOfFoe + "\nYou must fight!\n");
        a.printLetterByLetter();
        fightTheEnemy(p);
        return null;
    }
    
    private void fightTheEnemy(Player p) throws InterruptedException
    {
        Print a = new Print();
        Scanner sc = new Scanner(System.in);
        while(p.getHealth() > 0 && enemytHealth > 0)
        {
            a = new Print(1000, "Here are your available Skills:\n");
            a.printLetterByLetter();
            for(int i = 0; i < skillsAllowed.size(); i++)
            {
                a = new Print(1000, skillsAllowed.get(i) + " " + i + "\n");
                a.printLetterByLetter();
            }
        }
    }
    
    private int changeEnemyHealth(int delta)
    {
        return enemytHealth = enemytHealth + delta;
    }
}

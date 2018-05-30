
/**
 * Write a description of class Jonathan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jonathan implements Player
{
    private int health;
    private Inventory inv;
    public ItemSkill availableSkills;
    
    public Jonathan(int Health)
    {
        inv = new Pouch();
        Skill fight = new Skill(20, "Allows you to hit an enemy", "fight", 4, 1);
        Skill dodge = new Skill(0, "Allows you to dodge an enemy attack", "dodge", 2, 0);
        Skill[] listOfSkills = new Skill[2];
        listOfSkills[0] = fight;
        listOfSkills[1] = dodge;
        availableSkills = new ItemSkill(listOfSkills);
    }
    
    /**
     * Gets the health of the player.
     *
     * @return the numeric health of the player
     */
    public int getHealth()
    {
        return health;
    }

    /**
     * Changes the health of the player.
     *
     * @param delta the numeric change to the health of the player
     */
    public void changeHealth(int delta)
    {
        health = health + delta;
    }

    public Inventory getInventory()
    {
        return inv;
    }
}

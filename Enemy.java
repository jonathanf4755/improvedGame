
public class Enemy
{
    private String name;
    private int health;
    Inventory inv;
    public static ItemSkill ITEM_SKILLS;
    
    public Enemy(String nme, int h)
    {
        name = nme;
        health = h;
        inv = new Pouch();
    }

    public String getEnemyName()
    {
        return this.name;   
    }
    
    public int getEnemyHealth()
    {
        return this.health;
    }
    
    public int changeEnemyHealth(int delta)
    {
        return health = health + delta;
    }
    
    public Inventory getEnemyInventory()
    {
        return this.inv;
    }
}

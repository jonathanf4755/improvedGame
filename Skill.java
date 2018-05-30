public class Skill
{
    private int damage;
    private String skillName;
    private String skillDescription;
    private int missPercentage;
    private int critPercentage;
    
    public Skill(int dmg, String desc, String name, int miss, int crit)
    {
       damage = dmg;
       skillName = name;
       skillDescription = desc;
       missPercentage = miss;
       critPercentage = crit;
    }
    
    public int getDamage()
    {
        return this.damage;
    }
    
    public String getSkillName()
    {
        return this.skillName;
    }
    
    public String getSkillDescription()
    {
        return this.skillDescription;
    }
    
    public int getMissPercentage()
    {
        return this.missPercentage;
    }
    
    public int getCritPercentage()
    {
        return this.critPercentage;
    }
    
    public void changeDamage(int num) throws IllegalArgumentException
    {
        if(num >= 0)
        {
            damage = num;
        }
        else
        {
            throw new IllegalArgumentException("Damage cannot be changed, please use a valid number");
        }
    }
    
    public void changeCritOrMiss(int num, String stat) throws IllegalArgumentException
    {
        stat = stat.toLowerCase();
        if(stat.equals("mp") && num >= 0.0)
        {
            missPercentage = num;
        }
        else if(stat.equals("cp") && num >= 0.0)
        {
            critPercentage = num;
        }
        else
        {
            throw new IllegalArgumentException("Damage cannot be changed, please use a valid decimal number");
        }
    }
    }
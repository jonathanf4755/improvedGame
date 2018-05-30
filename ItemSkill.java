public class ItemSkill extends Item
{
    private Skill[] listOfSkills;
    private String name;
    private String description;
    private int count;
    public ItemSkill(Skill[] sk)
    {
        listOfSkills = sk;
        name = "These are your available actions";
        count = sk.length;
        for(int i = 0; i < sk.length; i++)
        {
            description = description + sk[i].getSkillName() + ":" + (i + 1) + " " ;
        } 
    }
    
    /**
     * Gets the name of the item in the text adventure game.
     *
     * @return the name of the item
     */
    public String getName()
    {
        return name;
    }

    /**
     * Gets the description of the item in the text adventure game.
     *
     * @return the description of the item     
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Gets the count of how many instances of the item there are. 
     * For example, a pack of gum item might have 5 pieces of gum.
     *
     * @return the number of instances in this item
     */
    public int getCount()
    {
        return count;
    }

    /**
     * Uses a positive number of instances of the item. 
     *
     * @param positiveNum a positive number of items to use
     * @throws IllegalArgumentException if positive num is non-positive OR
     *         exceeds the count of instances of the item
     */
    public void use(int positiveNum) throws IllegalArgumentException
    {
        boolean isMoreThanCount = positiveNum > this.count;
        boolean isNotPositive = positiveNum <= 0;;
        if(isNotPositive ||isMoreThanCount)
        {
            throw new IllegalArgumentException(
                "ItemSkill cannot use: " + positiveNum
            );
        }
        this.count -= positiveNum;
    }
    
    @Override
    public void combine(Item sameKind) throws IllegalArgumentException{
        super.combine(sameKind);
        //this.count += sameKind.getCount();
    }

    public Skill getSkill(int num)
    {
        return listOfSkills[num];
    }
    
}

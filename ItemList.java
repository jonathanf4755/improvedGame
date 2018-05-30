/**
 * Write a description of class ItemList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ItemList extends Item
{
    private int count;
    private String name;
    private String description;
    
    public ItemList(int c, String n)
    {
        count = c;
        name = n;
        description = "This is a list of your items throughtout the game:";
    }
    
      /**
     * Gets the name of the item in the text adventure game.
     *
     * @return the name of the item
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Gets the description of the item in the text adventure game.
     *
     * @return the description of the item     
     */
    public String getDescription()
    {
        return this.description;
    }

    /**
     * Gets the count of how many instances of the item there are. 
     * For example, a pack of gum item might have 5 pieces of gum.
     *
     * @return the number of instances in this item
     */
    public int getCount()
    {
        return this.count;
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
        boolean isNotPositive = positiveNum <= 0;
        boolean isMoreThanCount = positiveNum > this.count;
        if(isNotPositive || isMoreThanCount)
        {
            throw new IllegalArgumentException(
                "ItemList cannot use: " + positiveNum
            );
        }
        this.count -= positiveNum;
        
    }
   
    public void addDescription(Item i)
    {
        description = description + "\n" + i.getName();
    }
    
    @Override
    public void combine(Item sameKind) throws IllegalArgumentException{
        super.combine(sameKind);
        this.count += sameKind.getCount();
    }
}
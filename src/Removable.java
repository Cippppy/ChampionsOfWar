public interface Removable 
{
    public default void remove(Character character, Item item)
    {
        if(character != null && item != null)
        {
                System.out.println("removing");
        }
        else
        {
            System.out.println("Error: The input is invalid.");
        }
    }
}

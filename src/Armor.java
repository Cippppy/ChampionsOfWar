public class Armor extends Item implements Equipable, Removable
{

    public Armor(String name, int effectOnHealth)
    {
            super(name, effectOnHealth);
    }

    @Override
    public void use(Character character, Item item)
    {
        if(character != null && item != null)
        {
            System.out.println(item.getItemName() + " used on " + character.toString());
            equip(character, item);
        }
        else
        {
            System.out.println("Error: The input is invalid.");
        }
    }
}

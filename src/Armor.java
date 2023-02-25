public class Armor extends Item implements Equipable, Removable
{

    public Armor(String name, int effectOnHealth)
    {
            super(name, effectOnHealth);
    }

    @Override
    public void use(Character character, Item item)
    {
        equip(character, item);
    }

}

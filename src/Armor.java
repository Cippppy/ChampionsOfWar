public class Armor extends Item implements Equipable, Removable
{
    public Armor(String name, int effectOnHealth, String otherInfo)
    {
            super(name, effectOnHealth, otherInfo);
    }

    @Override
    public void use(Character character, Item item)
    {
        super.use(character, item);
        equip(character, item);
    }
}


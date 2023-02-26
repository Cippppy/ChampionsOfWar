public class Weapon extends Item implements Equipable, Removable
{
    public Weapon (String name, int effectOnHealth, String otherInfo)
    {
            super(name, effectOnHealth, otherInfo);
    }
}
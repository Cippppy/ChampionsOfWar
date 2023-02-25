public class Driver 
{
    private static Character godwin = new Character("Godwin", 30);
    private static Character marilyn = new Character("Marilyn", 40);
    private static Item widowsCLoak = new Armor("Widow's Cloak", 15);
    private static Item gladiatorsShield = new Armor("Gladiator's Shield", 8);
    private static Item rustyKnife = new Weapon("Rusty Knife", -3);
    private static Item protectionSpell = new Spell("Protection Spell", 1, "Goddess of the day and night, protect me with all your might");
    private static Item noteFromZelda = new Letter("Note From Zelda", 0, "Beware of the Witch");

    public static void main(String[] args)
    {
        System.out.println("** " + godwin.getName() + " and " + marilyn.getName() + " add items to their bags.\n");
        godwin.addToBag(noteFromZelda);
        marilyn.addToBag(noteFromZelda);
        godwin.addToBag(protectionSpell);
        marilyn.addToBag(widowsCLoak);
        godwin.addToBag(gladiatorsShield);
        marilyn.addToBag(rustyKnife);

        System.out.println("\n** Godwin and Marilyn Battle");
        godwin.use(godwin, protectionSpell);
        marilyn.use(godwin, rustyKnife);
        godwin.use(godwin, gladiatorsShield);
        marilyn.use(godwin, rustyKnife);
    }
}

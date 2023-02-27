public class Driver 
{
    private static String nullString;
    private static int nullInt;
    private static Character godwin = new Character("Godwin", 30);
    private static Character marilyn = new Character("Marilyn", 40);
    private static Item widowsCloak = new Armor("Widow's Cloak", 15, "");
    private static Item gladiatorsShield = new Armor("Gladiator's Shield", 8, "");
    private static Item rustyKnife = new Weapon("Rusty Knife", -3, "");
    private static Item protectionSpell = new Spell("Protection Spell", 1, "has magic words that can be read", "Goddess of the day and night, protect me with all your might");
    private static Item noteFromZelda = new Letter("Note From Zelda", 0, "says \"Beware of the Witch\"", "Beware of the Witch");

    private static Character charTest1 = new Character("Test1", 0);
    private static Character charTest2 = new Character("Test2", -9);
    private static Character charTest3 = new Character(nullString, 100);
    private static Character charTest4 = new Character("Test4", nullInt);
    private static Character charTest5 = new Character(nullString, nullInt);
    private static Item itemTest1 = new Item(nullString, nullInt, nullString);
    private static Item itemTest2 = new Item("itTest1", nullInt, "otherInfo");
    private static Item itemTest3 = new Item(nullString, 0, "otherInfo");
    private static Item itemTest4 = new Item("itTest4", 0, nullString);
    private static Item ArmorTest1 = new Armor(nullString, nullInt, nullString);
    private static Item ArmorTest2 = new Armor("arTest1", nullInt, "otherInfo");
    private static Item ArmorTest3 = new Armor(nullString, 0, "otherInfo");
    private static Item ArmorTest4 = new Armor("arTest4", 0, nullString);

    private static Item godSword = new Weapon("God Sword", -999999, "");

    public static void main(String[] args)
    {
        System.out.println("\n** " + godwin.getName() + " and " + marilyn.getName() + " add items to their bags.\n");
        godwin.addToBag(noteFromZelda);
        marilyn.addToBag(noteFromZelda);
        godwin.addToBag(protectionSpell);
        marilyn.addToBag(widowsCloak);
        godwin.addToBag(gladiatorsShield);
        marilyn.addToBag(rustyKnife);

        System.out.println("\n** Godwin and Marilyn Battle\n");
        godwin.use(godwin, protectionSpell);
        marilyn.use(godwin, rustyKnife);
        godwin.use(godwin, gladiatorsShield);
        marilyn.use(godwin, rustyKnife);

        System.out.println("\n** Test for other methods\n");
        godwin.use(godwin, noteFromZelda);
        marilyn.use(marilyn, noteFromZelda);
        marilyn.addToBag(godSword);
        marilyn.use(godwin, godSword);
        marilyn.use(godwin, godSword);
        marilyn.use(godwin, godSword);
    }
}

## Task
You have been tasked to create a number of items that can be used in an online game. All items can be used on a game character who will have a name, a number of health-points and a bag to hold the items.  

## Item Requirements
- All items can be added to any character's bag and also used on any character.  (For instance the Rusty Knife could be used on a character to lower their health by 3 points.) 
- Armor and weapons can be equipped (worn) and removed.   Spells can also be equipped (memorized) which casts a glow around the character and removed (forgotten) which removes the glow.  In the future, any time a character equips or removes any equippable item, their appearance will be altered.  These methods -- for now -- can just have a body which says either "equipping" or "removing."
- Both spells and letters have some text that could be read.  Whenever a spell or letter is used, the text will also be read (displayed).  However these items can be read independently from their use on a character.

## Character
- Build these items using good interface and abstract class design as appropriate.  Set the toString() method of the Character class to return a character's name and current health.  You should have a good object oriented structure and good method signatures.
- To illustrate this, in a driver class, two characters, Godwin and Marilyn are created.  They begin by having items added to their bags (both Godwin and Marilyn get a copy of the Note from Zelda). 

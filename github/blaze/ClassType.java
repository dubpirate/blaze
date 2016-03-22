package github.blaze;

public class ClassType
{
  public enum AbilityType{
    STRENGTH,
    DEXTERITY,
    CONSTITUTION,
    INTELLIGENCE,
    WISDOM,
    CHARISMA
  }

  public static ClassType BARBARIAN = new ClassType("Barbarian");
  public static ClassType BARD = new ClassType("Bard");
  public static ClassType CLERIC = new ClassType("Cleric");
  public static ClassType DRUID = new ClassType("Druid");
  public static ClassType FIGHTER = new ClassType("Fighter");
  public static ClassType MONK = new ClassType("Monk");
  public static ClassType PALADIN = new ClassType("Paladin");
  public static ClassType RANGER = new ClassType("Ranger");
  public static ClassType ROGUE = new ClassType("Rogue");
  public static ClassType SORCERER = new ClassType("Sorcerer");
  public static ClassType WARLOCK = new ClassType("Warlock");
  public static ClassType WIZARD = new ClassType("Wizard");

  private String name;
  private AbilityType primaryAbility;

  private ClassType(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public AbilityType getPrimaryAbility()
  {
    return primaryAbility;
  }
}

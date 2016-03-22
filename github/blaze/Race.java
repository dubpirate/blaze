package github.blaze;

public class Race
{
  public static Race DRAGONBORN = new Race("Dragonborn");
  public static Race DWARF = new Race("Dwarf");
  public static Race ELF = new Race("Elf");
  public static Race GNOME = new Race("Gnome");
  public static Race HALFLING = new Race("Halfling");
  public static Race HALFELF = new Race("Half-Elf");
  public static Race HALFORC = new Race("Half-Orc");
  public static Race HUMAN = new Race("Human");
  public static Race TIEFLING = new Race("Tiefling");

  private String name;

  private Race(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return name;
  }
}

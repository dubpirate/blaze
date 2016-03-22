package github.blaze;

public class Character
{
  private String name;
  private Race race;

  public Character(String name)
  {
    this.name = name;
  }

  public String setName(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public Race getRace()
  {
    return race;
  }
}

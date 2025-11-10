public class Character {
    private String name;
    private int level;

    private int health;

    public Character() {
        this.name = "Unknown";
        this.level = 0;
        this.health = 0;
    }

    public Character(String name, int level, int health) {
        this.name = name;
        this.level = level > 0 ? level : 0;
        this.health = health > 0 ? health : 0;
    }
    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }
    public int getHealth() {
        return health;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public String toString() {
        return "name={0}\nlevel={1}\nhealth={2}".replace("{0}", name)
                                      .replace("{1}", Integer.toString(level))
                                      .replace("{2}", Integer.toString(health));
    }
}
public class Enemy extends Character {
    private int damage;
    public Enemy() {
        super();
        this.damage = 1;
    }
    public Enemy(String name, int level, int health, int damage) {
        super(name, level, health);
        this.damage = 5>=damage && damage > 0 ? damage : 1;
    }
    public int getDamage() {
        return damage;
    }
    public String toString() {
        return super.toString() + "\ndamage={0}".replace("{0}", Integer.toString(damage));
    }
}

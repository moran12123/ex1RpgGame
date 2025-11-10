public class Item {
    private String name;
    private int value;
    private boolean isMagical;

    public Item() {
        this.name = "Unknown";
        this.value = 0;
        this.isMagical = false;
    }

    public Item(String name, int value, boolean isMagical) {
        this.name = name;
        this.value = value;
        this.isMagical = isMagical;
    }
    public String getName() {
        return name;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value < 0 ? 0 : value;
    }
    public boolean isMagical() {
        return isMagical;
    }
    public String toString() {
        return "name={0}\nvalue={1}\nisMagical={2}".replace("{0}", name)
                                      .replace("{1}", Integer.toString(value))
                                      .replace("{2}", Boolean.toString(isMagical));
    }
    

}


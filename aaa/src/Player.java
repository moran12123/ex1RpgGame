public class Player extends Character {
    private Item[] inventory;
    public Player(String name, int level, int health) {
        super(name, level, health);
        this.inventory = new Item[10];
    }
    public Player(String name, int level, int health, Item[] inventory) {
        super(name, level, health);
        this.inventory = inventory != null ? inventory : new Item[10];
    }
    public void addItem(Item item) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                inventory[i] = item;
                return;
            }
        }
    }
    public int calculateInventoryValue() {
        int totalValue = 0;
        for (Item item : inventory) {
            if (item != null) {
                totalValue += item.getValue();
            }
        }
        return totalValue;
    }
    public boolean hasMagicalItem() {
        for (Item item : inventory) {
            if (item != null && item.isMagical()) {
                return true;
            }
        }
        return false;
    }
    public String toString() {
        StringBuilder inventoryStr = new StringBuilder();
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] != null) {
                inventoryStr.append("-------------------\nItem ").append(i + 1).append(":\n")
                            .append(inventory[i].toString()).append("\n");
            }
        }
        return super.toString() + "\nInventory:\n" + inventoryStr.toString();
    }

}

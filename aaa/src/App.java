public class App {
    public static void PrintAllPlayers(GameWorld world) {
        for (Player player : world.getPlayers()) {
            System.out.println("-------------------\n"+player.toString() + "\n-------------------");
        }
    }
    public static void simulateBattle(Player player, Enemy enemy) {
        System.out.println("A battle starts between " + player.getName() + " and " + enemy.getName());
        if(player.getLevel() >= enemy.getLevel()) {
            System.out.println(player.getName() + " wins the battle!");
            player.setLevel(player.getLevel() + 1);
            System.out.println(player.getName() + " leveled up to " + player.getLevel());
        } else {
            System.out.println(enemy.getName() + " wins the battle!");
        }
    }
    public static void main(String[] args) throws Exception {
        Item sword = new Item("Excalibur", 150, true);
        Item shield = new Item("Dragon Shield", 100, false);
        Item potion = new Item("Health Potion", 50, false);
        Player player1 = new Player("Hero", 5, 100);
        player1.addItem(sword);
        player1.addItem(shield);
        Player player2 = new Player("Warrior", 3, 80, new Item[]{potion});
        Enemy enemy1 = new Enemy("Goblin", 2, 50, 10);
        Enemy enemy2 = new Enemy("Orc", 4, 120, 15);
        GameWorld gameWorld = new GameWorld("Fantasy Land", 2);
        gameWorld.addPlayer(player1);
        gameWorld.addPlayer(player2);
        PrintAllPlayers(gameWorld);
        System.out.println("Total value of all players' inventories: " + gameWorld.getTotalValueOfWorld());
        simulateBattle(player1, enemy1);
        simulateBattle(player2, enemy2);
    }
}

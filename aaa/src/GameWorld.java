import java.util.ArrayList;
import java.util.List;

public class GameWorld {
    private String name;
    private List<Player> players;
 
    private List<Enemy> enemies;
    private int difficulty;
    public GameWorld(String name, int difficulty) {
        this.name = name;
        this.players = new ArrayList<>();
        this.enemies = new ArrayList<>();
        this.difficulty = difficulty >= 1 && difficulty <= 3 ? difficulty : 1;
    }
    public void addPlayer(Player player) {
        players.add(player);
    }  
       public List<Player> getPlayers() {
        return players;
    } 
    public int getTotalValueOfWorld() {
        int totalValue = 0;
        for (Player player : players) {
            if (player != null) {
                totalValue += player.calculateInventoryValue();
            }
        }
        return totalValue;
    }
    public String toString(){
        return "GameWorld: " + name + "\nDifficulty: " + difficulty + 
               "\nTotal Players: " + players.size();

    }
}
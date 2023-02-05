import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        int player_amount = 4;
        Player players[] = new Player[player_amount];
        Player one = new Player("Uno");
        Player two = new Player("Dos");
        Player three = new Player("Tres");
        Player four = new Player("Quatro");
        players[0] = one;
        players[1] = two;
        players[2] = three;
        players[3] = four;
        Game game = new Game(players);
    }
}

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
        for (int i = 0; i < player_amount; i++){
            System.out.print(game.getPlayers()[i].getName());
            System.out.print(" hand :");
            System.out.println(game.getPlayers()[i].getHand().handToString());
        }
        System.out.print("Trump card: ");
        System.out.println(game.getTrump().getIdentity());
        System.out.print("Starting player: ");
        System.out.println(game.getStartingPlayer().getName());
        System.out.println(game.getPlayers()[0].getHand().getSize());
    }
}

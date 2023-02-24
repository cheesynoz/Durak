import java.util.ArrayList;
public class Game {
    private Card trump;
    private Player players[];
    private ArrayList<Player> activePlayers = new ArrayList<Player>();
    private ArrayList<Card> board = new ArrayList<Card>();
    private Deck deck;
    private int dealer = 0;
    private boolean finished = false;
    

    public Game(Player players[]){
        Deck deck = new Deck(36);
        this.deck = deck;
        this.trump = deck.getTrump();
        this.players = players;
        for (int i = 0; i < players.length; i++){
            this.activePlayers.add(players[i]);
        }
        dealStarting(deck);
        GUI gui = new GUI();
    }


    public Player[] getPlayers(){
        return this.players;
    }

    public Card getTrump(){
        return this.trump;
    }

    public boolean getFinished(){
        return this.finished;
    }

    public void dealStarting(Deck deck){
        for(int i = 0; i < 6; i ++){
            for (int j = 0; j < players.length; j++){
                this.players[j].addCard(deck.draw(), this.trump.getSuit());
            }
        }
    }

    public Player getStartingPlayer(){
        int value = 14;
        int starter = 0;
        for(int i = 0; i < players.length; i++){
            if (players[i].getHand().containsTrump(this.trump.getSuit())){
                int lowest = players[i].getHand().lowestTrump(this.trump.getSuit());
                if (lowest < value){
                    value = lowest;
                    starter = i;
                }
            }
        }
        return players[starter];
    }
}

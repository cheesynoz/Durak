public class Game {
    Card trump;
    Player players[];
    

    public Game(Player players[]){
        Deck deck = new Deck(36);
        this.trump = deck.getTrump();
        this.players = players;
        dealStarting(deck);
    }

    public Player[] getPlayers(){
        return this.players;
    }

    public void dealStarting(Deck deck){
        for(int i = 0; i < 6; i ++){
            for (int j = 0; j < players.length; j++){
                this.players[j].addCard(deck.draw());
            }
        }
    }
}

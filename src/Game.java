public class Game {
    

    public Game(Player players[]){
        Deck deck = new Deck(36);
        dealStarting(deck, players);
    }

    public void dealStarting(Deck deck, Player players[]){
        for(int i = 0; i < 6; i ++){
            for (int j = 0; j < players.length; j++){
                players[j].addCard(deck.draw());
            }
        }
    }
}

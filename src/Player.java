import java.util.ArrayList;
public class Player {
    private String name;
    private Hand hand;

    public Player(String name){
        this.name = name;
        Hand hand = new Hand();
        this.hand = hand;
    }

    public Hand getHand(){
        return this.hand;
    }

    public String getName(){
        return this.name;
    }

    public void addCard(Card card, int trump){
        this.hand.addCard(card, trump);
    }

    public void removeCard(Card card){
        this.hand.removeCard(card);
    }

    public int getSize(){
        return this.hand.getSize();
    }

    public void clearHand(){
        this.hand.clearHand();
    }

    

    
}

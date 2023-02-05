import java.util.ArrayList;
public class Player {
    private String name;
    private Hand hand;

    public Player(String name){
        this.name = name;
    }
    
    public void addCard(Card card){
        this.hand.addCard(card);
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

    public void printHand(){
        this.hand.printHand();
    }
}

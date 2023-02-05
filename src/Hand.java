import java.util.ArrayList;
public class Hand {
    private ArrayList<Card> cards = new ArrayList<Card>();

    public Hand(Card[] starting){
        for (int i = 0; i < 6; i++){
            this.cards.add(starting[i]);
        }
    }

    public void addCard(Card card){
        this.cards.add(card);
    }

    public void removeCard(Card card){
        if (this.cards.contains(card)){
            int index = this.cards.indexOf(card);
            this.cards.remove(index);
        }
    }
    
    public int getSize(){
        return this.cards.size();
    }

    public void clearHand(){
        this.cards.clear();
    }

    public void printHand(){
        System.out.println(this.cards.toString());
    }
}

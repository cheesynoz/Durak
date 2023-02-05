import java.util.ArrayList;
public class Hand {
    private ArrayList<Card> cards = new ArrayList<Card>();

    public Hand(){
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

    public String handToString(){
        String send = "";
        for (int i = 0; i < this.cards.size(); i++){
            send = send + this.cards.get(i).getIdentity() + ", ";
        }
        return send;
    }
}

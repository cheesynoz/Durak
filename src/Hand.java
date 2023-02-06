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

    public boolean containsTrump(int suit){
        for (int i = 0; i < cards.size(); i++){
            if (this.cards.get(i).getSuit() == suit){
                return true;
            }
        }
        return false;
    }

    public int lowestTrump(int suit){
        Card card = new Card();
        for (int i = 0; i < cards.size(); i++){
            if (this.cards.get(i).getSuit() == suit){
                if (this.cards.get(i).getValue() < card.getValue()){
                    card = this.cards.get(i);
                }
                else{
                    if(this.cards.get(i).getValue() < card.getValue()){
                        card = this.cards.get(i);
                    }
                }
            }
        }
    
        return card.getValue();
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

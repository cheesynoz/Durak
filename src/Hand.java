import java.util.ArrayList;
import java.util.*;
public class Hand {
    private ArrayList<Card> cards = new ArrayList<Card>();

    public Hand(){
    }

    public void addCard(Card card, int trump){
        System.out.println(card.getIdentity());
        if(this.cards.isEmpty()){
        this.cards.add(card);
        }
        else if(card.getSuit() == trump){
            if(this.cards.get(this.cards.size() - 1).getSuit() != trump){
                this.cards.add(card);
            }
            else if(this.cards.get(0).getSuit() == trump && this.cards.get(0).getValue() > card.getValue()){
                    this.cards.add(0, card);
            }
            else if (this.cards.get(this.cards.size() - 1).getSuit() == trump && this.cards.get(this.cards.size() - 1).getValue() < card.getValue()){
                this.cards.add(card);
            }
            else{
                    for (int i = this.cards.size() - 2; i >= 0; i--){
                        if (this.cards.get(i).getSuit() != trump){
                            this.cards.add(i+1, card);
                            break;
                        }
                        else if (this.cards.get(i).getSuit() == trump && this.cards.get(i).getValue() < card.getValue()){
                            this.cards.add(i+1, card);
                            break;
                        }
                    }
                }
        }
        else{
            for(int i = 0; i < this.cards.size(); i++){
                if(this.cards.get(i).getSuit() == trump){
                    this.cards.add(i, card);
                    i = this.cards.size();
                }
                else if(this.cards.get(i).getSuit() > card.getSuit()){
                    this.cards.add(i, card);
                    i = this.cards.size();
                }
                else if(this.cards.get(i).getSuit() == card.getSuit() && this.cards.get(i).getValue() > card.getValue()){
                    this.cards.add(i, card);
                    i = this.cards.size();
                }
                else if(i == this.cards.size() - 1){
                    this.cards.add(card);
                    i = this.cards.size();
                }
            }
        }
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

    public  ArrayList<Card> getCards(){
        return this.cards;
    }

    public String handToString(){
        String send = "";
        for (int i = 0; i < this.cards.size(); i++){
            if (i == this.cards.size() - 1){
                send = send + this.cards.get(i).getIdentity();
            }
            else{
                send = send + this.cards.get(i).getIdentity() + ", ";
            }
        }
        return send;
    }
}

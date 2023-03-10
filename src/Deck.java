import java.util.ArrayList;
import java.util.*;
public class Deck {
    private ArrayList<Card> undrawn = new ArrayList<Card>();


    public Deck(int amount){
        int ctr = 1;
        for (int i = 1; ctr < 5; ++i) {
            for (int j = 1; j < (amount/4)+1; ++j) {
                Card card = new Card(j, i);
                this.undrawn.add(card);
            }
            ++ctr;
        }
        Collections.shuffle(this.undrawn);
        }
        

    public ArrayList<Card> getDeck(){
        return this.undrawn;
    }

    public int getSize(){
        return this.undrawn.size();
    }

    public Card draw(){
        Card card = this.undrawn.get(0);
        this.undrawn.remove(0);
        return card;
    }

    
}

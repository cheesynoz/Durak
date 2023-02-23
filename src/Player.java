import java.util.ArrayList;
import java.util.Scanner;
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

    public Card turn(ArrayList<Card> board){
        if (board.isEmpty()){
            return attack();
        }
        else {return null;}
    }

    public Card attack(){
        System.out.print("Select card to play: ");
        Scanner reader = new Scanner(System.in);
        boolean valid = false;
        ArrayList<String> handList = new ArrayList<String>();
        for(Card card : this.hand.getCards()){
            handList.add(card.getIdentity());
        }
        while(!valid){
            String card = reader.next();
            if(handList.contains(card)){
                int index = handList.indexOf(card);
                return this.hand.getCards().get(index);
            }
            else{
                System.out.println("Invalid card");
            }
        }
        return null;
    }

    

    
}

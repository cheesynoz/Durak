import java.util.ArrayList;
public class Card{
    private int value;
    private int suit;
    private String ImageName;

    public Card(){
        this.value = 50;
    }

    public Card(int value, int suit){
        this.value = value;
        this.suit = suit;
    }
    public Card(int value, int suit, String ImageName){
        this.value = value;
        this.suit = suit;
        this.ImageName = ImageName;
    }

    public int getSuit(){
        return this.suit;
    }
    public int getValue(){
        return this.value;
    }
    
    public String getImageName(){
        return this.ImageName;
    }

    public String getLetterValue(){
        String letter = "";
        if(this.value == 14){
            letter = "A";
        }
        else if(this.value == 11){
            letter = "J";
        }
        else if(this.value == 12){
            letter =  "Q";
        }
        else if(this.value == 13){
            letter = "K";
        }
        else{
            letter = String.valueOf(this.value);
        }
        return letter;
    }

    public String getSuitValue(){
        String letter = "";
        if (this.suit == 1){
            letter = "H";
        }
        else if (this.suit == 2){
            letter = "D";
        }
        else if (this.suit == 3){
            letter = "S";
        }
        else if (this.suit == 4){
            letter = "C";
        }
        return letter;
    }

    public String getIdentity(){
        String send = getLetterValue() + getSuitValue();
        return send;
    }
}
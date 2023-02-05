import java.util.ArrayList;
public class Card{
    private int value;
    private int suit;
    private String ImageName;

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

    public String getLetter(){
        String letter = "";
        if(this.value == 1){
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
        return letter;
    }
}
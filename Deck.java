import java.util.Random;

// CS 251-401 Program 1
// Daniel Vincent

public class Deck {

    public static void initDeck(boolean[] deck){
        for (int i = 0; i < deck.length; i++){
            deck[i] = true;
            System.out.println(i + ": " + deck[i]);
        }
    }

    public static boolean emptyDeck(boolean[] deck){
        for (int i = 0; i < deck.length; i++){
            if (deck[i] = true){
                System.out.println(deck[i]);
                return false;
            }
        }
        return true;
    }
 
    public static int dealCard(boolean[] deck){
        int card = 0;
        do{
            card = (int)Math.floor(Math.random()*(52));
            System.out.println(card);
        }while(!deck[card]);
        
        deck[card] = false;
        System.out.println(card);
        return card;
    }

    public static void printCard(int card){
        System.out.println(card);
        String[] deckMap = new String[]{"AS","2S","3S","4S","5S","6S","7S","8S","9S","10S","JS","QS","KS",
        "AC","2C","3C","4C","5C","6C","7C","8C","9C","10C","JC","QC","KC",
        "AH","2H","3H","4H","5H","6H","7H","8H","9H","10H","JH","QH","KH",
        "AD","2D","3D","4D","5D","6D","7D","8D","9D","10D","JD","QD","KD"};
        
        System.out.print(deckMap[card]);
    }

    public static void main(String[] args){
        boolean[] myDeck = new boolean[52];

        final int cardsPerRow = 8;
        int cardsThisRow = 0;
        int myCard;
        initDeck(myDeck);
        System.out.println("\nHere is a shuffled deck ...\n");
        while (!emptyDeck(myDeck)){ 
            myCard = dealCard(myDeck);
            System.out.println(myCard);
            ++cardsThisRow;
            if (cardsThisRow <= cardsPerRow){
                printCard(myCard);
                System.out.print(" ");                
            }
            else{
                System.out.println("");
                cardsThisRow = 1;
                printCard(myCard);
                System.out.print(" ");
            }
        }
        System.out.println('\n');
    }
}

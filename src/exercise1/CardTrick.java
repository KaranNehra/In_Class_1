package exercise1;
import java.util.*;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];          
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < hand.length; i++) {
            
            Card card = new Card();
            card.setValue((int)(1+Math.random()*13));
            String s = Card.SUITS[(int)(Math.random()*3)];
            card.setSuit(s);
            hand[i]=card;  
            
        }  
        
        System.out.print("Enter the number of your card : ");
        int value = input.nextInt();
        System.out.print("Enter the suit of your card : ");
        String suit = input.next();
        
        for (int i=0;i<hand.length;i++){
            
            if (hand[i].getValue() == value & hand[i].getSuit().equalsIgnoreCase(suit)){
                printInfo();
                break;
            }
            else{
                System.out.println("No card match");
                }
                
        }
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Karan Singh Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Mayank-SIngh007
 * Student number 991725927
 */

import java.util.Random;
import java.util.Scanner;


public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(random.nextInt(13)+ 1);
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i] = c;
            
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        System.out.println("Enter the card value");
        int userValue = scanner.nextInt();
        
        System.out.println("Enter the card suit");
        String userSuit = scanner.next();
        
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userValue && card.getSuit().equalsIgnoreCase(userSuit)) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Congratulations, Card is in the magic hand");
            
        }
        
        else {
            System.out.println("soory your card is not in the magic hand");
        }
        
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");
        
        boolean luckyCardFound = false;
        for (Card n: magicHand)
        {
            if (luckyCard.getValue() == n.getValue() && luckyCard.getSuit.equals(n.getSuit()))
            {
                luckyCardFound = true;
                break;
            }
        }
        
        if (luckyCardFound)
        {
            System.out.println("Lucy Card found");
        }
        else
        {
            System.out.println("Lucky card not found");
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }
    
}

import models.Blackjack;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Guest on 1/4/18.
 */
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to start a game of Blackjack?");
        String answer = scan.nextLine();

        if(answer.charAt(0)=='y'|| answer.charAt(0) == 'Y') {
            ArrayList<Blackjack> deck = Blackjack.deck();
            for(Blackjack eachCard : deck) {
                System.out.println(eachCard.card);
            }
            Blackjack pickedCard = Blackjack.pickRandomCard(deck);
//        System.out.println("Random Card: " + Blackjack.getCard(pickedCard) + " " +Blackjack.getValue(pickedCard));
        }




    }
}

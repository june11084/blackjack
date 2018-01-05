package models;


import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
/**
 * Created by Guest on 1/4/18.
 */
public class Blackjack {

    public String card;
    public int value;

    public Blackjack(String card, int value) {
        this.card = card;
        this.value = value;
    }
    public static ArrayList deck() {
        ArrayList<Object> deckList = new ArrayList<>();

        String[] suits = {"♠️", "♥", "♣", "♦"};
        String[] number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
        for(int suit = 0; suit < suits.length; suit++) {
            for(int cardNumber = 0; cardNumber < number.length; cardNumber++) {
                Blackjack individualCard = new Blackjack(number[cardNumber]+ suits[suit], value[cardNumber]);
                deckList.add(individualCard);
            }
        }
        return deckList;
    }
    public static Blackjack pickRandomCard(ArrayList<Blackjack> deck){
        Random randomNumber = new Random();
        Blackjack card = deck.get(randomNumber.nextInt(deck.size()));
        deck.remove(randomNumber.nextInt(deck.size()));
        return card;
    }

    public static String getCard(Blackjack card){
        String face = card.card;
        return face;
    }
    public static int getValue(Blackjack card){
        int points = card.value;
        return points;
    }
}

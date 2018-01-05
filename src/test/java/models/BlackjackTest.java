package models;

import org.junit.Test;

import java.util.ArrayList;


import static org.junit.Assert.*;

/**
 * Created by Guest on 1/4/18.
 */
public class BlackjackTest {
    @Test
    public void Blackjack_has52Cards() {
        ArrayList<Blackjack> deck = Blackjack.deck();
        assertEquals(52, deck.size());
    }
    @Test
    public void Blackjack_pickRandomCardFromDeck() {
        Blackjack blackjack = new Blackjack("J♠", 0);
        ArrayList<Blackjack> deck = new ArrayList<>();
        Blackjack jack = new Blackjack("J♠", 10);
        deck.add(jack);
        assertEquals(jack, blackjack.pickRandomCard(deck));
    }
}
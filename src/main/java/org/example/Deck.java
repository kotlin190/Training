package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
//    Card[] cards = new Card[52];
    //Inheritance
    //Polymorphism
    //Encapsulation
    List<Card> cards = new ArrayList<Card>();

    public Deck() {
        initCards();
    }

    private void initCards() {
        cards.clear();
        for (int i = 0; i < 52; i++) {
            cards.add(new Card(i));
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void print() {
        for (Card card : cards) {
            System.out.print(card + " ");
        }
    }

    public void print(int number) {
        int count = 0;
        for (Card card : cards) {
            System.out.print(card + " ");
            count++;
            if (count % number == 0) System.out.println();
        }
    }

    public Card draw() {
        return null;
    }
}

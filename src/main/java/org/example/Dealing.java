package org.example;

public class Dealing {
    public static void main(String[] args) {
        int[] cards = new int[52];
        char[] types = {'\u2663', '\u2662', '\u2661', '\u2660'};
        for (int i = 0; i < 52; i++) {
            cards[i] = i;
//            System.out.print(cards[i]);
            int point = i % 13 + 1;
            System.out.print(point);
            System.out.print(types[i / 13]);
            System.out.print(" ");
            if (point == 13) {
                System.out.println();
            }
        }
    }
}
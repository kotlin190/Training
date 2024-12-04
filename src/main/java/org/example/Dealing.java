package org.example;

public class Dealing {
    public static void main(String[] args) {
        int[] cards = new int[52];
        for (int i = 0; i < 52; i++) {
            cards[i] = i;
//            System.out.print(cards[i]);
            int point = i % 13 + 1;
            System.out.print(point);
            int type = i / 13;
            switch(type) {
                case 0:
                    System.out.print("C");
                    break;
                case 1:
                    System.out.print("D");
                    break;
                case 2:
                    System.out.print("H");
                    break;
                case 3:
                    System.out.print("S");
                    break;
            }
            System.out.print(" ");
            if (point == 13) {
                System.out.println();
            }
        }
    }
}
package ch04.exercise;

import java.util.Random;

public class QQQ {
    public static void main(String[] args) {
        Random random = new Random();

        int dice1 = random.nextInt(1, 7);
        int dice2 = random.nextInt(1, 7);
        int sum = dice1 + dice2;

        while (sum != 5) {
            System.out.println("( " + dice1 + ", " + dice2 + " )");

            dice1 = random.nextInt(1, 7);
            dice2 = random.nextInt(1, 7);
            sum = dice1 + dice2;
        }
        System.out.println("( " + dice1 + ", " + dice2 + " )");
        System.out.println("합은 5");
    }
}

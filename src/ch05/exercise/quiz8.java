package ch05.exercise;

public class quiz8 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int tot = 0;
        int sum = 0;
        double avg = 0;
        for (int[] ints : array) {
            tot += ints.length;
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        avg = (double) sum / tot;
        System.out.println(tot);
        System.out.println(sum);
        System.out.println(avg);
    }
}

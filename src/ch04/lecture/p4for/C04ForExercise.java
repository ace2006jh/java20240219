package ch04.lecture.p4for;

public class C04ForExercise {
    public static void main(String[] args) {
        /*
        0
        1
        2
        3
        4
        5
         */
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        for (int i = 0; i <= 8; i += 2) {
            System.out.println(i);
        }
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
        for (int i = 4; i >= 0; i--) {
            System.out.println(i);
        }
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
    }
}

package ch04.lecture.p4for;

public class C05ForExercise {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 0, x = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++, x++) {
                if (x == 10) {
                    x = 0;
                }
                System.out.print(x);
            }
            System.out.println();
        }
        for (int i = 0, x = 1; i < 5; i++) {
            for (int j = 0; j <= i; j++, x++) {
                if (x == 10) {
                    x = 0;
                }
                System.out.print(x);
            }
            System.out.println();
        }


    }
}

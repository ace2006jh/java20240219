package ch04.lecture.p2swith;

public class C03SwitchExpression {
    public static void main(String[] args) {
        int value = 3;

        switch (value) {
            case 1 -> System.out.println("steatement 1");
            case 2 -> System.out.println("steatement 1");
            case 3 -> {
                System.out.println("steatement 3");
                System.out.println("steatement 4");
            }
        }
    }
}

package ch02.lecture.p02type;

public class C21TypeConversion {
    public static void main(String[] args) {
        //자동 타입변환 : 작은크기 -> 큰크기
        // 강제 타입변환(casting) : 큰크기 -> 작은크기
        long a = 234;
        int b = (int) a; // 강제타입변환 casting

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        short c = 50;
        byte d = (byte) c;

        System.out.println("c = " + c);
        System.out.println("d = " + d);
        short e = 128;
        byte f = (byte) e;

        System.out.println("e = " + e);
        System.out.println("f = " + f);

        short g = 384;
        byte h = (byte) g;

        System.out.println("g = " + g);
        System.out.println("h = " + h);
    }
}

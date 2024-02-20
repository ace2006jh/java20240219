package c02.lecture.p02type;

public class C08Double {
    public static void main(String[] args) {
        // double
        // 실수 표현 타입
        // 8byte
        double a = 3.141592;
        double b = 2983742.918734;
        double c = -9187.987298734;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        //근사한 값으로 저장

        double d = 135464645.312221112346777;
        System.out.println("d = " + d);

        double e = 3.141592E3;
        System.out.println("e = " + e);

        double f = 3.141592E-2;
        System.out.println("f = " + f);

        float var1 = 0.1234567890123456789f;
        double var2 = 0.1234567890123456789;
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);

        double var3 = 3e6;
        float var4 = 3e6F;
        double var5 = 2e-3;
        System.out.println("var3 = " + var3);
        System.out.println("var4 = " + var4);
        System.out.println("var5 = " + var5);
    }
}

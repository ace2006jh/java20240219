package c02.lecture.ch02;

public class sec05 {
    public static void main(String[] args) {
        boolean stop = true;
        // ctrl shift enter하면  문장 완성이 빨라짐
        if (stop) {
            System.out.println("중지합니다.");
        } else {
            System.out.println("시작합니다.");
        }

        int x = 10;
        boolean result1 = (x == 20);
        boolean result2 = (x != 20);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);


    }
}

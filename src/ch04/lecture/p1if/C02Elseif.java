package ch04.lecture.p1if;

public class C02Elseif {
    public static void main(String[] args) {
        //else : if의 90조건이 flase할때 실행되는 코드블럭을 정의
        boolean condition = true;

        if (condition) {
            System.out.println("statement1");

            System.out.println("statement2");

            System.out.println("statement3");

        } else {
            System.out.println("statement4");

            System.out.println("statement5");

        }
    }
}

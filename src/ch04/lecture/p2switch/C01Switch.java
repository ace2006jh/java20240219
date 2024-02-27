package ch04.lecture.p2switch;

public class C01Switch {
    public static void main(String[] args) {

        String city = "제주";

        switch (city) {
            case "서울":
                System.out.println("statement 1");
                break;
            case "제주":
                System.out.println("statement 2");
                break;
            case "부산":
                System.out.println("statement 3");
                break;
            case "포항":
                System.out.println("statement 4");
                break;
            //위에 모든케이스가 해당하지 않을 때
            default:
                System.out.println("statement 5");
                break;
        }

        System.out.println("statement 6");
        System.out.println("statement 7");
        System.out.println("statement 8");
        System.out.println("statement 9");
    }
}

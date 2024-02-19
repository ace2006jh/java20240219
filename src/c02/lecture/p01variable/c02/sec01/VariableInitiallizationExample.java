package c02.lecture.p01variable.c02.sec01;

public class VariableInitiallizationExample {

    public static void main(String[] args) {
        int hour =3;
        int minute = 5 ;
        System.out.println(hour+"시간" +minute+"분");
        int totalMinute = (hour*60) + minute;

        System.out.println("총" + totalMinute + "분");

    }

}



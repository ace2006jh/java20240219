package ch04.lecture.p2swith;

public class C06Switch {
    public static void main(String[] args) {
        String city = "부산";

        switch (city) {
            case "서울", "인천" -> System.out.println("수도권입니다.");
            case "광주", "전주" -> System.out.println("호남권입니다.");
            case "대구", "부산" -> System.out.println("영남권입니다.");
        }

    }
}
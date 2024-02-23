package ch04.lecture.p1if;

import java.util.Random;
import java.util.Scanner;

public class C06RPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("가위(1), 바위(2), 보(3)를 선택하세요");

        int user = Integer.parseInt(scanner.nextLine());
        int computer = random.nextInt(1, 4);

        System.out.println("user = " + user);
        System.out.println("computer = " + computer);

        if (user == 1) {
            if (computer == 1) {
                System.out.println("유저 가위 : 컴퓨터 가위");
                System.out.println("비겼습니다.");
            } else if (computer == 2) {
                System.out.println("유저 가위 : 컴퓨터 바위");
                System.out.println("졌습니다.");
            } else {
                System.out.println("유저 가위 : 컴퓨터 보");
                System.out.println("이겼습니다");
            }
        } else if (user == 2) {
            if (computer == 1) {
                System.out.println("유저 바위 : 컴퓨터 가위");
                System.out.println("이겼습니다.");
            } else if (computer == 2) {
                System.out.println("유저 바위 : 컴퓨터 바위");
                System.out.println("비겼습니다.");
            } else {
                System.out.println("유저 바위 : 컴퓨터 보");
                System.out.println("졌습니다");
            }
        } else if (user == 3) {
            if (computer == 1) {
                System.out.println("유저 보 : 컴퓨터 가위");
                System.out.println("졌습니다.");
            } else if (computer == 2) {
                System.out.println("유저 보 : 컴퓨터 바위");
                System.out.println("이겼습니다.");
            } else {
                System.out.println("유저 보 : 컴퓨터 보");
                System.out.println("비겼습니다");
            }
        }
    }
}

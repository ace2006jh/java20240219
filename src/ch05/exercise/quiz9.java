package ch05.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class quiz9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean key = true;
        int[] arr1 = new int[0];
        while (key) {
            System.out.println("-------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-------------------------------------------------");
            int stu = 0;
            System.out.print("선택>");
            String gap = scanner.nextLine();
            if (gap.equals("1")) {
                System.out.print("학생수>");
                String man = scanner.nextLine();
                stu = Integer.parseInt(man);
                arr1 = new int[stu];
            } else if (gap.equals("2")) {
                for (int i = 0; i < arr1.length; i++) {
                    System.out.print(STR."score\{i}>");
                    String score = scanner.nextLine();
                    arr1[i] = Integer.parseInt(score);
                }

            } else if (gap.equals("3")) {
                for (int i = 0; i < arr1.length; i++) {
                    System.out.println(STR."score\{i}>\{arr1[i]}");
                }
            } else if (gap.equals("4")) {
                int max = Arrays.stream(arr1).max().orElse(0);
                System.out.println("최고 점수: " + max);
                double avg = Arrays.stream(arr1).average().orElse(0);
                System.out.println("평균 점수: " + avg);

            } else if (gap.equals("5")) {
                key = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}

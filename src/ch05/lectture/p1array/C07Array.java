package ch05.lectture.p1array;

public class C07Array {
    public static void main(String[] args) {
        // 배열 전체 탐색
        // 향상된 for 문
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2};

        // 고전
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println("--------------------------");

        //향상된 for 문
        for (int item : arr) {
            System.out.println(item);
        }
    }
}

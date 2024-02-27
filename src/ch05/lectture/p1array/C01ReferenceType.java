package ch05.lectture.p1array;

public class C01ReferenceType {
    public static void main(String[] args) {
        //기본 타입 prinmitive type 8개 외는 모두 참조타입
        // 배열 " 여러값을 갖는 타입
        int a = 3;
        int b = 3;

        //a와 b는 같다

        int[] arr;
        arr = new int[]{3, 4, 5};

        int[] brr;
        brr = new int[]{3, 4, 5};

        //a와 b는 다르다
    }
}

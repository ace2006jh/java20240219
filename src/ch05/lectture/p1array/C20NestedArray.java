package ch05.lectture.p1array;

import java.util.Arrays;

public class C20NestedArray {
    public static void main(String[] args) {
        // 07.2차원 배열.png
        int[] arr1 = new int[]{5, 8, 9};
        int[] arR1 = {5, 8, 9};
        int[][] arr2 = {
                {88, 16, 89},
                {77, 15, 57, 84}
        };
        int[][] arr3 = arr2;

        arr3[0][1] = 33;

        System.out.println(arr3[0][1]); //33
        System.out.println(arr2[0][1]); //33

        arr3[1] = arr1;
        System.out.println(arr2[1][1]);
        System.out.println(Arrays.toString(arr2[1]));


    }
}

package ch05.lectture.p1array;

import java.util.Arrays;

public class C19NestedArray {
    public static void main(String[] args) {
        int[][] arr1 = new int[2][];

        System.out.println(arr1.length);//2
        System.out.println(Arrays.toString(arr1));//null null


        arr1[0] = new int[3];
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr1[0]));

        arr1[1] = new int[2];
        System.out.println(Arrays.toString(arr1[1]));
    }
}

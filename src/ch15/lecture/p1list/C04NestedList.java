package ch15.lecture.p1list;

import java.util.ArrayList;
import java.util.List;

public class C04NestedList {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        System.out.println(array[1][1]);
        System.out.println(array[2][2]);
        System.out.println(array[1][0]);

        //
        List<List<Integer>> list = new ArrayList<>();

        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());

        list.get(0).add(95);
        list.get(0).add(86);
        list.get(1).add(83);
        list.get(1).add(92);
        list.get(1).add(96);
        list.get(2).add(78);
        list.get(2).add(83);
        list.get(2).add(93);
        list.get(2).add(87);
        list.get(2).add(88);

        System.out.println(list.get(1).get(1));
        System.out.println(list.get(2).get(2));
        System.out.println(list.get(1).get(0));
    }
}

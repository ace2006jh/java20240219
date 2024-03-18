package ch12.lecture.p3regex;

public class C05Sample {
    public static void main(String[] args) {

        String pattern = "[_$a-zA-Z][_$a-zA-Z0-9]+";
        System.out.println("num".matches(pattern));  //t
        System.out.println("var7".matches(pattern));  //t
        System.out.println("class".matches(pattern));  //t
        System.out.println("PI".matches(pattern));  //t
        System.out.println("MAX_VALUE".matches(pattern));  //t
        System.out.println("7num".matches(pattern));  //f

    }
}

package ch12.lecture.p3regex;

public class C03PredefinedClass {
    public static void main(String[] args) {
        // [0-9] : \d
        // whitespace : \s
        // word character [a-zA-Z0-9_] : \w

        String p1 = "\\d";
        System.out.println("0".matches(p1)); //t
        System.out.println("5".matches(p1)); //t
        System.out.println("a".matches(p1)); //f
        System.out.println("051".matches(p1)); //f

        System.out.println(" ".matches("\\s")); //t
        System.out.println("\t".matches("\\s")); //t
        System.out.println("\n".matches("\\s")); //t

        // 연습
        String str = "손 흥민";
        String s = str.replaceAll("\\s", "");
        System.out.println(s);
    }
}

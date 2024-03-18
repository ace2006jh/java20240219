package ch12.lecture.p3regex;

public class C02CharacterClass {
    public static void main(String[] args) {
        // 문자집합
        System.out.println("a".matches("[abc]"));
        System.out.println("b".matches("[abc]"));
        System.out.println("c".matches("[abc]"));
        System.out.println("A".matches("[abc]"));

        System.out.println("abc".matches("[abc]")); // false

        String p1 = "[abc][abc][abc]";
        System.out.println("abc".matches(p1)); // true
        System.out.println("bac".matches(p1)); // true
        System.out.println("cba".matches(p1)); // true
        System.out.println("ccc".matches(p1)); // true
        System.out.println("bbb".matches(p1)); // true

        String p2 = "[a-z]";
        System.out.println("a".matches(p2)); // true
        System.out.println("s".matches(p2)); // true
        System.out.println("z".matches(p2)); // true
        System.out.println("A".matches(p2)); // false
        System.out.println("Z".matches(p2)); // false
        System.out.println("0".matches(p2)); // false

        String p3 = "[a-zA-Z]";
        System.out.println("z".matches(p3)); // true
        System.out.println("Z".matches(p3)); // true

        String p4 = "[a-zA-Z0-9]"; //영어 대소문자 숫자
        String p5 = "[가-힣]"; // 한글

        String p6 = "[^abc]"; //a, b, c 뺴고
        System.out.println("a".matches(p6)); // f
        System.out.println("c".matches(p6)); // f
        System.out.println("d".matches(p6)); // t
        System.out.println("A".matches(p6)); // t
        System.out.println("8".matches(p6)); // t
        System.out.println("xyz".matches(p6)); // f


    }
}

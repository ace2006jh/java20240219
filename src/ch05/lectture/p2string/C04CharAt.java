package ch05.lectture.p2string;

public class C04CharAt {
    public static void main(String[] args) {
        // 첫번째 s
        // 두번쨰 o
        // 세번째 n

        String a = "son";
        System.out.println(a.charAt(0)); //s
        System.out.println(a.charAt(1)); //o
        System.out.println(a.charAt(2)); //n

        //char
        char c = a.charAt(0);

        String b = """
                hello
                world
                """;

        System.out.println(a.charAt(0)); //h
        System.out.println(a.charAt(6)); //w
        System.out.println(a.charAt(b.length() - 1)); // 엔터


    }
}

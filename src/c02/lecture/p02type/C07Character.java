package c02.lecture.p02type;

public class C07Character {
    public static void main(String[] args) {
        // char (character)
        // 2byte == 16bits
        // 0 ~ 65535
        // unicode

        char a = 99;
        char b = 120;
        char c = 65535;
        char f = 4314;
        char e = 9679;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("f = " + f);
        System.out.println("e = " + e);
        char g = 0xAC00;
        char d = 0xD7A3;
        System.out.println("g = " + g);
        System.out.println("d = " + d);

        int o = 0x1f607;

        char[] emoji1 = Character.toChars(o);
        String emojis = new String(emoji1);
        System.out.println("emojis = " + emojis);

        int z = 0x1f3a4;

        char[] emoji2 = Character.toChars(z);
        String emojis2 = new String(emoji2);
        System.out.println("emojis2 = " + emojis2);

        char c1 = 'A';
        char c2 = 65;

        char c3 = '가';
        char c4 = 44032;

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);
    }
}

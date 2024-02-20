package c02.lecture.p02type;

public class C15StringTemplate {
    public static void main(String[] args) {
        //java 21
        //string template

        String name = "jane";
        String age = "40";

        // my name is jane and age is 40

        String desc = "my name is " + name + " and age is " + age;
        System.out.println(desc);

        String desc2 = String.format("my name is %s and age is %s", name, age);
        System.out.println(desc2);

        String desc3 = STR."my name is \{name} and age is \{age}";
        System.out.println(desc3);

        //
        String address = "서울";
        String country = "한국";

        String desc4 = String.format("저는 %s에 있는 %s에 삽니다.", country, address);
        System.out.println(desc4);
    }
}

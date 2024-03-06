package ch06.lecture.p7access;

public class C01MyClass {
    // access modifier (접근 제한자, 접근 제어자)
    // 멤버 (필드, 메소드)
    // 생성자, 클래스

    // public : 모든 곳에서 접근 가능 (가장 넓은 범위)
    // protected
    // (package private, default)
    // private : 클래스 내에서만 접근 가능 (가장 좁은 범위)

    // public field
    public int age;

    // private field

    private String address;

    void method1() {

        System.out.println(age);
        System.out.println(address);
    }
}

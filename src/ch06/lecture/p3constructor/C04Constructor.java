package ch06.lecture.p3constructor;

public class C04Constructor {
    public static void main(String[] args) {
        C04MyClass o1 = new C04MyClass("son", 33);
        C04MyClass o2 = new C04MyClass("lee", 22);
    }
}

class C04MyClass {
    String name;
    int age;

    C04MyClass(String initiatlName, int initialAge) {
        name = initiatlName;
        age = initialAge;
    }
}

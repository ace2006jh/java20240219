package ch07.lecture.p3casting;

public class C05InstanceOf {
    public static void main(String[] args) {
        A a = new B();

        System.out.println(a instanceof A);  //t
        System.out.println(a instanceof B);  //t
        System.out.println(a instanceof C);  //f
        System.out.println(a instanceof D);  //f
        System.out.println(a instanceof E);  //t
        System.out.println(a instanceof F);  //f
    }
}

// @formatter:off
class A {}
class B extends A {}
class D extends B {}
class E extends B {}
class C extends A {}
class F extends C {}

package ch07.lecture.p4abstract;

public class C02Abstract {
    public static void main(String[] args) {
        C02Animal a2 = new C02Fish();
        C02Animal a1 = new C02Cat();
        a1.breathe();
        a2.breathe();
    }
}

// @formatter:off
abstract class C02Animal {
    //abstract method : 몸통이 없는 메소드
    //하위 클래스가 꼭 재정의 해야함
    //추상메소드가 있다면 클래스는 꼭 추상 클래스
    abstract public void breathe();
}
// 구현 클래스 (concrete class)
class C02Fish extends C02Animal {
    @Override
    public void breathe() {
    System.out.println("아가미 호흡");
    }
}
class C02Cat extends C02Animal {
    @Override
    public void breathe() {
    System.out.println("폐 호흡");
    }}


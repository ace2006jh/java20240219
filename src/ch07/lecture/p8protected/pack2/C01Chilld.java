package ch07.lecture.p8protected.pack2;

import ch07.lecture.p8protected.pack1.C01Parent;

public class C01Chilld extends C01Parent {
    private void method9() {
        //package private은 접근 불가
//        super.method1();
        // protected 접근가능
        super.method2();
    }
}

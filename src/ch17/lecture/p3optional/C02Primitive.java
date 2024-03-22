package ch17.lecture.p3optional;

import java.util.OptionalInt;

public class C02Primitive {
    //OptinalInt : 기본터압 int 값을 가지고 있을 수 았는 컨테이너
    //OptionaDouble : double을 가지고 있을 수 았는 컨테이너
    //OptionaLong : Long값을 가지고 있을 수 았는 컨테이너

    public static void main(String[] args) {
        OptionalInt o1 = OptionalInt.of(3);
        OptionalInt o2 = OptionalInt.of(50);
        OptionalInt o3 = OptionalInt.empty();

        //isPresent 값이 있으면 true
        //isEmpty 값이 없으면 true
        o1.isPresent(); // t
        o3.isPresent(); // f
        o1.isEmpty();
        o3.isEmpty();

        // getAsInt : 값 얻기 ( 없으면 Exception)
        o1.getAsInt();
    }
}

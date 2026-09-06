package extends1.super2;

public class ClassB extends ClassA {
    public ClassB(int a) {
        // this(a, 0); 예외적으로  super 생성 전에 사용할 수 있음
        //super(); // 기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a=" + a);
    }

    public ClassB(int a, int b) {
        super(); // 기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a=" + a + " b=" + b);
    }
}

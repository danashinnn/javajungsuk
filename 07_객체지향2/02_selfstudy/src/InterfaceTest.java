class AAA {
    public void call(I i) { // 인터페이스 I를 구현한 클래스의 인스턴스만 매개변수로 받음
        i.method();
    } 
}

interface I {
    public abstract void method();
}

class BBB implements I {
    public void method() {
        System.out.println("BBB 클래스의 메서드입니다.");
    }
}

class CCC implements I {
    public void method() {
        System.out.println("CCC 클래스의 메서드입니다.");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        AAA a = new AAA();
        a.call(new BBB());
        a.call(new CCC());
    }
}

class Point {
    int x;
    int y;
}

// class Circle extends Point { // 상속
//     int r;
// }

class Circle {
    Point p;// = new Point(); -> 참조변수의 초기화 1. 객체 바로 생성해주던가
    int r;

    Circle() {
        p = new Point(); // 참조변수의 초기화 2. 생성자
    }
}

public class InheritanceTest {
    public static void main(String[] args) {
            Circle c = new Circle();
            c.p.x = 10;
            c.p.y = 20;
            c.r = 30;
            System.out.println("c.p.x = "+c.p.x);
            System.out.println("c.p.y = "+c.p.y);
            System.out.println("c.r = "+c.r);

            System.out.println(c.toString()); //toString 메서드는 참조변수 뒤에 쓰이면 [클래스이름+객체주소값]을 문자열로 반환
            System.out.println(c);
    }
}

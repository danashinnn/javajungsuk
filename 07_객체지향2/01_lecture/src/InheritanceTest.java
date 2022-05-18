class Point {
    int x;
    int y;
}

// class Circle extends Point { //상속
//     int r;
// }

class Circle { //포함
    Point p = new Point();
    int r;
}

public class InheritanceTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        // c.x = 1;
        // c.y = 2;
        // c.r = 3;
        // System.out.println("c.x = "+c.x);
        // System.out.println("c.y = "+c.y);
        // System.out.println("c.r = "+c.r);
        c.p.x = 4;
        c.p.y = 5;
        c.r = 6;
        System.out.println("c.p.x = "+c.p.x);
        System.out.println("c.p.y = "+c.p.y);
        System.out.println("c.r = "+c.r);
    }
}

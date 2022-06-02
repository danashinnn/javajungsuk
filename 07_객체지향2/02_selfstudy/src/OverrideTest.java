class Point3 extends Object {
    int x;
    int y;

    int a;
    int b;

    Point3(int a, int b) {
        this.a = a;
        this.b = b;
    }

    //Object클래스의 toString()을 오버라이딩
    public String toString() {
        return "a : "+a+", b : "+b;
    }

    String getLocation() {
        return "x : "+x+", y : "+y;
    }
}

// class Point3D extends Point3 {
//     int r;
    
//     //조상의 getLocation()을 오버라이딩
//     String getLocation() {
        
//         return "x : "+x+", y : "+y+", r : "+r;
//     }
// }

public class OverrideTest {
    public static void main(String[] args) {
        // Point3D p = new Point3D();
        // p.x = 1;
        // p.y = 2;
        // p.r = 3;
        // System.out.println(p.getLocation());

        Point3 p3 = new Point3(100, 200);
        System.out.println(p3.toString());
        System.out.println(p3); //위와 같음
    }
}

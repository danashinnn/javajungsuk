class Point {
    int x;
    int y;
    String getLocation() {
        return "x : "+x+", y : "+y;
    }
}

class Point3D extends Point {
    int z;

    Point3D(int xi, int yi, int zi) {
        this.x = xi;
        this.y = yi;
        this.z = zi;
    }
    //조상의 getLocation()을 오버라이딩
    String getLocation() {
        return "x : "+x+", y : "+y+", z: "+z;
    }
}

public class OverrideTest {
    public static void main(String[] args) {
        Point3D p = new Point3D(3,4,5);
        // p.x = 3;
        // p.y = 4;
        // p.z = 5;
        System.out.println(p.getLocation());
    }
}

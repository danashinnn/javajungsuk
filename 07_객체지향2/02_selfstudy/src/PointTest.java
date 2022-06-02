class Point4 {
    int x;
    int y;

    Point4() {}
    Point4(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x : "+x+", y : "+y;
    }
}

class Point4D extends Point4 {
    int z;

    Point4D() {}
    Point4D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    String getLocation() {
        return "x : "+x+", y : "+y+", z : "+z;
    }
}

public class PointTest {
    public static void main(String[] args) {
        Point4D p4 = new Point4D(1, 2, 3);
        System.out.println(p4.getLocation());
    }
}

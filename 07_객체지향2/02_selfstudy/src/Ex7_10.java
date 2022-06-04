abstract class Unit {
    int x,y;
    abstract void move(int x, int y);
    void stop() {
        System.out.println("stop!");
    }
}

class Marine extends Unit {
    void move(int x, int y) {
        System.out.println("Marine move. "+x+", "+y);
    }

    void stimpack() {
        System.out.println("Marine stimpack.");
    }
}

class Tank extends Unit {
    void move(int x, int y) {
        System.out.println("Tank move. "+x+", "+y);
    }

    void shot() {
        System.out.println("Tank shot.");
    }
}

class Dropship extends Unit {
    void move(int x, int y) {
        System.out.println("Dropship move. "+x+", "+y);
    }

    void fly() {
        System.out.println("Dropship fly.");
    }
}

public class Ex7_10 {
    public static void main(String[] args) {
        Unit[] group = {new Marine(), new Tank(), new Dropship()};
        //Unit[] group = new Unit[3];
        //group[0] = new Marine();
        //group[1] = new Tank();
        //group[2] = new Dropship();

        group[0].move(100, 200);
        group[1].move(50, 20);
        group[2].move(45, 25);
    }
}

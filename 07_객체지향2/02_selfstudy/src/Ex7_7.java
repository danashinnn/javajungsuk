class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive, brrr~~");
    }

    void stop() {
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water!!!");
    }
}

public class Ex7_7 {
    public static void main(String[] args) {
        Car c = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        c = (Car)fe; //형변환(생략가능)
        //c.water(); Car클래스에는 water()가 없어서 사용불가
        fe2 = (FireEngine)c; //형변환(생략불가)
        fe2.water();
    }
}

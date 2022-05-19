class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive, Brrrr~");
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
        c = fe; // c = (Car)fe; 에서 형변환 생략
        // 조상 <- 자손 형변환인 경우 생략 가능
        
        c.drive();
        // c.water(); 에러. Car타입 참조변수로는 water() 호출할 수 없음
        fe2 = (FireEngine)c; // 자손 <- 조상 형변환인 경우 생략 불가
        fe2.water();
    }
}
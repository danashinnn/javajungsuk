import java.util.ArrayList;

interface Eatable {}

class Fruit implements Eatable {
    public String toString() {return "Fruit";}
}

class Apple extends Fruit {
    public String toString() {return "Apple";}
}

class Grape extends Fruit {
    public String toString() {return "Grape";}
}

class Toy {
    public String toString() {return "Toy";}
}

public class Ex12_3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();
        // FruitBox<Grape> grapeBox = new FruitBox<Apple>(); 
        // 에러. 참조변수에 대입된 타입과 생성자에 대입된 타입이 불일치
        // FruitBox<Toy> toyBox = new FruitBox<Toy>(); // 에러. Toy클래스가 Fruit클래스의 자손이 아님
        Box<Toy> toyBox2 = new Box<Toy>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        // appleBox.add(new Grape()); // 에러. Grape는 Apple의 자손 아님
        grapeBox.add(new Grape());

        System.out.println("fruitBox = " + fruitBox);
        System.out.println("appleBox = " + appleBox);
        System.out.println("grapeBox = " + grapeBox);
    }
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}
// Fruit의 자손이면서 Eatable 구현한 클래스만 타입 변수로 들어올 수 있음

class Box<T> {
    ArrayList<T> list = new ArrayList<T>(); // item을 저장할 list
    void add(T item) {list.add(item);} // 박스에 item 추가
    T get(int i) {return list.get(i);} // 박스에서 item을 꺼냄
    int size() {return list.size();}
    public String toString() {return list.toString();}
}

class Product {
    int price; //제품 가격
    int bonusPoint; //제품 구매 시 제공하는 보너스 점수

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0); //보너스 점수는 제품 가격의 10%
    }
}

class Tv1 extends Product {
    Tv1() {
        //조상클래스의 생성자 Product(int price)를 호출
        super(100); //Tv1의 가격을 100만원으로 함
    }

    //Object클래스의 toString()을 오버라이딩함
    public String toString() {return "Tv";}
}

class Computer extends Product {
    Computer() {
        //조상클래스의 생성자 Product(int price)를 호출
        super(200); //Tv1의 가격을 100만원으로 함
    }

    //Object클래스의 toString()을 오버라이딩함
    public String toString() {return "Computer";}
}

class Buyer {
    int money = 1000; //소유금액
    int bonusPoint = 0;

    void buy(Product p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 구입할 수 없습니다.");
            return;
        }

        money -= p.price; //가진 돈에서 구입한 제품의 가격을 뺌
        bonusPoint += p.bonusPoint; //제품의 보너스 점수를 추가함
        //System.out.println(p.toString()+"를 구입하셨습니다.");
        System.out.println(p+"를 구입하셨습니다.");
    }
}

public class Ex7_8 {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv1()); //리모컨(참조변수)가 없어서 다시 호출할 수 없음.
        //Product p = new Tv1(); 
        //b.buy(p);
        b.buy(new Computer());

        System.out.println("현재 잔액은 "+b.money+"원입니다.");
        System.out.println("현재 보너스 점수는 "+b.bonusPoint+"점입니다.");
    }
}

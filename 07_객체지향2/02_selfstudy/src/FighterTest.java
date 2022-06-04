abstract class Unit2 {
    int x, y;
    abstract void move(int x, int y);
    void stop() {
        System.out.println("멈춥니다.");
    }
}

interface Fightable { // 인터페이스의 모든 메서드는 public abstract (예외없음, 생략가능)
    void move(int x, int y); // public abstract 생략됨
    void attack(Fightable f); // public abstract 생략됨
}

class Fighter extends Unit2 implements Fightable {
    // 오버라이딩 규칙 : 조상(Fightable)보다 접근제어자(public) 범위가 좁으면 안 됨
    public void move(int x, int y) {
        System.out.println(x+", "+y+"로 이동.");
    }

    public void attack(Fightable f) { // attack 메서드는 [Fightable 인터페이스를 구현한 클래스의 인스턴스]만 매개변수로 받음
        System.out.println(f+"를 공격.");
    }

    Fightable getFightable() { // Fightable 인터페이스를 구현한 인스턴스를 반환하는 메서드
        Fightable f = new Fighter(); // Fighter 인스턴스를 생성해서 반환
        return f;
    }
}

public class FighterTest {
    public static void main(String[] args) {
        Unit2 u = new Fighter();
        u.move(10, 20);
        // u.attack(new Fighter()); -> Unit2에는 attack()이 없어서 호출불가
        u.stop();
        System.out.println();
        
        Fightable fa = new Fighter();
        fa.move(30, 40);
        fa.attack(new Fighter());
        // fa.stop(); -> Fightable에는 stop()이 없어서 호출불가
        System.out.println();
        
        Fighter f = new Fighter();
        f.move(100, 200);
        f.attack(new Fighter());
        Fightable f2 = f.getFightable();
        System.out.println(f2);
    }
}

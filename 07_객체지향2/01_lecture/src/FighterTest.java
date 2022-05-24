abstract class Unit2 {
    int x,y;
    abstract void move(int x,int y);
    void stop() {System.out.println("멈춥니다.");}
}

interface Fightable {//인터페이스의 모든 메서는 public abstract
    void move(int x,int y); //public abstract가 생략됨
    void attack(Fightable f); //public abstract가 생략됨
}

class Fighter extends Unit2 implements Fightable {
    //오버라이딩 규칙 : 조상보다 접근제어자가 범위가 좁으면 안 됨
    public void move(int x,int y) {
        System.out.println("["+x+", "+y+"로 이동");
    }
    public void attack(Fightable fi) {
        System.out.println(f+"를 공격");
    }
    //싸울 수 있는 상대를 불러온다.
    Fightable getFightable() {
        Fighter f = new Fighter(); //Fighter를 생성해서 반환
        return f;
    }
}

public class FighterTest {
    public static void main(String[] args) {
        Unit2 u = new Fighter();
        Fightable f = new Fighter();
        u.move(100, 200);
        //u.attack(new Fighter()); //Unit2에는 attack()이 없어서 호출 불가
        u.stop();

        f.move(100, 200);
        f.attack(new Fighter());
        //f.stop(); //Fightable에는 stop()이 없어서 호출 불가

        Fighter f = new Fighter();
        Fightable f2 = f.getFightable();
    }
}

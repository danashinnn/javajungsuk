abstract class Player {
    abstract void play(int pos);
    abstract void stop();
}

class AudioPlayer extends Player {
    void play(int pos) {
        System.out.println(pos+"위치부터 재생합니다.");
    }

    void stop() {
        System.out.println("정지합니다.");
    }
}

public class PlayerTest {
    public static void main(String[] args) {
        // Player p = new Player(); //에러. 추상클래스는 미완성클래스라서 객체 생성 불가
        // AudioPlayer ap = new AudioPlayer();
        Player p = new AudioPlayer(); //다형성
        p.play(52);
        p.stop();
    }
}

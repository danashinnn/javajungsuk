public class TvTest3 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println("t1의 현재 채널은 "+t1.channel+"입니다.");
        System.out.println("t2의 현재 채널은 "+t2.channel+"입니다.");

        t2 = t1; //t1이 저장하고 있는 객체 주소값을 t2에 저장한다
        t1.channel = 7;
        System.out.println("t1의 채널값을 7로 변경하였습니다.");

        System.out.println("t1의 현재 채널은 "+t1.channel+"입니다.");
        System.out.println("t2의 현재 채널은 "+t2.channel+"입니다.");
    }
}

class Tv {

    String color;
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}
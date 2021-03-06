import java.util.*;

public class FlowEx7 {
    public static void main(String[] args) {
        System.out.print("(1)가위, (2)바위, (3)보 중에서 하나를 선택하세요.>");

        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int com = (int)(Math.random()*3) + 1;

        System.out.println("당신은 ["+user+"]입니다.");
        System.out.println("컴퓨터는 ["+com+"]입니다.");

        switch(user-com) {
            case -2: case 1:
                System.out.println("당신이 이겼습니다.");
                break;
            case -1: case 2:
                System.out.println("당신이 졌습니다.");
                break;
            default:
                System.out.println("비겼습니다.");
        }
    }
}

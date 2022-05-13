import java.util.*;

public class FlowEx32 {
    public static void main(String[] args) {
        int num = 0;

        while(true) {
        System.out.println("(1) 치킨");
        System.out.println("(2) 피자");
        System.out.println("(3) 파스타");
        System.out.print("원하는 메뉴를 고르세요. (종료는 0) >");

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if(num==0) {
            System.out.println("프로그램이 종료되었습니다.");
            break;
        }else if(!(1<=num && num<=3)) {
            System.out.println("잘못된 번호를 누르셨습니다.");
            continue;
        }
        System.out.println("선택하신 메뉴는 "+num+"번입니다.");

        }
    }
}

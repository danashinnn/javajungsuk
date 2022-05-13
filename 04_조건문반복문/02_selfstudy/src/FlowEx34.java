import java.util.*;

public class FlowEx34 {
    public static void main(String[] args) {
        
        int menu = 0;
        int num = 0;

        Scanner sc = new Scanner(System.in);

        outer:
        while(true) {

            System.out.println("(1) 치킨");
            System.out.println("(2) 피자");
            System.out.println("(3) 파스타");
            System.out.print("원하는 메뉴를 선택하세요. (종료는 0) >");

            menu = sc.nextInt();

            if(menu==0) {
                System.out.println("주문을 종료합니다.");
                break;
            }else if(!(1<=menu && menu<=3)) {
                System.out.println("잘못된 번호를 누르셨습니다.");
                continue;
            }

            for(;;) {
                System.out.print("가격을 입력하세요. (입력 종료는 0, 전체 종료는 99) >");
                num = sc.nextInt();

                if(num==0) {
                    break;
                }else if(num==99) {
                    System.out.println("주문을 종료합니다.");
                    break outer;
                }
                switch(menu) {
                    case 1:
                        System.out.printf("가격은 %d입니다.%n", num);
                        break;
                    case 2:
                        System.out.printf("가격은 %d입니다.%n", num);
                        break;
                    case 3:
                        System.out.printf("가격은 %d입니다.%n", num);
                        break;
                }
            }
        }


    }
}

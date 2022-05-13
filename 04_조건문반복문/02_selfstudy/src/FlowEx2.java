import java.util.*;

/**
 * FlowEx2
 */
public class FlowEx2 {

    public static void main(String[] args) {
        int input;
        System.out.print("숫자를 하나 입력하세요.>");

        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();

        if(input==0) {
            System.out.println("입력하신 숫자는 0입니다.");
        }else {
            System.out.printf("입력하신 숫자는 %d입니다.%n", input);
        }
    }
}
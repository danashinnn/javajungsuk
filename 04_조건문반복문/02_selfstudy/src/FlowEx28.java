import java.util.*;

public class FlowEx28 {
    public static void main(String[] args) {
        
        int input = 0;
        int answer = (int)(Math.random()*100) + 1;

        do {
            System.out.print("1부터 100까지 중에서 숫자 하나를 입력해주세요. >");
            Scanner sc = new Scanner(System.in);
            input = sc.nextInt();

            if(input > answer) {
                System.out.println("더 작은 수를 입력해주세요.");
            } else if(input < answer) {
                System.out.println("더 큰 수를 입력해주세요.");
            }
        }while(input!=answer);
        System.out.println("정답입니다.");

    }
}

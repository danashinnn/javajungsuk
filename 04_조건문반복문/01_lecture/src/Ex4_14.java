import java.util.*;

public class Ex4_14 {
    public static void main(String[] args) {
        
        int sum = 0;
        int num = 0;
        System.out.print("숫자를 입력하세요.>");

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        while(num!=0) {
            sum += num%10;
            System.out.printf("입력한 수 : %d, 자리수 합 : %d%n", num, sum);

            num /= 10;
        }



    }
}

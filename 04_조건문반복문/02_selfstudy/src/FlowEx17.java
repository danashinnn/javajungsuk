import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args) {
        // for(int i=1;i<=10;i++) {
        //     for(int j=1;j<=i;j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        int num = 0;
        System.out.print("별을 찍을 라인 수를 입력하세요. >");

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for(int i=1;i<=num;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

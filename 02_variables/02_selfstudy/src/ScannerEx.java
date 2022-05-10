import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("두자리 정수를 입력해주세요.>");
        // String input = sc.nextLine();
        // int num = Integer.parseInt(input);
        int num = sc.nextInt();

        // System.out.println("입력내용 : " + input);
        System.out.printf("num = %d%n", num);
    }
}

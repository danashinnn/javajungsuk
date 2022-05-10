import java.util.*; // import문 추가

public class ScanfEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 클래스의 객체 생성
        System.out.print("두자리 정수를 입력해주세요.>");

        // int num = sc.nextInt();
        // System.out.println(num);

        String input = sc.nextLine();
        int num2 = Integer.parseInt(input);
        System.out.println(num2);
    }
}

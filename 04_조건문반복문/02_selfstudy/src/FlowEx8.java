import java.util.*;

public class FlowEx8 {
    public static void main(String[] args) {
        System.out.print("당신의 주민등록번호를 입력하세요. (예: 991102-1011211) >");

        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        char gender = num.charAt(7);
        
        switch(gender) {
            case '1': case '3':
                System.out.println("당신은 남성입니다.");
                break;
            case '2': case '4':
                System.out.println("당신은 여성입니다.");
                break;
            default:
                System.out.println("유효하지 않은 주민등록번호입니다.");
        }
    }
}

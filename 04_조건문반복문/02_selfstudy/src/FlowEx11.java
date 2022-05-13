import java.util.*;

public class FlowEx11 {
    public static void main(String[] args) {
        
        System.out.print("주민등록번호를 입력하세요. (예: 991102-1101111) >");
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        char gender = num.charAt(7);
        
        switch(gender) {
            case '1': case '3': 
                switch(gender) {
                    case '1':
                        System.out.println("당신은 2000년 이전에 태어난 남자입니다.");
                        break;
                    case '3':
                        System.out.println("당신은 2000년 이후에 태어난 남자입니다.");
                        break;
                }
                break;
            case '2': case '4': 
                switch(gender) {
                    case '2':
                        System.out.println("당신은 2000년 이전에 태어난 여자입니다.");
                        break;
                    case '4':
                        System.out.println("당신은 2000년 이후에 태어난 여자입니다.");
                        break;
                }
                break;
            default:
            System.out.println("유효하지 않은 주민등록번호입니다.");
        }
    }
}

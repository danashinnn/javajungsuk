import java.util.*;

public class FlowEx4 {
    public static void main(String[] args) {
        int score = 0;
        char grade = 'D';

        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 점수를 입력하세요.>");
        score = sc.nextInt();

        if(score >= 90) {
            grade = 'A';
        }else if(score >= 80) {
            grade = 'B';
        }else if(score >= 70) {
            grade = 'C';
        }

        System.out.printf("당신의 점수는 %d이고, 학점은 %c입니다.", score, grade);
    }
}

import java.util.*;

public class Ex4_5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = 'D';
        char op = ' ';
        System.out.print("당신의 점수를 입력해주세요.>");

        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();

        if(score >= 90) {
            grade = 'A';
            if(score >= 98) {
                op = '+';
            } else if (score < 94) {
                op = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if(score >= 88) {
                op = '+';
            } else if (score < 84) {
                op = '-';
            }
        } else if (score >= 70) {
            grade = 'C';
            if(score >= 78) {
                op = '+';
            } else if (score < 74) {
                op = '-';
            }
        } else {
            grade = 'D';
        }

        System.out.printf("당신의 점수는 %d점이고, 학점은 %c%c입니다. %n", score, op, grade);
    }
}

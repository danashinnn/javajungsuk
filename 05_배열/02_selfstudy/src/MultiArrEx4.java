import java.util.*;

public class MultiArrEx4 {
    public static void main(String[] args) {
        
        String[][] words = {
            {"chair","의자"},
            {"computer","컴퓨터"},
            {"book","책"}
        };

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<words.length; i++) {

            System.out.printf("Q%d. %s의 뜻은? >", i+1, words[i][0]);
            String input = sc.nextLine();

            if(input.equals(words[i][1])) {
                System.out.println("정답입니다.");
            }else {
                System.out.printf("오답입니다. 정답은 %s입니다.%n", words[i][1]);
            }
        }
    }
}

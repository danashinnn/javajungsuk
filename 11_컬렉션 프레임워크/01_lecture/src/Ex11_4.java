import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_4 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5; // Queue에 최대 5까지만 저장되도록 함
    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while(true) { // 무한반복문
            System.out.print(">>");
            try {
                // 화면으로부터 라인 단위로 입력받음
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim(); // trim은 입력된 문자의 앞뒤 공백 삭제함
                // 계속 입력을 받아서 입력한 명령어(input)에 따라 처리

                if("".equals(input)) continue; // 입력이 없으면 아래 건너뛰고 무한반복문의 시작으로 돌아감

                if(input.equalsIgnoreCase("q")) { // q를 입력하면 프로그램 종료
                    System.exit(0);
                } else if(input.equalsIgnoreCase("help")) {
                    System.out.println("help - 도움말을 보여줍니다.");
                    System.out.println("q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println("history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
                } else if(input.equalsIgnoreCase("history")) {
                    save(input); // 입력받은 명령어를 저장하고,

                    // LinkedList의 내용을 보여줌
                    LinkedList list = (LinkedList)q; // 형변환

                    final int SIZE = list.size();
                    for(int i=0; i<SIZE; i++) {
                        System.out.println((i+1) + "." + list.get(i));
                    }
                } else {
                    save(input);
                    System.out.println(input);
                }
            } catch(Exception e) {
                System.out.println("입력오류입니다.");
            }
        }
    }
    public static void save(String input) {
        // queue에 저장함
        if(!"".equals(input)) { // 빈 문자열이 아닐 때 = if(input!=null && !input.equals(""))
            q.offer(input); // 큐에 명령어 저장
        }
        // queue의 최대 크기를 넘으면 제일 처음 입력된 것을 삭제함
        if(q.size() > MAX_SIZE) {
            q.remove();
        }
    }
}

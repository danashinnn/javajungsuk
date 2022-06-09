import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myid", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234"); // key값이 같은 경우 마지막 value로 덮어쓰기 됨

        Scanner s = new Scanner(System.in); // 화면으로부터 라인 단위로 입력받음

        while(true) {
            System.out.println("id와 비밀번호를 입력해주세요.");
            System.out.print("id : ");
            String id = s.nextLine().trim(); // trim()은 앞뒤 공백을 없애줌
            
            System.out.print("pw : ");
            String pw = s.nextLine().trim();
            System.out.println();
            
            if(!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            if(!(map.get(id)).equals(pw)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            } else {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }
        }
    }
}

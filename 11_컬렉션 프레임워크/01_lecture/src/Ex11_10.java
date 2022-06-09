import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ex11_10 {
    public static void main(String[] args) {
        Set set = new HashSet();

        // set의 크기가 6보다 작은 동안 1~45 사이의 난수를 저장
        for(int i=0; set.size()<6; i++) {
            int num = (int)(Math.random()*45) + 1;
            //set.add(new Integer(num));
            set.add(num); // 컴파일러가 자동으로 위처럼 바꿔줌
        }

        // System.out.println(set); // 정렬하려면 순서 유지가 되어야 함 -> set은 정렬할 수 없기 때문에 set을 list로 옮기고 list를 정렬
        List list = new LinkedList(set); // LinkedList(Collection c) -> set의 모든 요소를 list에 저장
        // Collections.sort(List list) -> 매개변수로 list만 올 수 있음
        Collections.sort(list); // list를 정렬
        System.out.println(list); // list를 출력
    }
}

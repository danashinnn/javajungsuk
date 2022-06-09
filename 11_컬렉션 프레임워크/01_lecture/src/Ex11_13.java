import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_13 {
    public static void main(String[] args) {
        // Set set = new TreeSet(); // 범위 검색과 정렬에 유리 -> 출력하면 정렬돼서 나옴
        Set set = new HashSet(); // 출력하면 정렬 안 돼서 나옴

        for(int i=0; set.size()<6; i++) {
            int num = (int)(Math.random()*45 + 1);
            set.add(num); // set.add(new Integer(num));
        }

        System.out.println(set);
    }
}

class Test {}
class TestComp implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
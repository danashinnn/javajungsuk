import java.util.Arrays;
import java.util.Comparator;

public class Ex11_7 {
    public static void main(String[] args) {
        String[] strArr = {"cat","Dog","lion","tiger"};

        Arrays.sort(strArr); // String의 Comparable 구현에 의한 (compareTo) 기본정렬
        System.out.println("strArr = " + Arrays.toString(strArr));
        
        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분안함
        System.out.println("strArr = " + Arrays.toString(strArr));
        
        Arrays.sort(strArr, new Descending()); // 역순 정렬
        System.out.println("strArr = " + Arrays.toString(strArr));
    }
}

class Descending implements Comparator {
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable)o1;
            Comparable c2 = (Comparable)o2;
            return c1.compareTo(c2) * -1; 
            // -1을 곱해서 기본정렬 방식의 역으로 변경 (c1.compareTo(c2)가 기본정렬 기준임)
            // 또는 c2.compareTo(c1)과 같이 순서를 바꿔도 됨
        }
        return -1; // 비교대상 o1, o2가 comparable로 형변환 불가하면 비교할 수 없기 때문에 -1 반환
    }
}

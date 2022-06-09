import java.util.List;
import java.util.ArrayList;
import java.util.Enumeration;

import static java.util.Collections.*; // Collections를 생략 가능하게 해줌


public class Ex11_19 {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);
        
        addAll(list, 1,2,3,4,5); // 원래 Collections.addAll()인데 맨위 import문 덕분에 생략 가능
        System.out.println(list);
        
        rotate(list, 2); // 오른쪽으로 두번씩 자리 이동
        System.out.println(list);

        swap(list, 0, 2); // 첫번째와 세번째 교환
        System.out.println(list);

        shuffle(list); // (랜덤 섞기) 저장된 위치를 임의로 변경
        System.out.println(list);

        sort(list, reverseOrder()); // 역순 정렬, reverse(list)와 같은 결과
        System.out.println(list);
        
        sort(list); // 정렬
        System.out.println(list);
        
        // binarySearch 하기 전엔 반드시 정렬 먼저 해야함
        int idx = binarySearch(list, 3); // 3이 저장된 위치(index)
        System.out.println("index of 3 = " + idx);
        
        System.out.println("max = " + max(list));
        System.out.println("min = " + min(list));
        System.out.println("min = " + max(list, reverseOrder())); // 반대 정렬 방식의 최대값
        
        fill(list, 9); // list를 9로 채움
        System.out.println("list = " + list);
        
        List newList = nCopies(list.size(), 2); // list와 같은 크기의 새 list를 생성하고 2로 채움, 결과는 변경 불가
        System.out.println("newList = " + newList);
        
        System.out.println(disjoint(list, newList)); // 공통 요소가 없으면 true
        
        copy(list, newList); // newList에 있는 것을 list에 복사
        System.out.println("newList = " + newList);
        System.out.println("list = " + list);
        
        replaceAll(list, 2, 1); // list에 있는 2를 모두 1로 바꿈
        System.out.println("list = " + list);
        
        Enumeration e = enumeration(list); // Iterator와 같음. list에서 enumeration을 얻을 때 씀
        ArrayList list2 = list(e);
        
        System.out.println("list2 = " + list2);

    }
}

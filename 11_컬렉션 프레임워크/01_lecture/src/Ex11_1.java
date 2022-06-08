import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Ex11_1 {
    public static void main(String[] args) {
        // 기본 길이(용량, capacity)가 10인 ArrayList를 생성
        ArrayList list1 = new ArrayList(10);
        // ArrayList에는 객체만 저장 가능
        // autoboxing에 의해 기본형이 참조형으로 자동 변환
        list1.add(5);
        // list1.add(new Integer(5)); 위와 동일
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        // List sub = list1.subList(1, 4); sub는 읽기만 가능
        // ArrayList list2 = new ArrayList(sub); sub와 같은 내용의 ArrayList 생성
        ArrayList list2 = new ArrayList(list1.subList(1, 4));
        // subList로 만들어진 list는 읽기 전용이기 때문에, new ArrayList로 만들어줘야만 내용물 바꿀 수 있음
        print(list1, list2);
        
        // Collection은 인터페이스, Collections는 유틸 클래스(Collection을 다루는 데 필요한 메서드 제공)
        Collections.sort(list1); // list1과 list2를 정렬
        Collections.sort(list2); // Collections.sort(List 1)
        print(list1, list2);
        
        // list1이 list2의 모든 요소를 포함하고 있는지 묻기
        System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
        
        list2.add("B");
        list2.add("C");
        list2.add(3, "A"); // 추가할 위치(index 3), 추가할 문자열
        print(list1, list2);
        
        list2.set(3, "AA");
        print(list1, list2);
        
        list1.add(0, "1"); // 추가할 위치(index 0), 추가할 문자열
        System.out.println("String 1의 index = " + list1.indexOf("1")); // String "1"의 index 위치는 0
        System.out.println("Integer 1의 index = " + list1.indexOf(1)); // Integer 1의 index 위치는 2
        print(list1, list2);
        
        list1.remove(1); // index 1에 있는 객체(0) 삭제
        list1.remove(new Integer(1)); // 1을 삭제
        print(list1, list2);
        
        // list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제
        System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
        print(list1, list2);

        // list2에서 list1에 포함된 객체들을 삭제
        // 1. get(i)를 통해 list2에서 하나씩 꺼냄
        // 2. contains()를 통해 꺼낸 객체가 list1에 있는지 확인
        // 3. remove(i)를 통해 해당 객체를 list2에서 삭제
        for(int i=list2.size()-1; i>=0; i--) { // size()는 list에 들어있는 객체의 개수 구함
            if(list1.contains(list2.get(i))) {
                list2.remove(i);
            }
        }
        print(list1, list2);
    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println();
    }
}
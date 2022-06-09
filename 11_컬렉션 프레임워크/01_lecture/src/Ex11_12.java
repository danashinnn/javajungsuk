import java.util.HashSet;
import java.util.Iterator;

public class Ex11_12 {
    public static void main(String[] args) {
        HashSet setA = new HashSet();
        HashSet setB = new HashSet();
        HashSet setHab = new HashSet();
        HashSet setKyo = new HashSet();
        HashSet setCha = new HashSet();

        setA.add("1");
        setA.add("2");
        setA.add("3");
        setA.add("4");
        setA.add("5");
        System.out.println("A = " + setA);
        
        setB.add("4");
        setB.add("5");
        setB.add("6");
        setB.add("7");
        setB.add("8");
        System.out.println("B = " + setB);

        // setA.retainAll(setB); // 교집합 : setA와 setB의 공통 요소인 것만 남김
        // setA.addAll(setB); // 합집합 : setA에 setB의 모든 요소를 더함 (중복 제외)
        // setA.removeAll(setB); // 차집합 : setA와 setB의 공통 요소를 제거
        System.out.println(setA);

        // 교집합
        Iterator it = setB.iterator();
        while(it.hasNext()) { // setB를 하나씩 돌면서
            Object tmp = it.next(); // it에서 하나씩 꺼냄
            if(setA.contains(tmp)) { // 꺼낸 게 setA에 있는지 확인
                setKyo.add(tmp);
            }
        }

        // 차집합
        it = setA.iterator();
        while(it.hasNext()) {
            Object tmp = it.next();
            if(!setB.contains(tmp)) { // setB에 없는지 확인
                setCha.add(tmp);
            }
        }
        
        // 합집합
        it = setA.iterator();
        while(it.hasNext()) {
            setHab.add(it.next()); // setA의 모든 요소 집어넣음
        }
        
        it = setB.iterator();
        while(it.hasNext()) {
            setHab.add(it.next()); // setB의 모든 요소 집어넣음
        }

        System.out.println("A와 B의 교집합 = " + setKyo);
        System.out.println("A와 B의 합집합 = " + setHab);
        System.out.println("A와 B의 차집합 = " + setCha);
    }
}

import java.util.ArrayList;

public class RoundTest3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(); // list에는 객체만 저장 가능
        list.add(100); // JDK1.5 이전에는 에러였음
        // list.add(new Integer(100)); 위처럼 입력하면 컴파일러가 자동으로 이렇게 변환해줘서 기본형이 객체로 바뀜 (오토박싱)

        // Integer i = list.get(0); list에 저장된 첫번째 객체를 꺼냄
        // int i = list.get(0).intValue(); Integer 객체를 꺼내서 intValue()를 사용하여 int로 변환
        int i = list.get(0); // intValue() 없지만 컴파일러가 코드를 자동으로 바꿔줘서 int로 저장 (언박싱)
    }

}
public class Ex9_16 {
        // 오토박싱과 언박싱 (기본형과 참조형간의 자동 형변환) 

        int i = 10;

        // 기본형을 참조형으로 형변환(형변환 생략가능)
        // 원래는 기본형을 참조형으로 형변환 할 수 없었으나(형변환 연산자 사용불가가 원칙) 허용으로 바뀜
        // 왼쪽 식을 컴파일러가 자동으로 오른쪽 식으로 바꿔줌
        Integer intg = (Integer)i; // Integer intg = Integer.valueOf(i);
        Object obj = (Object)i; // Object obj = (Object)Integer.valueOf(i);

        Long lng = 100L; // 래퍼 클래스 타입 참조변수에 기본형 저장 가능
        // Long lng = new Long(100L); 원래는 이렇게 객체를 만들어서 저장해야함

        int i2 = intg + 10; // 참조형과 기본형간의 연산 가능 (참조형이 자동으로 기본형으로 바뀜)
        long l = intg + lng; // 참조형간의 덧셈도 가능

        Integer intg2 = new Integer(20);
        int i3 = (int)intg2; // 참조형을 기본형으로 형변환도 가능(형변환 생략가능)
    }
}

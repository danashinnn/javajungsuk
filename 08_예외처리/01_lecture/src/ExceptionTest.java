/**
 * ExceptionTest
 */
public class ExceptionTest {

    public static void main(String[] args) {
        // 프로그램 오류의 종류는 크게 세 가지가 있음.

        // 1. 컴파일 에러 (컴파일할 때 발생하는 에러)
        // system.out.println(args[0]); // 대문자 S로 써야하는데 소문자 s로 써서 컴파일 에러
        // 컴파일러가 하는 일 : 구문체크, 번역, 소스코드 최적화, 생략된 코드 추가

        // 2. 런타임 에러 (실행할 때 발생하는 에러) : 문법적 에러는 컴파일러가 체크해도, 코드 실행할 때 에러 생기는 건 컴파일러가 알 수 없음
        System.out.println(args[0]); // 매개변수로 넘어온 값이 없는데 그걸 사용하려고 해서 에러남
        // 컴파일할 때 문제가 없다고 해서 실행할 때 문제가 없는 건 아님

        // 3. 논리적 에러 (작성 의도와 다르게 동작)

    }
}
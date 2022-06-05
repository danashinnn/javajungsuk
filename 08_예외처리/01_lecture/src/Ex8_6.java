public class Ex8_6 {
    public static void main(String[] args) {
        try {
            // 1. 연산자 new를 이용해 발생시키려는 예외 클래스의 객체를 만든 다음
            Exception e = new Exception("고의로 발생시켰음.");
            // 2. 키워드 throw를 이용해 예외를 발생시킴
            throw e;
            // throw new Exception("고의로 발생시켰음.");
        } catch(Exception e) {
            System.out.println("에러 메시지 : "+e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료되었음.");
    }
}

// 오류
// 1. 컴파일에러
// 2. 런타임에러 - 에러(심각) / 예외(미약)
// 3. 논리적에러

// 예외1 - Exception과 그 자손 - 컴파일러가 예외처리 여부를 체크, 예외처리(try-catch) 필수 / checked예외
// 예외2 - RuntimeException와 그 자손 - 컴파일러가 예외처리 여부를 체크 안 함, 예외처리(try-catch) 선택 / unchecked예외
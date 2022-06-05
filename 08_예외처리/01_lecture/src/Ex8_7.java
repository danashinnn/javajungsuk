public class Ex8_7 {
    public static void main(String[] args) {
        try { // Exception과 그 자손은 반드시 예외처리를 해줘야 함
            throw new Exception(); // Exception을 고의로 발생시킴
        } catch(Exception e) {

        }

        // RuntimeException과 그 자손은 예외처리를 하지 않아도 컴파일이 됨 (예외가 발생하지 않는 건 아님)
        throw new RuntimeException();
    }
}

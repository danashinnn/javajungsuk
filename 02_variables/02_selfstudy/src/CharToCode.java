public class CharToCode {
    public static void main(String[] args) {
        char ch = 'A';
        int code = (int)ch; // 어떤 문자의 유니코드를 알고 싶을 때 char형 변수에 저장된 값을 정수형 int 타입으로 변환
        
        System.out.printf("%c = %d(%#x)%n", ch, code, code);
    
        // 문자 'A'의 유니코드는 65이고 이는 16진수로 0x41이다
    }
}

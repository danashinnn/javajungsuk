public class PrintfEx1 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010; // 8진수 10, 10진수로는 8
        int hexNum = 0x10; // 16진수 10, 10진수로는 16
        int binNum = 0b10; // 2진수 10, 10진수로는 2

        System.out.printf("b=%d%n", b);
        System.out.printf("s=%d%n", s);
        System.out.printf("c=%c, %d %n", c, (int)c); // 문자 'A'와 그 숫자코드 
        System.out.printf("finger=[%5d]%n", finger);
        System.out.printf("finger=[%-5d]%n", finger);
        System.out.printf("finger=[%05d]%n", finger);
        System.out.printf("big=%d%n", big); 
        System.out.printf("hex=%#x%n", hex); // #을 붙이면 접두사 표시
        System.out.printf("octNum=%o, %d%n", octNum, octNum); // %o는 8진수로 출력
        System.out.printf("hexNum=%x, %d%n", hexNum, hexNum); // %h는 16진수로 출력
        System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum); // 정수를 2진수로 변환하여 문자열로 반환하는 메서드 사용

        System.out.printf("%o%n", 8); // 내가 입력한 10진수 값 8을 8진수로 출력하기
    }
}

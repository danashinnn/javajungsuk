public class OperatorEx6 {
    public static void main(String[] args) {
        byte a = 10; // byte의 범위는 -128 ~ 127 이기에 범위 내 값이므로 에러 안 뜸
        byte b = 20;
        byte c = (byte)(a + b); // 연산자 +로 인해 a+b의 값은 int로 자동 형변환됨 -> int를 byte 타입 변수에 저장하려니 에러가 뜸 -> byte로 형변환해야함
        System.out.println(c);

        byte d = 10;
        byte e = 30;
        byte f = (byte)(d * e); // 값이 byte의 범위를 넘는 300이기 때문에 값손실이 일어남
        System.out.println(f);

        int i = 1_000_000;
        int j = 2_000_000;
        long k = (long)i * j;
        System.out.println(k);

        long x = 1_000_000 * 1_000_000; // int 타입과 int 타입의 연산 결과는 int
        long y = 1_000_000 * 1_000_000L; // int 타입과 long 타입의 연산 결과는 long
        System.out.println("x = " + x); // x의 연산 결과가 int 타입의 최대값을 넘어 오버플로우 발생
        System.out.println("y = " + y);
    }
}

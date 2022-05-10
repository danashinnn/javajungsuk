public class PrintfEx1 {
    public static void main(String[] args) {
        System.out.println(10/3);
        System.out.println(10.0/3);
        System.out.printf("%.2f%n", 10.0/3); // 소수점 둘째자리까지 출력
        
        System.out.printf("%d%n", 15); // 15   10진수
        System.out.printf("%o%n", 15); // 17   8진수
        System.out.printf("%x%n", 15); // f    16진수
        // 2진수로 출력해주는 지시자는 없기 때문에 toBinaryString이라는 메서드(정수를 2진 문자열로 변환) 사용해야함
        System.out.printf("%s%n", Integer.toBinaryString(15)); // 1111   2진수

        // 8진수와 16진수에 접두사 붙이려면 #을 써주기
        System.out.printf("%#o%n", 15); // 017
        System.out.printf("%#x%n", 15); // 0xf
        System.out.printf("%#X%n", 15); // 0XF

        // 실수 출력을 위한 지시자 %f, 지수형식 %e, 간략한 형식 %g
        float f = 123.4567890f;
        System.out.printf("%f%n", f); // 123.456787 (float 정밀도가 7자리라서)
        System.out.printf("%e%n", f); // 1.234568e+02 (지수형식)
        System.out.printf("%g%n", 123.456789); // 123.457 (소수점 포함 7자리)
        System.out.printf("%g%n", 0.00000001); // 1.00000e-8

        // 자리수 맞춰 출력하기
        System.out.printf("[%5d]%n", 10);
        System.out.printf("[%-5d]%n", 10);
        System.out.printf("[%05d]%n", 10);

        double d = 1.23456789;
        System.out.printf("%14.10f%n", d); // 맨앞 공백 2개, 마지막 0 2개 더하여 소수점 포함 총 14자리

        System.out.printf("[%s]%n", "www.codechobo.com");
        System.out.printf("[%20s]%n", "www.codechobo.com");
        System.out.printf("[%-20s]%n", "www.codechobo.com");
        System.out.printf("[%.10s]%n", "www.codechobo.com"); // 부분출력
    }
}

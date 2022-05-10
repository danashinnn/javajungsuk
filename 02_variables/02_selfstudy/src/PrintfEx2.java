public class PrintfEx2 {
    public static void main(String[] args) {
        String url = "www.codechobo.com";
        float f1 = .10f; // 0.10
        double d = 1.23456789;

        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1); // %f는 소수점 아래 6자리까지만 출력
        System.out.printf("d=%f%n", d);
        System.out.printf("d=%14.10f%n", d); // 소수점 포함 전체 14자리 중 소수점 아래 10자리

        System.out.printf("[%s]%n", url);
        System.out.printf("[%20s]%n", url);
        System.out.printf("[%-20s]%n", url);
        System.out.printf("[%.8s]%n", url); // 왼쪽에서 8글자만 출력
    }
}

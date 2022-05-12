public class Ex3_9 {
    public static void main(String[] args) {
        int a = 1_000_000; // 10의 6제곱
        int b = 2_000_000; // 10의 6제곱

        // a * b = 2,000,000,000,000   10의 12제곱
        // 그러나 int의 범위는 10의 9제곱이므로 오버플로우 일어남
        // 올바른 값을 내기 위해서는 a와 b 중 최소 하나를 long으로 형변환해야함
        long c = (long)a * b;
        System.out.println(c);
    }
}

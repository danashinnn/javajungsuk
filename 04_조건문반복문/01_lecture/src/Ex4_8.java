public class Ex4_8 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i <= 5; i++) {
            sum += i;
            System.out.printf("1부터 %2d까지의 합은 %2d입니다.%n", i, sum);
        }
    }
}

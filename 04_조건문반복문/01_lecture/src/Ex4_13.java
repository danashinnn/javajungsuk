public class Ex4_13 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 1;

        while(sum <= 100) {
            System.out.printf("1부터 %d까지 더하면 %d이다.%n", i, sum);
            sum += ++i;
        }
    }
}

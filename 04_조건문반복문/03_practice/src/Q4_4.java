public class Q4_4 {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        int s = 1;

        for(int i=1;sum<100;i++,s=-s) {
            num = i * s;
            sum += num;
        }

        System.out.printf("i = %d, sum = %d%n", num, sum);
    }
}

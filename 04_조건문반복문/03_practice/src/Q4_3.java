public class Q4_3 {
    public static void main(String[] args) {
        int sum = 0;
        int sum2 = 0;

        for(int i=1;i<=10;i++) {
            sum += i;
            sum2 += sum;
        }
        System.out.println("결과는 "+sum2+"입니다.");
    }
}

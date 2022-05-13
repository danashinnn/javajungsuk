public class Q4_6 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        for(a=1;a<=6;a++) {
            for(b=1;b<=6;b++) {
                if((a+b)==6) {
                    System.out.printf("[%d, %d]%n", a, b);
                }
            }
            // System.out.println();
        }
    }
}

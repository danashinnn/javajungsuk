public class Q4_5 {
    public static void main(String[] args) {
        int i = 1;

        while(i<=10) {
            int j=1;
            while(j<=i) {
                j++;
                System.out.print("*");
            }
            i++;
            System.out.println();
        }
    }
}

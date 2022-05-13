public class Ex4_11 {
    public static void main(String[] args) {
        
        // 구구단 출력
        for(int i=2; i <= 9; i++) {
            for(int j=1; j <= 9; j++) {
                System.out.println(i+" X "+j+" = "+(i*j));
            }
            System.out.println();
        }

        for(int x=1; x<=5; x++) {
            for(int y=1; y<=10; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

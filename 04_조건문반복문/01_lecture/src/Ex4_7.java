public class Ex4_7 {
    public static void main(String[] args) {
        int num = 0;

        // 1~6 사이의 난수를 5번 출력하라
        // for (int i = 1; i <= 5; i++) {
        //     num = (int)(Math.random()*6) + 1;
        //     System.out.println(num);
        // }

        // 1~10 사이의 난수를 10번 출력하라
        // for (int j = 1; j <= 10; j++) {
        //     System.out.println((int)(Math.random()*10)+1);
        // }

        // -5~5 사이의 난수를 5번 출력하라
        for (int k = 1; k <= 5; k++) {
            System.out.println((int)(Math.random()*11)-5);
        }
    }
}

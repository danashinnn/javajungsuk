public class Ex5_9 {
    public static void main(String[] args) {
        int[][] score = {
            {100,100,100},
            {20,20,20,},
            {30,30,30,},
            {40,40,40,},
            {50,50,50,}
        };
        int korTotal = 0, engTotal = 0, mathTotal = 0;
        int korSum = 0, engSum = 0, mathSum = 0;

        System.out.println("번호 국어 영어 수학 총점");
        System.out.println("=======================");
        
        for(int i=0;i<score.length;i++) {
            int sum = 0;
            float average = 0.0f;
            
            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];
            System.out.printf("%3d", i+1);
            
            for(int j=0;j<score[i].length;j++) {
                sum += score[i][j];
                System.out.printf("%5d",score[i][j]);
            }
            
            average = sum/(float)score[i].length;
            korSum += score[i][0];
            engSum += score[i][1];
            mathSum += score[i][2];
            
            System.out.printf("%5d %.1f%n", sum, average);
        }
        System.out.println("=======================");
        System.out.printf("총점 : %d %5d %5d", korSum, engSum, mathSum);
    }
}

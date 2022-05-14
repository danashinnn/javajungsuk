import java.util.Arrays; // ctrl+shift+o 자동으로 import문 추가

/**
 * Ex5_1
 */
public class Ex5_1 {

    public static void main(String[] args) {
        // int[] score; // 배열 score를 선언 (참조변수 선언)
        // score = new int[5]; // 배열의 생성 (int 저장공간 5개)

        int[] score = new int[5]; // 배열의 선언과 생성을 동시에
        score[3] = 100;

        System.out.println("score[0]="+score[0]);
        System.out.println("score[1]="+score[1]);
        System.out.println("score[2]="+score[2]);
        System.out.println("score[3]="+score[3]);
        System.out.println("score[4]="+score[4]);

        int value = score[3];
        System.out.println("value="+value);

        int[] arr = new int[5]; // 길이가 5인 int배열 arr을 생성
        System.out.println("arr.length="+arr.length);

        for(int i=0;i<arr.length;i++) {
            System.out.println("arr["+i+"]="+arr[i]);
        }

        int[] iArr = {100, 95, 80, 70, 60};
        for(int i=0;i<iArr.length;i++) {
            System.out.println(iArr[i]);
        }
        System.out.println(Arrays.toString(iArr));

        String[] strArr = {"가위", "바위", "보"};

        for(int i=0; i<10; i++) {
            int tmp = (int)(Math.random()*3);
            System.out.println(strArr[tmp]);
        }

        String str = "ABCDE";
        char ch = str.charAt(3);
        System.out.println(ch);
        String str1 = str.substring(1,4); // 인덱스 1부터 3까지 BCD
        System.out.println(str1);
        String str2 = str.substring(1); // 인덱스 1부터 끝까지
        System.out.println(str2);

        int[] arrr = {0,1,2,3,4};
        int[][] arrr2 = {
            {11,12},
            {13,14}
        };
        System.out.println(Arrays.toString(arrr));
        System.out.println(Arrays.deepToString(arrr2));

        String[] strarr = {"aaa","bbb"};
        String[] strarr2 = {"aaa","bbb"};
        String[][] str2d = {{"aaa","bbb"},{"ccc","ddd"}};
        String[][] str2d2 = {{"aaa","bbb"},{"ccc","ddd"}};
        System.out.println(Arrays.equals(strarr, strarr2));
        System.out.println(Arrays.deepEquals(str2d, str2d2));

        int[] arrr3 = Arrays.copyOf(arrr, arrr.length);
        int[] arrr4 = Arrays.copyOf(arrr, 3);
        int[] arrr5 = Arrays.copyOf(arrr, 7);
        int[] arrr6 = Arrays.copyOfRange(arrr, 2, 4); // 인덱스 2부터 3까지 출력
        System.out.println(Arrays.toString(arrr3));
        System.out.println(Arrays.toString(arrr4));
        System.out.println(Arrays.toString(arrr5));
        System.out.println(Arrays.toString(arrr6));

        int[] test = {3,2,1,5,4};
        Arrays.sort(test);
        System.out.println(Arrays.toString(test));
    }
}
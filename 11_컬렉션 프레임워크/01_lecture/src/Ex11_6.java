import java.util.Arrays;

public class Ex11_6 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[][] arr2D = {{11,12,13}, {21,22,23}};

        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arr2D = " + Arrays.deepToString(arr2D));
        
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, 3);
        int[] arr4 = Arrays.copyOf(arr, 7);
        int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
        int[] arr6 = Arrays.copyOfRange(arr, 0, 7);

        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println("arr3 = " + Arrays.toString(arr3));
        System.out.println("arr4 = " + Arrays.toString(arr4));
        System.out.println("arr5 = " + Arrays.toString(arr5));
        System.out.println("arr6 = " + Arrays.toString(arr6));

        int[] arr7 = new int[5];
        Arrays.fill(arr7, 9);
        System.out.println("arr7 = " + Arrays.toString(arr7));
        
        Arrays.setAll(arr7, i -> (int)(Math.random()*6)+1); // 랜덤값으로 배열 채우기
        System.out.println("arr7 = " + Arrays.toString(arr7));

        
        for(int i : arr7) { // 향상된 for문 (arr7의 요소를 순서대로 꺼내서 i에 집어넣기)
     // for(int x=0; x<arr7.length; x++) {
     //     int i = arr7[x];
            char[] graph = new char[i]; // 길이가 i인 배열 만들어짐
            Arrays.fill(graph, '*'); // 배열을 *로 채움
            System.out.println(new String(graph)+i); // 배열을 문자열로 바꿈
        }

        String[][] str2D = new String[][]{{"aaa","bbb"}, {"AAA","BBB"}};
        String[][] str2D2 = new String[][]{{"aaa","bbb"}, {"AAA","BBB"}};

        System.out.println(Arrays.equals(str2D, str2D2)); // false
        System.out.println(Arrays.deepEquals(str2D, str2D2)); // true

        char[] chArr = {'A','B','C','D','E'};

        System.out.println("chArr = " + Arrays.toString(chArr));
        System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B')); // binarySearch 하기 전에는 반드시 정렬 먼저
        System.out.println("= After sorting =");
        Arrays.sort(chArr);
        System.out.println("chArr = " + Arrays.toString(chArr));
        System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B'));
    }
}

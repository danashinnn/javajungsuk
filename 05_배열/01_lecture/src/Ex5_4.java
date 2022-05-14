import java.util.Arrays;

public class Ex5_4 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<100;i++) { // 100번 섞음
            int num = (int)(Math.random()*10); //0부터 9 중에서 한 값을 임의로 얻음
            int tmp = arr[0];
            arr[0] = arr[num];
            arr[num] = tmp;
        }

        System.out.println(Arrays.toString(arr));
    }
}

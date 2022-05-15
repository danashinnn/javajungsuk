import java.util.Arrays;

public class ArrayEx10 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] = (int)(Math.random()*10));
        }
        System.out.println();

        // Arrays.sort(arr);
        // for(int i=0;i<arr.length;i++) {
        //     System.out.print(arr[i]);
        // }

        for(int i=0; i<arr.length-1; i++) {
            boolean changed = false;

            for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]) {
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                    changed = true;
                }
            }

            if(!changed) break; // !changed가 true이면 break. -> 위 for문에서 true된 경우는 break안함 

            for(int k=0;k<arr.length;k++) {
                System.out.print(arr[k]);
            }
            System.out.println();
        }
    }
}

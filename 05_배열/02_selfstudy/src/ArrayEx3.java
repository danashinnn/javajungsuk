import java.util.*;;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for(int i=0; i<arr.length; i++) {
            arr[i] = i+1;
        }

        System.out.println("변경 전 :");
        System.out.println("arr.length : "+arr.length);
        for(int i=0; i<arr.length; i++) {
            System.out.println("arr["+i+"] : "+arr[i]);
        }        

        int[] arr2 = new int[arr.length*2];

        for(int i=0; i<arr.length; i++) {
            arr2[i] = arr[i];
        }

        arr = arr2;

        System.out.println("변경 후 :");
        System.out.println("arr.length : "+arr.length);
        for(int i=0; i<arr.length; i++) {
            System.out.println("arr["+i+"] : "+arr[i]);
        }   

        int[] arr3 = Arrays.copyOf(arr, 10);
        for(int i=0;i<arr3.length;i++) {
            System.out.println(arr3[i]);
        }
        System.out.println(Arrays.toString(arr3));
    }
}

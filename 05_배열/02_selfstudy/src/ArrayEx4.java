import java.util.*;;

public class ArrayEx4 {
    public static void main(String[] args) {
        char[] abc = {'a','b','c','d'};
        char[] num = {'1','2','3','4','5','6','7','8','9'};
        System.out.println(abc);
        System.out.println(num);

        char[] result = new char[abc.length+num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);

        System.arraycopy(abc, 0, num, 0, abc.length);
        System.out.println(num);

        System.arraycopy(abc, 1, num, 6, 3);
        System.out.println(num);

        int[] arr = {1,2,3,4,5,6,7,8};
        int[] arr2 ={10,20,30,40,50,60,70,80,90};
        int[] arr3 ={2,4,6,8,10,12,14,16,18};
        int[] arr4 = {1,3,6,7,8};

        arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println("arr2="+Arrays.toString(arr2));
        arr3 = Arrays.copyOfRange(arr, 1, 5);
        System.out.println("arr3="+Arrays.toString(arr3));
        System.arraycopy(arr, 3, arr4, 1, 3);
        System.out.println(Arrays.toString(arr4));
    }
}

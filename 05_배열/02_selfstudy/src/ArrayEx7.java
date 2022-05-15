public class ArrayEx7 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for(int i=0; i<arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i]);
        }
        System.out.println();

        for(int i=0; i<50; i++) {
            int num = (int)(Math.random()*10);
            
            int tmp = arr[0];
            arr[0] = arr[num];
            arr[num] = tmp;
        }

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}

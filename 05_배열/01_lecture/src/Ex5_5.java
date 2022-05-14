public class Ex5_5 {
    public static void main(String[] args) {
        int[] arr = new int[45];

        for(int i=0; i<arr.length; i++) {
            arr[i] = i+1;
        }

        int tmp = 0;
        int num = 0;

        for(int i=0; i<6; i++) {
            num = (int)(Math.random()*45);
            tmp = arr[i];
            arr[i] = arr[num];
            arr[num] = tmp;
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);
    }
}

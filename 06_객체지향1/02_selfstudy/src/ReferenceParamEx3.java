public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = {3,2,1,6,5,4};

        printArr(arr);
        sortArr(arr);
        printArr(arr);
        System.out.println("sum = "+sumArr(arr));
    }

    static void printArr(int[] arr) {
        System.out.print("[");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println("]");
    }
    
    static void sortArr(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]) {
                    int tmp = 0;
                    tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    static int sumArr(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}

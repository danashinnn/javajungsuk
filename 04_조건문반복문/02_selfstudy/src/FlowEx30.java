public class FlowEx30 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        while(true){
            if(sum>100) {
                break;
            }
            i++;
            sum += i;
        }
        System.out.println("i = "+i+", sum = "+sum);
    }
}

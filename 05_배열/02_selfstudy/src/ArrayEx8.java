public class ArrayEx8 {
    public static void main(String[] args) {
        int[] ball = new int[45];

        for(int i=0; i<ball.length; i++) {
            ball[i] = i+1;
        }

        for(int j=0; j<10; j++) {
            int num = (int)(Math.random()*45);
            int tmp = ball[num];
            ball[num] = ball[j];
            ball[j] = tmp;
            
        }

        for(int i=0; i<10; i++) {
            System.out.println("ball["+i+"] = "+ball[i]);
        }
    }
}

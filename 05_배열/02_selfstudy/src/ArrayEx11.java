public class ArrayEx11 {
    public static void main(String[] args) {
        int[] a = new int[20];
        int[] b = new int[10];

        for(int i=0; i<a.length; i++) {
            a[i] = (int)(Math.random()*10)+1;
            System.out.print(a[i]+", ");
        }

        System.out.println();

        for(int i=0; i<a.length; i++) {
            b[a[i]-1]++;
        }
        for(int i=0; i<b.length; i++)
        System.out.println((i+1)+"의 개수 : "+b[i]);
    }
}

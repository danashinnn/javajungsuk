public class OperatorEx32 {
    public static void main(String[] args) {
        int x, y, z;
        int absX, absY, absZ;
        char signX, signY, signZ;

        x=10;
        y=-5;
        z=0;

        absX = x >= 0 ? x : -x; // absX는 x가 0보다 크거나 같으면 x이고 아니면 -x이다
        absY = y >= 0 ? y : -y;
        absZ = z >= 0 ? z : -z;

        signX = x > 0 ? '+' : (x==0 ? ' ' : '-'); // signX는 x가 0보다 크면 +이고 x가 0면 공백, 다 아니면 -이다
        signY = y > 0 ? '+' : (y==0 ? ' ' : '-'); 
        signZ = z > 0 ? '+' : (z==0 ? ' ' : '-'); 

        System.out.printf("x=%c%d%n", signX, absX);
        System.out.printf("y=%c%d%n", signY, absY);
        System.out.printf("x=%c%d%n", signZ, absZ);
    }
}

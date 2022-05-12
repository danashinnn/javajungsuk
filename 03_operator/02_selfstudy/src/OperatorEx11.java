public class OperatorEx11 {
    public static void main(String[] args) {
        char a = 'a'; // 유니코드 97 
        char d = 'd'; // 유니코드 100
        char zero = '0'; // 유니코드 48
        char two = '2'; // 유니코드 50

        System.out.printf("'%c' - '%c' = %d%n", d, a, d-a);
        System.out.printf("'%c' - '%c' = %d%n", two, zero, two-zero);
        System.out.printf("'%c' = %d%n", a, (int)a);
        System.out.printf("'%c' = %d%n", d, (int)d);
        System.out.printf("'%c' = %d%n", zero, (int)zero);
        System.out.printf("'%c' = %d%n", two, (int)two);

    }
}

public class VarEx3 {
    public static void main(String[] args) {
        final int score = 100;
        System.out.println(score);

        boolean power = true;
        System.out.println(power);

        byte b = 127; // byte 범위는 -128 ~ 127
        int oct = 010; // 8진수, 10진수로 8
        int hex = 0x10; // 16진수, 10진수로 16
        System.out.println(b);
        System.out.println(oct);
        System.out.println(hex);
        // println 메서드는 값이 10진수로만 출력되며 접두사, 접미사는 출력되지 않음.
        // 만일 정수를 8진수나 16진수로 출력하려면 printf 메서드를 써야함.

        long l = 10_000_000_000L;
        float f = 3.14f;
        double d = 3.14;
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);

        System.out.println(10.);
        System.out.println(.10);
        System.out.println(10f);
        System.out.println(1e3);
    }
}

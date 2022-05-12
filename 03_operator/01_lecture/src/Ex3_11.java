public class Ex3_11 {
    public static void main(String[] args) {
        double pi = 3.141592;

        // 소수점 네번째 자리에서 반올림하기
        double shortPi = Math.round(pi * 1000) / 1000.0;
        System.out.println(shortPi);

        // 소수점 세번째 자리까지만 표시하기
        System.out.println((int)(pi * 1000)/1000.0);
    }
}

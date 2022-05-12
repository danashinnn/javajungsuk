public class OperatorEx16 {
    public static void main(String[] args) {
        float pi = 3.141592f;

        // 소수점 넷째자리부터 버리기
        float shortPi = (int)(pi * 1000) / 1000f;
        System.out.println(shortPi);

        // 소수점 넷째자리에서 반올림하기
        float shortPi2 = Math.round(pi * 1000) / 1000f;
        System.out.println(shortPi2);
    }
}

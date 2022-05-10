public class Ex2_12 {
    public static void main(String[] args) {
        String str = "3";

        // 문자열 "3"을 숫자 3으로 변환
        System.out.println(str.charAt(0) - '0');
        System.out.println('3' - '0' + 1); // 숫자 4
        System.out.println(Integer.parseInt("3") + 1); // 숫자 4
        System.out.println("3" + 1); // 숫자 1이 문자열 "1"로 바뀌어서 문자열 31
        System.out.println((char)(3 + '0')); // 문자 '0'은 숫자로 48

    }
}

public class Ex9_10 {
    public static void main(String[] args) {
        int iVal = 100;
        String strVal = String.valueOf(iVal); // int를 string으로 변환
        // String strVal = iVal + "";

        double dVal = 200.0;
        String strVal2 = dVal + ""; // int를 String으로 변환하는 또 다른 방법

        // 문자열을 숫자로 바꾸는 방법
        double sum = Integer.parseInt("+"+strVal) + Double.parseDouble(strVal2);
        double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);

        // join()은 여러 문자열 사이에 구분자를 넣어서 결합
        System.out.println(String.join("",strVal,"+",strVal2,"=")+sum);
        System.out.println(strVal+"+"+strVal2+"="+sum2);
    }
}

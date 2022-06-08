import java.text.DecimalFormat;

public class Ex10_7 {
    public static void main(String[] args) {
        // DeciamlFormat 클래스
        // 숫자를 문자열로 바꿀 때는 format() 사용
        // 문자열을 숫자로 바꿀 때는 parse() 사용

        DecimalFormat df = new DecimalFormat("#,###.##");
        DecimalFormat df2 = new DecimalFormat("#.###E0");

        try {
            // 콤마가 들어가있는 문자열을 parse()를 사용해서
            Number num = df.parse("1,234,567.89"); 
            System.out.println("1,234,567.89" + " -> ");

            // double 타입의 숫자로 바꿈
            double d = num.doubleValue(); // d = 1234567.89
            System.out.print(d + " -> ");

            System.out.println(df2.format(num)); // 지수 형식의 문자열로 바꿈
        } catch (Exception e) {}
    }
    
}
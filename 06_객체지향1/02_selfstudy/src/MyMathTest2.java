class MyMath2 {
    long a,b; //인스턴스 변수

    //인스턴스 메서드 : 인스턴스 변수를 이용해서 작업하므로 매개변수가 필요없음
    long add() {return a+b;}
    long subtract() {return a-b;}
    long multiply() {return a*b;}
    double divide() {return a/b;}

    //클래스 메서드 : 인스턴스 변수 사용할 수 없고, 매개변수로 작업함
    static long add(long a, long b) {return a+b;}
    static long subtract(long a, long b) {return a-b;}
    static long multiply(long a, long b) {return a*b;}
    static double divide(double a, double b) {return a/b;}
}

public class MyMathTest2 {
    public static void main(String[] args) {
        
        //클래스 메서드 호출 (클래스이름.메서드이름(매개변수들))
        System.out.println(MyMath2.add(200L,100L));
        System.out.println(MyMath2.subtract(200L,100L));
        System.out.println(MyMath2.multiply(200L,100L));
        System.out.println(MyMath2.divide(200.0,100.0));
    
        //인스턴스 메서드 호출을 위해 인스턴스를 생성
        MyMath2 mm = new MyMath2();
        mm.a = 200L;
        mm.b = 100L;

        //인스턴스 메서드 호출 (참조변수이름.메서드이름())
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());
    }
}

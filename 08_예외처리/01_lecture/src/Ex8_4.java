public class Ex8_4 {
    public static void main(String[] args) {
        
        // 예외가 발생하면 이를 처리할 catch블럭을 찾아 내려감
        // 일치하는 catch블럭이 없으면, 예외는 처리 안 됨
        // Exception은 모든 예외의 최고조상이므로, 
        // Exception이 선언된 catch블럭은 모든 예외를 처리할 수 있음
        // 그래서 Exception이 선언된 catch블럭은 맨 마지막에 위치해야함

        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0); // 예외 발생
            System.out.println(4); // 실행되지 않음
        } catch(ArithmeticException ae) {
            if (ae instanceof ArithmeticException) {
                System.out.println("True");
            }
            System.out.println("ArithmeticException");
        } catch(Exception e) {
            System.out.println("Exception");
        }
        System.out.println(6);
    }
}

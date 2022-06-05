public class Ex8_2 {
    public static void main(String[] args) {
        // try블럭 내에서 예외가 발생한 경우

        System.out.println(1);
        try {
            System.out.println(0/0); // 예외 발생
            System.out.println(2); // 실행되지 않음 
        } catch(ArithmeticException ae) { // 발생한 예외와 일치하는 catch블럭이 있는지 확인함
            System.out.println(3); // 일치하는 catch블럭을 찾게 되면, 그 catch블럭 내의 문장들을 수행하고
        }
        System.out.println(4); // 전체 try-catch문을 빠져나가 그 다음 문장을 계속 수행함
        // 만약 일치하는 catch블럭을 찾지 못하면, 예외는 처리되지 않음(프로그램 비정상 종료)
    }
}

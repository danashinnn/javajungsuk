public class Ex8_5 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0/0); // 예외발생하여 예외객체 생성됨
            System.out.println(4); // 실행되지 않음
        } catch(ArithmeticException ae) { // 매개변수 ae가 예외객체 가리킴 
            ae.printStackTrace(); // 예외발생 당시의 호출스택에 있던 메서드의 정보와 예외 메시지를 화면에 출력
            System.out.println("예외메세지 : " + ae.getMessage()); // 발생한 예외클래스의 인스턴스에 저장된 메시지 얻음
        }

        System.out.println(6);
    }
}

//static 멤버를 사용할 때 클래스 이름을 생략할 수 있게 해줌

import static java.lang.System.out; //System.out을 out만으로 참조 가능
import static java.lang.Math.*; // Math클래스의 모든 static 멤버 사용 시 클래스 이름 생략할 수 있게 해줌

public class Ex7_6 {
    public static void main(String[] args) {
        //System.out.println(Math.random());
        out.println(random());

        //System.out.println(Math.PI);
        out.println(PI);
    }    
}

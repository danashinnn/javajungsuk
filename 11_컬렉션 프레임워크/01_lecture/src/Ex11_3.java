import java.util.EmptyStackException;
import java.util.Stack;

public class Ex11_3 {
    public static void main(String[] args) {
        Stack st = new Stack<>();
        String expression = "((3+5)*8-2)";

        System.out.println("expression : " + expression);

        try {
            for(int i=0; i < expression.length(); i++) {
                char ch = expression.charAt(i); // expression 안에서 한 글자씩 꺼냄

                if(ch=='(') {
                    st.push(ch + ""); // 꺼낸 글자가 '('면 스택에 집어넣음
                } else if (ch==')') {
                    st.pop(); // 꺼낸 글자가 ')'면 스택에서 꺼냄
                }
            }

            if(st.isEmpty()) { // 스택이 비어있으면
                System.out.println("괄호가 일치합니다.");
            } else {
                System.out.println("괄호가 일치하지 않습니다.");
            }
        } catch (EmptyStackException e) {
            System.out.println("괄호가 일치하지 않습니다. 222"); 
            // 스택에서 다 꺼냈는데도 문자열에서는 ')'가 남아있어서 꺼낼 게 없는 경우 예외 발생
        }
    }
}

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Ex11_5 {
    public static void main(String[] args) {
        Collection list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator(); // list에서 iterator() 호출하여 Iterator 객체 얻음

        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
        
        // iterator는 1회용이라 다 쓰고나면 다시 얻어와야 함
        it = list.iterator(); // 새로운 iterator 객체 얻음

        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}

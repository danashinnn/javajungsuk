import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex11_18 {
    public static void main(String[] args) {
        String[] data = {"A","K","A","K","D","K","A","K","K","K","Z","D"};

        HashMap map = new HashMap();

        for(int i=0; i<data.length; i++) { // 빈도수 세기
            if(map.containsKey(data[i])) {
                int value = (int)map.get(data[i]);
                map.put(data[i], value+1); // 기존 value 값에 +1
            } else {
                map.put(data[i], 1); // map에 포함된 요소 아니면 value를 1로 저장
            }
        }

        Iterator it = map.entrySet().iterator();

        while(it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            int value = (int)entry.getValue();
            System.out.println(entry.getKey() + " : " + printBar('#',value) + " " + value);
        }
    }

    private static Object printBar(char c, int value) {
        String str = "";
        for(int i=1; i<=value; i++) {
            str += c;
        }
        return str;
    }
}

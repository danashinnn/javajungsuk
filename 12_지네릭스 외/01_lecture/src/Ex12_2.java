import java.util.*;

public class Ex12_2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("자바왕", 1, 1));
        list.add(new Student("자바짱", 1, 2));
        list.add(new Student("홍길동", 2, 1));

        // Iterator it = list.iterator();
        Iterator<Student> it = list.iterator();
        while(it.hasNext()) {
            // Student s = (Student)it.next(); // 지네릭스를 사용하지 않으면 형변환 필요
            // System.out.println(((Student)it.next()).name); // 지네릭스 안 썼을 때

            // Student s = it.next();
            // System.out.println(s.name);
            System.out.println(it.next().name); // 위 두줄을 한번에 줄여서
        }
    } 
}

class Student {
    String name = "";
    int ban; // 반
    int no; // 번호

    Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban; 
        this.no = no;
    }
}

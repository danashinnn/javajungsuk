import java.util.HashSet;
import java.util.Objects;

public class Ex11_11 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc"); // 중복이라 저장 안 됨
        set.add(new Person("David",10));
        set.add(new Person("David",10));

        System.out.println(set);
    }
}

// equals()와 HashSet()을 오버라이딩해야 바르게 동작
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ":" + age;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) return false;

        Person p = (Person)obj;
        return this.name.equals(p.name) && this.age==p.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age); // iv들만 괄호 안에 넣어주면 됨 (객체를 구별하는 기준이 iv니까, iv가 같으면 같은 객체)
    }
}

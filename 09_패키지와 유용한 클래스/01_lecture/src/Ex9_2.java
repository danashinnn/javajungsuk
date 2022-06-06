class Person {
    long id;

    public boolean equals(Object obj) {
        if(!(obj instanceof Person)) return false;
        // return id==((Person)obj).id;
        Person p = (Person)obj;
        return this.id==p.id; //Person클래스의 id와 매개변수로 들어온 obj(p)의 id 비교
    }

    Person(long id) {
        this.id = id;
    }
}

public class Ex9_2 {
    public static void main(String[] args) {
        Person p1 = new Person(8011081112223L);
        Person p2 = new Person(8011081112223L);

        if(p1.equals(p2)) {
            System.out.println("p1과 p2는 같은 사랍입니다.");
        } else {
            System.out.println("p1과 p2는 다른 사람입니다.");
        }
    }
}

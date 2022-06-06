import java.util.Objects;

class Card {
    String kind;
    int number;

    Card() {
        this("Spade", 1);
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    // Object클래스의 toString메서드를 오버라이딩
    public String toString() {
        return "kind : "+kind+", number : "+number;
    }

    // Object클래스의 equals메서드를 오버라이딩
    public boolean equals(Object obj) {
        if(!(obj instanceof Card)) return false;
        Card c = (Card)obj;
        return this.kind.equals(c.kind) && this.number==c.number;
    }

    // equals메서드를 오버라이딩하면 hashCode메서드도 오버라이딩 해야함
    public int hashCode() {
        return Objects.hash(kind, number);
    }
}

public class Ex9_4 {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();
        Card c3 = new Card("Heart", 4);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));

        // equals가 true일 때 hash값도 똑같이 나와야 함
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());

        if(c1.equals(c2)) {
            System.out.println("c1과 c2는 같습니다.");
        } else {
            System.out.println("c1과 c2는 다릅니다.");
        }

        if(c1.equals(c3)) {
            System.out.println("c1과 c3는 같습니다.");
        } else {
            System.out.println("c1과 c3는 다릅니다.");
        }
    }
}

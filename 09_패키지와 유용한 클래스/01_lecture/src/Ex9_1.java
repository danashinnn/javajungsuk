public class Ex9_1 {

    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if (v1.equals(v2)) {
            System.out.println("v1과 v2는 같습니다.");
        } else {
            System.out.println("v1과 v2는 다릅니다.");
        }
    }
}

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }

    // Value클래스의 조상인 Object클래스의 equals메서드 오버라이딩해서 주소가 아닌 value 비교
    public boolean equals(Object obj) {
        // return this==obj; 원래는 이건데 이러면 객체의 주소값을 비교하는 거라서
        // return this.value==obj.value; value값끼리 비교하는 걸로 바꿔줌
        // obj는 Object 인스턴스라서 value라는 iv가 없기 때문에 형변환을 해줘야 함.
        // 참조변수 형변환 전에는 instanceof 반드시 확인 필요
        if(!(obj instanceof Value)) return false;
        Value v = (Value)obj; 
        return this.value == v.value;
    }
}
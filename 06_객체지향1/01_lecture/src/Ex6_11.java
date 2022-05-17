public class Ex6_11 {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
        Data2 d2 = new Data2();
    }
}

class Data1 {
    int value;
    // 이 클래스에 생성자가 하나도 없기 때문에 컴파일러가 기본 생성자 Data1() {}를 자동 추가해줌
}

class Data2 {
    int value;

    Data2() {} // 기본 생성자

    Data2(int x) { // 매개변수 있는 생성자
        value = x;
    }
}

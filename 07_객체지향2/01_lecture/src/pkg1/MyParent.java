package pkg1;

//public class와 소스파일명은 일치해야함

public class MyParent { // 접근제어자를 public으로 해야 다른 패키지에서 접근 가능
    private int prv; //같은 클래스
    int dft; //같은 패키지
    protected int prt; //같은 패키지 + 다른 패키지에 있는 자손
    public int pub; //접근제한 없음

    public void printMembers() {
        System.out.println(prv); //OK
        System.out.println(dft); //OK
        System.out.println(prt); //OK
        System.out.println(pub); //OK
    }
}

class MyParentTest { // 접근제어자가 (default)
    public static void main(String[] args) {
        MyParent p = new MyParent();
        System.out.println(p.prv); //에러. 같은 클래스가 아니라서
        System.out.println(p.dft); //OK
        System.out.println(p.prt); //OK
        System.out.println(p.pub); //OK

    }
}

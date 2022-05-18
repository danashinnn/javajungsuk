package pkg2;

import pkg1.MyParent;

class MyChild extends MyParent {
    public void printMembers() {
        System.out.println(prv); // 같은 패키지의 같은 클래스만 접근 가능
        System.out.println(dft); // 같은 패키지만 접근 가능
        System.out.println(prt); //OK
        System.out.println(pub); //OK
    }
}

public class MyParentTest2 {
    public static void main(String[] args) {
        MyParent p = new MyParent();
        System.out.println(p.prv); //에러. 같은 클래스가 아니라서
        System.out.println(p.dft); //에러. 같은 패키지가 아니라서
        System.out.println(p.prt); //에러. 같은 패키지도 아니고, 다른 패키지에 있는 자손도 아니라서
        System.out.println(p.pub); //OK
    }
}

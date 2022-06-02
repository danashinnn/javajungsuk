package pkg2;

import pkg1.ParentTest;

class MyChild extends ParentTest {
    public void printMembers() {
        // System.out.println(prv);
        // System.out.println(dft);
        System.out.println(prt);
        System.out.println(pub);
    }
}

public class ParentTest2 {
    public static void main(String[] args) {
        ParentTest p = new ParentTest();
        // System.out.println(p.prv);
        // System.out.println(p.dft);
        // System.out.println(p.prt);
        System.out.println(p.pub);
    }
}

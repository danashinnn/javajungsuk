package pkg1;

public class ParentTest {
    private int prv = 0;
    int dft = 1;
    protected int prt = 2;
    public int pub = 3;

    public void printMembers() {
        System.out.println(prv);
        System.out.println(dft);
        System.out.println(prt);
        System.out.println(pub);
    }
}

class Parent {
    public static void main(String[] args) {
        ParentTest p = new ParentTest();
        // System.out.println(p.prv);
        System.out.println(p.dft);
        System.out.println(p.prt);
        System.out.println(p.pub);
    }
}

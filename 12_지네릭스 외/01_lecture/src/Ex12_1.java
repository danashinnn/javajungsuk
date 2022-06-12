import java.util.*;

class Product3 {};
class Tv3 extends Product3 {};
class Audio3 extends Product3 {};

class Ex12_1 {
    public static void main(String[] args) {
        ArrayList<Product3> productList = new ArrayList<Product3>();
        ArrayList<Tv3> tvList = new ArrayList<Tv3>();
        // ArrayList<Product3> tvList = new ArrayList<Tv3>(); // 에러
        // List<Tv3> tvList = new ArrayList<Tv3>(); // OK. 다형성

        productList.add(new Tv3()); // public boolean add(Product e) {
        productList.add(new Audio3());

        tvList.add(new Tv3()); // public boolean add(Tv e) {
        tvList.add(new Tv3());
        // tvList.add(new Audio3()); // 에러

        printAll(productList);
        // printAll(tvList); // 컴파일 에러 발생
    }

    public static void printAll(ArrayList<Product3> list) {
        for(Product3 p : list) {
            System.out.println(p);
        }
    }
}
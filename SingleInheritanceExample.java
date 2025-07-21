// File name: SingleInheritanceExample.java

class A {
    int i, j;
    void getData(int a, int b) {
        i = a;
        j = b;
    }
}

class B extends A {
    int k;
    void getK(int c) {
        k = c;
    }
    void sum() {
        int total = i + j + k;
        System.out.println("Sum of i, j, k = " + total);
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
        B obj = new B();
        obj.getData(10, 20);
        obj.getK(30);
        obj.sum();
    }
}

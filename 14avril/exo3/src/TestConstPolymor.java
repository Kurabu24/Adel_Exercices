class A {
    public static int x = 4;
    public int y;

    public A() {
        this(6);
    }

 public A(int x){A.x++;y=x;}

    public static void f(A a1) {
        A.x++;
    }

    public void f(int y) {
        this.y = y;
    }

    public String g() {
        return "POO en Java";
    }

    public String h() {
        return this.g();
    }
}

class B extends A {
    public B() {
    }

    public String g() {
        return "POO en C++";
    }

    public String h() {
        return super.h();
    }
}

public class TestConstPolymor {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        A.f(a1);
        a2.f(17);
        System.out.println(A.x + " " + a1.y + " " + a2.y);
        System.out.println(a1.g());
        System.out.println(a2.h());
        A a3 = a1;
        A a4 = a2;
        System.out.println(A.x + " " + a3.y + " " + a4.y);
    }
}
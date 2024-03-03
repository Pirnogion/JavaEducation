package lr7;

class A {
    public char c;

    public A(char c) {
        this.c = c;
    }

    public A(A a) {
        this.c = a.c;
    }
}

class B extends A {
    public String s;

    public B(String s, char c) {
        super(c);
        this.s = s;
    }

    public B(B b) {
        super(b);
        this.s = b.s;
    }
}

class C extends B {
    public int i;

    public C(int i, String s, char c) {
        super(s, c);
        this.i = i;
    }

    public C(C c) {
        super(c);
        this.i = c.i;
    }

    @Override
    public String toString() {
        return "C{" +
                "c=" + c +
                ", s='" + s + '\'' +
                ", i=" + i +
                '}';
    }
}

public class Program4 {
    private static C c1 = new C(1, "NOTS", 'k');
    private static C c2 = new C(c1);

    public static void main(String[] args) {
        System.out.println(c1);
        System.out.println(c2);
    }
}

class A {
    int x;

    public A(int x) {
        this.x = x;
    }

    public int metodo1() {
        x = x + 1;
        return x;
    }
}

class B {
    int y;

    public B(int y) {
        this.y = y;
    }

    public int metodo2() {
        y = y + 1;
        return y;
    }
}

class C {
    A a;
    B b;

    public C(int x, int y) {
        a = new A(x);
        b = new B(y);
    }

    public void metodo() {
        int X = a.metodo1();
        int Y = b.metodo2();
        System.out.println("x = " + X);
        System.out.println("y = " + Y);
    }
}


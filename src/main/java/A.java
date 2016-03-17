class A {
    public int f() {
        return 1;
    }
}

class B extends A {
    public int f() {
        return 2;
    }
}

class MainAB {
    public static void main(String[] args) {
        A instance = new B();
        System.out.println(instance.f());
    }
}

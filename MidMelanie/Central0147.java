interface A {
    public void aaa();
}

interface B extends A {
    
}

class Central0147 implements A,B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0147 obj = new Central0147();
        System.out.println("main");
        obj.aaa();
    }
}

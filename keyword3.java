abstract class A
{
    abstract void m1();
    void m2()
    {
        System.out.println("This is a concrete method.");
    }
}

class B extends A
{
    void m1() {
        System.out.println("B's implementation of m1.");
    }
}

public class Main
{
    public static void main(String args[])
    {
        B b = new B();
        b.m1();
        b.m2();
    }
}

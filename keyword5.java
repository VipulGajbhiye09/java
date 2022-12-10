// Java program to demonstrate use of static blocks
  
class Test
{
    static int a = 15;
    static int b;
  
    // static block
    static {
        System.out.println("Static block initialized.");
        b = a * 5;
    }
  
    public static void main(String[] args)
    {
       System.out.println("Value of a : "+a);
       System.out.println("Value of b : "+b);
    }
}

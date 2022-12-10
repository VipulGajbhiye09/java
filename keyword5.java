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

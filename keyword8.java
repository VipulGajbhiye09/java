//Java code for using 'this' keyword

class Test
{
    int a;
    int b;
     
    Test(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    
    void display()
    {
        System.out.println("a = " + a + "  b = " + b);
    }

public class Test
{
    int a;
    int b;
     
    Test()
    {
        a = 5;
        b = 25;
    }
    
    void display(Test obj)
    {
        System.out.println("a = " +obj.a + "  b = " + obj.b);
    }
 
    void get()
    {
        display(this);
    }

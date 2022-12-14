class Test
{
    int a;
    int b;
    
    Test()                  //Default constructor
    { 
        this(10, 20);
        System.out.println("Inside  default constructor");
    }
      
    Test(int a, int b)     //Parameterized constructor
    {
        this.a = a;
        this.b = b;
        System.out.println("Inside parameterized constructor");
    }
    
    public static void main(String[] args)
    {
        Test object = new Test();
    }
}

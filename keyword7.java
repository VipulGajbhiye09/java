class Test
{
    static int a = m1();
      
    static {
        System.out.println("Inside static block");
    }
    
    static int m1() {
        System.out.println("from m1");
        return 20;
    }

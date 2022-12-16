public class Test {
 
    void display()
    {
        this.show();
    
       System.out.println("Inside display function");
    }
 
    void show()
    {
        System.out.println("Inside show function");
    }
 
    public static void main(String args[]) {
        Test t1 = new Test();
        t1.display();
    }
}

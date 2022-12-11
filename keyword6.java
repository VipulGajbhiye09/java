// Java program to demonstrate use of static keyword with Classes
  
import java.io.*;
  
public class Main {
    private static String str = "samplestring";
  
    static class MyClass {
        
        public void disp(){ 
          System.out.println(str); 
        }
    }
  
    public static void main(String args[])
    {
        Main.MyClass obj = new Main.MyClass();
        obj.disp();
    }
}

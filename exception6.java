import java.util.*; 
import java.io.*;
 
class Main {
      public static void  print(int a,int b)
     {
         System.out.println("Addition of Positive Integers :"+(a+b));
     }
     public static void main(String[] args) {
     int n1=7;
     int n2=-3;
     if(n1>=0 && n2>=0)
     {
         GFG.print(n1,n2);
     }
     else
     {
         throw new IllegalStateException("Either one or two numbers are not Positive Integer");
     }
    }
}

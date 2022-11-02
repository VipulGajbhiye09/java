package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 
{

    public static void main(String[] args) 
    {
        Scanner s = new Scanner (System. in);
        System.out.println("Enter the value ");
        int a = s.nextInt();
        int fact = 1;
        for (int i= 1;i<=a;i++) 
        {
            fact = i*fact;
        }
        
        System.out.println("Factorial = "+fact);
    }
}

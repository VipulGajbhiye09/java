package calculator;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int a,b,c; 
        String operator;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the operator you want to use");
        operator = s.nextLine(); 
        System.out.println("Enter first value"); 
        a = s.nextInt(); 
        System.out.println("Enter second value"); 
        b = s.nextInt();
        switch (operator) {
            case "+":
                c=a+b;
                ;System.out.println("Addition = "+c); 
                break; 
            case "-":
                c=a-b;
                ;System.out.println("Substraction = "+c); 
                break;
            case "*":
                c=a*b;
                ;System.out.println("Multiplication = "+c); 
                break;     
            case "/":
                c=a/b;
                ;System.out.println("Division = "+c); 
                break;
            case "fact":
                int fact1=1; 
                for (int i=1;i<=a; i++){
                    fact1=i*fact1;
                }
                System.out.println("Factorial of first value = "+fact1);
                int fact2=1; 
                for (int i=1;i<=b; i++){
                    fact2=i*fact2;
                }
                System.out.println("Factorial of first value = "+fact2);
            default:
                break;
        }
    }
    
}
    

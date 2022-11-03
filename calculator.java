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

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

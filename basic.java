package javaapp;
import java.util.Scanner;

public class JavaApp {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number of values required :");
        int a=s.nextInt();
        System.out.println("Enter the values :");
        int sum=0;
        for(int i=1;i<=a;i++){
            int n = s.nextInt();
            sum = sum +n;
        }
        System.out.println("Addition of values is :"+sum);
        int avg = sum/a;
        System.out.println("Average of values is :"+avg);
    }
    
}

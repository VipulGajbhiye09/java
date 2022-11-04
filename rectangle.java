package rectangle;
import java.util.Scanner;

class rect{
    int l,b;
    String colour;
    void get_length(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter length");
        l = s1.nextInt();
    }
    void get_width(){
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter width");
        b = s2.nextInt();

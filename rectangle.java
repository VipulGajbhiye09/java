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
    }
    String get_colour(){
        Scanner s3 = new Scanner(System.in);
        System.out.println("Enter colour");
        colour = s3.nextLine();
        return colour;
    }
    int get_area(){
        int area = l*b;
        System.out.println("Area :"+area);
        return 0;
    }
}

public class Rectangle {

    public static void main(String[] args) {
        rect r1 = new rect();
        rect r2 = new rect();
        r1.get_length();
        r1.get_width();
        r2.get_length();
        r2.get_width();
        int A1 =r1.get_area();
        int A2 =r2.get_area();
        String C1 =r1.get_colour();
        String C2 =r2.get_colour();
        if(A1==A2 && C1.equals(C2)){
            System.out.println("Rectangles are matching");
        }
        else{
            System.out.println("Rectangles are not matching");
        }
    }
    
}

package p1;
 
class A1
{
    void display()
    {
        System.out.println("Hello World!");
    }
}

package p2;
import p1.*;
 
class A2
{
    public static void main(String args[])
    {
        A1 obj = new A1();
        obj.display();
    }

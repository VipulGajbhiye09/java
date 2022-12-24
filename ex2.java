import java.io.*;
 
class Addition {
 
    int sum = 0;
 
    public int addInt(int a, int b)
    {
        sum = a + b;
        return sum;
    }
}
class Main {
 
    public static void main(String[] args)
    {
        Addition add = new Addition();
        int s = add.addInt(9, 3);
        System.out.println("Sum of two integer values :" + s);
    }
}

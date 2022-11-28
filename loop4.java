// Java program to illustrate using break to exit a loop

public class Main {
    public static void main(String args[])
    {
        for (int i = 0; i < 50; i++) {
            if (i == 15)
                break;
 
            System.out.println("i: " + i);
        }
        System.out.println("Loop complete.");
    }
}

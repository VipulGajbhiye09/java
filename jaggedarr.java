// Program to demonstrate 2-D jagged array in Java

public class Main {
    public static void main(String[] args)
    {     
        int arr[][] = new int[2][]; // Declaring 2-D array with 2 rows

        // First row has 3 columns
        arr[0] = new int[3];
        // Second row has 2 columns
        arr[1] = new int[2];
 
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = count++;

        System.out.println("Contents of 2D Jagged Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}

package bubblesort;
import java.util.*;
 
class Sort{
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swapping arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
 
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

public class Bubblesort {

    public static void main(String[] args) {
        Sort obj = new Sort();
        int arr[] = {3,1,6,9,0,2 };
        obj.bubbleSort(arr);
        System.out.println("Sorted array");
        obj.printArray(arr);
    }
    
}

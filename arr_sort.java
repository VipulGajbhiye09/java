package arr_sort;
import java.util.*;
public class Arr_sort {

    public static void main(String[] args) {
        int a, temp =0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length of array : ");
        a = s.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter array elements :");
        for(int i=0;i<a;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Elements of original array");
        for(int i=0;i<a;i++){
            System.out.println(arr[i]+" ");
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

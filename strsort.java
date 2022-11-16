package strsort;
import java.util.*;

public class Strsort {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Original Array is :");
        String str = s.nextLine();
        char arr[]  = str.toCharArray();
        char temp;
        int i=0;
        while(i<arr.length){
            int j=i=i;
            while(j<arr.length){
                if(arr[i]>arr[j]){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
                j+=1;
            }
            i+=1;
        }

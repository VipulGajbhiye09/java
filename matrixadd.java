package matrixadd;

import java.util.*;

public class MatrixAdd {

    public static void main(String[] args) {
        int arr1[][]=new int[2][2];
        int arr2[][]=new int[2][2];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Matrix : ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                arr1[i][j]=s.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter Second Matrix : ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                arr2[i][j]=s.nextInt();
            }
            System.out.println();
        }
        System.out.println("First Matrix :");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Second Matrix :");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println(arr2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Final Matrix :");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println(arr1[i][j]+arr2[i][j]);
            }
            System.out.println();
        }
        
    }
    
}

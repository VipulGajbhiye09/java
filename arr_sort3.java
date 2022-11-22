// Java program to demonstrate working of Collections.sort()

import java.util.*;
 
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Arrays");
        al.add("Are");
        al.add("Quite");
        al.add("Useful");
       
     /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
        Collections.sort(al);

        System.out.println("List after the use of" +" Collection.sort() :\n" + al);
    }
}     

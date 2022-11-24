//Java program to demonstrate NullPointerException
class Main
{
    public static void main (String args[])
    {
        try {
            String a = null; //null value
            System.out.println(a.charAt(0));

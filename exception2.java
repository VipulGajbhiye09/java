//Array out of bound exception

class Main
{
    public static void main(String args[])
    {
        try{
            int a[] = new int[5];
            a[6] = 289;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds");
        }
    }
}

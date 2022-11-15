public class ClassNotFoundException_Demo
{
    public static void main(String[] args) {
        try{
            Class.forName("Class1");   // Class1 is not defined
        }        

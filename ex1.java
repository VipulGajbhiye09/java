public class Test {
    static String name;
    static float cost;
    
   static void set(String n, float c) {
        name = n;
        cost = c;
    }
 
    static void disp() {
        System.out.println("name is: " + name);
        System.out.println("cost is: " + cost);
    }

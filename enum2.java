enum Color {
    RED,
    GREEN,
    BLUE;
}

public class Test {
    public static void main(String[] args)
    {
        Color arr[] = Color.values();
        
        for (Color col : arr) {
            // Calling ordinal() to find index of color.
            System.out.println(col + " at index " + col.ordinal());
        }
        System.out.println(Color.valueOf("RED"));
    }
}

enum Color {
    RED,
    GREEN,
    BLUE;
 
    private Color()
    {
        System.out.println("Constructor called for : "  + this.toString());
    }

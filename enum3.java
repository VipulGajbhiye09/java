enum Color {
    RED,
    GREEN,
    BLUE;
 
    private Color()
    {
        System.out.println("Constructor called for : "  + this.toString());
    }

        public void colorInfo()
    {
        System.out.println("Universal Color");
    }
}

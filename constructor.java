package constructor;

class Sample{
    Sample(){
        System.out.println("This is default constructor");
    }
    
    Sample(int x,int y){
        System.out.println("This is parameterized constructor ");
        System.out.println("X :"+x+"\nY :"+y);
    }
}

interface A{
    int x=20,y=10;
    void disp1();
}

interface B{
    int x=20,y=10;
    void disp2();
}

class A1 implements A{
    public void disp1(){
        int sum=x+y;
        System.out.println("Content of 1 :"+sum);
    }
}
class B1 implements B{
    public void disp2(){
        int diff=x-y;
        System.out.println("Content of 1 :"+diff);
    }
}

public class Interface {

    public static void main(String[] args) {
        A1 o1 =new A1();
        B1 o2 =new B1();
        o1.disp1();
        o2.disp2();
    }
    
}


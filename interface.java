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


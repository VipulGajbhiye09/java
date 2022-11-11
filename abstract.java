package pkgabstract;

abstract class A1 {
    
  public abstract void abs();
  
  public void notabs() {
    System.out.println("Normal Method Content");
  }
}

class A2 extends A1 {
  public void abs() {
    System.out.println("Abstarct Method Content");
  }
}

public class Abstract  {
  public static void main(String[] args) {
    A2 obj =new A2();
    obj.notabs();
    obj.abs();
  }


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


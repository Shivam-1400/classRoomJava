package classProblem;

class A{
  void showA(){
    System.out.println("This is base class A");
  }
}
class B extends A{
  void showB(){
    System.out.println("This is derived class B of base class A");
  }
}
class C extends A{
  void showC(){
    System.out.println("This is derived class C of base class A");
  }
}
class D extends C{
  void showD(){
    System.out.println("This is derived class D of base class c");
  }
}
public class worksheet3d{
  public static void main(String args[]){
    System.out.println("Example of Hybrid inheritance\n");
    D obj= new D();
    obj.showA();
    obj.showC();
    obj.showD();
    
    B obj2= new B();
    obj2.showA();
    obj2.showB();
    
  }
}

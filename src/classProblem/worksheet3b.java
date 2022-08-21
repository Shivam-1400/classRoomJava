package classProblem;

class Fruit{
  void showFruit(){
    System.out.println("This is fruit class (Base class)");
  }
}
class Mango extends Fruit{
  void showMango(){
    System.out.println("This is apple class (Derived class)");
  }
}

public class worksheet3b{
  public static void main(String args[]){
    System.out.println("Example of single inheritance\n");
    Mango m1= new Mango();
    m1.showFruit();
    m1.showMango();
  }
}

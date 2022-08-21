package Inheritance;

class RECT1{
  void Area(){    //Overridden method
    System.out.println("Area of rect");
  }
}
class CIRCLE1 extends RECT1{
  void Area(){
    System.out.println("Area of circle");
  }
  void RArea(){    //Overriding method
    super.Area();   // calling base class method
  }
}

class MethOver{
  public static void main(String args[]){
    CIRCLE1 ref= new CIRCLE1();
    
    ref.Area();
    ref.RArea();
    
  }
}

package Inheritance;

class RECT{
  void Rarea(){
    System.out.println("Rect area");
  }
}
class CIRCLE extends RECT{
  void Carea(){
    System.out.println("Circle area");
  }
}

class Inh{
  public static void main(String arg[]){
    CIRCLE ref= new CIRCLE();
    
    ref.Rarea();
    ref.Carea();
  }
}

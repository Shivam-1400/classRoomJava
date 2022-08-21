package NestedClass;

class Outer3{
  void Display(){
    class Inner3{
      void innerDisplay(){
        System.out.println("hello");
      }
    }    
    Inner3 i= new Inner3();
    i.innerDisplay();
  }
}

public class Localic {
  public static void main(String args[]){
    new Outer3().Display();
  }
}

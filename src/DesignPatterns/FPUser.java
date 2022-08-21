package DesignPatterns;

interface Shape{
  void draw();
}
class Circle implements Shape{
  public void draw(){
    System.out.println("Drwaing circle");
  }
}
class Square implements Shape{
  public void draw(){
    System.out.println("Drawing square");
  }
}
class Rectangle implements Shape{
  public void draw(){
    System.out.println("Drwaing rectangle");
  }
}
class SShapeFactory{
  Shape getObject(String type){
    if(type== null){
      return null;
    }
    else if(type.equals("circle")){
      return new Circle();
    }
    else if(type.equals("square")){
      return new Square();
    }
    else if(type.equals("rectangle")){
      return new Rectangle();
    }
    else{
      return null;
    }
  }
}

public class FPUser {
  public static void main(String args[]){
    SShapeFactory sf= new SShapeFactory();
    
    Shape ref= sf.getObject("circle");
    ref.draw();
    
    sf.getObject("square").draw();
    
    Rectangle r= (Rectangle)sf.getObject("rectangle");
    r.draw();
  }
}
    
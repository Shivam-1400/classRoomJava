package classProblem;

class Helper{		//Base class
  float pi= 3.141f;
  float doSq(float a){
    return a*a;
  }
  float doCube(float a){
    return a*a;
  }
}

class Square extends Helper{		//Derived class
  void area(int side){
    System.out.println("Area of square is: "+ doSq(side));
  	//Using method Helper base class
  }
}

class Circle extends Helper{		//Derived class
  void area(int radius){
    System.out.println("Area of circle is: "+ pi*doSq(radius));
    //Using method Helper base class
  }
}


public class worksheet3{
  public static void main(String args[]){
    System.out.println("Example  of Hierarchial Inheritance\n");
    Square s1= new Square();
    s1.area(10);
    
    Circle c1= new Circle();
    c1.area(12);
  }
}



package NestedClass;

class Outer2{
  static int x=10;
  int y=20;
  static class Inner2{
    void display(){
      System.out.println(x);
      
      //System.out.println(y);
      
      Outer2 a= new Outer2();
      System.out.println(a.y);
    }
  }
}

class StaticInner{
  public static void main(String args[]){
	  Outer2.Inner2 i;
	  i= new Outer2.Inner2();
	  
	  i.display();
	}
  
}

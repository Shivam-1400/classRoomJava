package NestedClass;

abstract class MY{
  abstract void display();
}

class Outer4{
	void outerMethod(){
	  MY mobj= new MY(){
    								public void display(){
    								  System.out.println("HELLO");
							      }
									};
	  mobj.display();
	}
}

class AnonymousIC{
  public static void main(String args[]){
    Outer4 o= new Outer4();
    o.outerMethod();  
  }
}

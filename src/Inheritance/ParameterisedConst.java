package Inheritance;

class Base{
  Base(int x){
    System.out.println("Base class "+x);
  }
  Base(){ }
}

class Derv extends Base{
  Derv(){ }
  Derv(float f){
    System.out.println("Derived class "+f);
  }
  Derv(float f, int i){
    super(i);
    System.out.println("Derived class "+f);
  }
}

class ParameterisedConst {

  public static void main(String[] args){
    Derv ref1= new Derv();
    Derv ref2= new Derv(1.1f);
    Derv ref3= new Derv(2.3f, 4);
  }
}

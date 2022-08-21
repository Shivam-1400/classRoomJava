package Basic;

class RECT{
  public static void main(String ar[]){
    RECT obj= new RECT();
    
    area1();
    obj.area2();
  }
  static void area1(){
    int l=5, b=10, a;
    a=l*b;
    System.out.println("Static method area= "+a);
  }
  void area2(){
    int l=2, b=5, a;
    a=l*b;
    System.out.println("Non-Static method area= "+a);
  }
}
package LPV_LRV_IPV_IRV;

class B{
  int x=2, y;
  void fun(){
    System.out.println(x);
    System.out.println(y);
  }
}

class D{
  B ref1;
  void demand(){
    ref1= new B();
    ref1.fun();
  }
}

class SST{
  public static void main(String args[]){
    D ref= new D();
    ref.demand();
    ref.ref1.fun();
  }
}
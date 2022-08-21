package LPV_LRV_IPV_IRV;

class Product2{
  int P=1, Q=2, tot;
  void show(){
    System.out.println("Total= "+tot);
  }
}
class MALL{
  Product2 lapRef= new Product2();
}

class CompositionIRV{
  public static void main(String args[]){
    MALL MMRef;
    MMRef= new MALL();
    
    int x=2;
    System.out.println(x);
    
    MMRef.lapRef.tot= MMRef.lapRef.P * MMRef.lapRef.Q;
    
    MMRef.lapRef.show();
  }
}

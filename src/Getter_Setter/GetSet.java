package Getter_Setter;

class Product_GetSet{
  int price, qty, bill;
  void setData(int p, int q){
    price= p;  qty= q;
  }
  int getBill(){
    bill= price*qty;
    return bill;
  }
}

class GetSet{
  public static void main(String args[]){
    Product_GetSet ref= new Product_GetSet();
    
    ref.setData(10, 2);
    int bill= ref.getBill();
    
    System.out.println(bill);
  }
}

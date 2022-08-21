package classProblem;

class Mobile{
  String name;
  String modelNo;
  float price;
  
  Mobile(String a, String b, float c){
    name= a;
    modelNo= b;
    price = c;
  }
  String getName(){
    return name;
  }
  String getModel(){
    return modelNo;
  }
  float getPrice(){
    return price;
  }
}
public class asgQ1{
  public static void main(String args[]){
    Mobile mob1= new Mobile("Iphone", "12", 3000);
    System.out.println("Name: "+ mob1.getName()+"\nModel No.: "+ mob1.getModel()+"\nPrice: "+ mob1.getPrice()+"\n");
    
    Mobile mob2;
    mob2= new Mobile("Redmi","6A", 4000);
    System.out.println("Name: "+ mob2.getName()+"\nModel No.: "+ mob2.getModel()+"\nPrice: "+ mob2.getPrice());
    
  }
}


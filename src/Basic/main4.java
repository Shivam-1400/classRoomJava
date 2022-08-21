package Basic;

class main4{
  public static void main(String a[]){
    int x;
    //System.out.println(x);  //Error: variable must be initialised before use
    x=10;
    System.out.println("x= "+x);
    
    System.out.println("--------------------------------");
    
    int y, z=2;
    if(z<=3)
        y=5;
    else
        y=6;
    System.out.println("Z= "+z+"  Y= "+y);
    
    System.out.println("--------------------------------");
    
    int b;
    if(2<=3)
    b= 10;
    //else
    //b=0;
    System.out.println("B= "+b);
    
    
  }
}
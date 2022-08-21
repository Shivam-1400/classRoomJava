package PRRR;

import java.util.Scanner;

class Height{
  int f, i;
  Scanner cin= new Scanner(System.in);
  
  void inputData(){
    System.out.println("Enter F and I: ");
    f= cin.nextInt();
    i= cin.nextInt();
  }
  
  void show(){
    System.out.println("f="+f+"  I="+i);
  }
  
  Height diff( Height ref){
     Height pref= new Height();
     int d= Math.abs((f*12 +i)-(ref.f*12+ ref.i));
     
     pref.f= d/12;
     pref.i= d%12;
     
     return pref;
  }
}

class diffHeight {

  public static void main(String[] args) {
    Height Aref= new Height();
    Aref.inputData();
    
    Height Bref= new Height();
    Bref.inputData();
    
    Height difference= Aref.diff(Bref);    
    
    Aref.show();
    Bref.show();
    difference.show();
  }
}




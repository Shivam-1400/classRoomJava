package ATM;

import java.util.Scanner;

public class InputData{
  Scanner cin= new Scanner(System.in);
  
  void showMsg(int msg){
    System.out.println(msg);
  }
  void showMsg(float msg){
    System.out.println(msg);
  }
  void showMsg(String msg){
    System.out.println(msg);
  }
  int inputInt(String msg){
    System.out.print("Enter "+ msg+": ");
    int a= cin.nextInt();
    return a;
  }
  
  String inputString(String msg){
    System.out.print("Enter "+ msg+": ");
    String a= cin.nextLine();
    return a;
  }
  
  Float inputFloat(String msg){
    System.out.print("Enter "+ msg+": ");
    Float a= cin.nextFloat();
    return a;
  }
  Scanner scanObj(){
    return cin;
  }
  
}

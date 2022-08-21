package ExceptionHandling;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class CheckUncheck{
  public static void main(String args[]) throws IOException{
    new CheckUncheck().inputData();
    
    new CheckUncheck().inputData2();
    
    try{
      new CheckUncheck().inputData3();
    }
    catch(IOException e){}
  }
  void inputData(){
    InputStreamReader isr= new InputStreamReader(System.in);
    BufferedReader bfr= new BufferedReader(isr);
    
    System.out.println("Enter ur good name: ");
    try{
      String name= bfr.readLine();
      System.out.println("Ur name= "+name);
    }
    catch(IOException e){
      System.out.println(e);
    }
  }
  void inputData2() throws IOException {
    InputStreamReader isr= new InputStreamReader(System.in);
    BufferedReader bfr= new BufferedReader(isr);
    
    System.out.println("Enter ur good name2: ");
    String name= bfr.readLine();
    System.out.println("Ur name2= "+name);
  }
  void inputData3() throws IOException {
    InputStreamReader isr= new InputStreamReader(System.in);
    BufferedReader bfr= new BufferedReader(isr);
    
    System.out.println("Enter ur good name3: ");
    String name= bfr.readLine();
    System.out.println("Ur name3= "+name);
  }
}


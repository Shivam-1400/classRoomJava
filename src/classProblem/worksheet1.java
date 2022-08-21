package classProblem;

import java.util.Scanner;

public class worksheet1{
  public static void main(String args[]){
    Students aman= new Students ();
    Students karan= new Students();
    Students mohan= new Students();
    
    
    aman.showStudent();
    karan.showStudent();
    mohan.showStudent();
    
  }
}

class Students{
  int age;
  float per;
  String name;
  
  Students(){
    factory ref= new factory();
    name= ref.inputString("name");
    age= ref.inputInt("age");
    per= ref.inputFloat("percentage");
  }
  void showStudent(){
    System.out.print("\nName: "+ name+ "\nAge: "+age+"\nPercentsge: "+ per);
  }
}

class factory {
  Scanner cin= new Scanner(System.in);
  
  int inputInt(String a){
    System.out.print("Enter "+ a+ ": ");
    int input= cin.nextInt();
    return input;
  }
  
  float inputFloat(String a){
    System.out.print("Enter "+ a+": ");
    return cin.nextFloat();
  }
  
  String inputString(String a){
    //cin.nextLine();
    System.out.print("Enter "+ a+": ");
    return cin.nextLine();
  }
}
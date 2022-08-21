package classProblem;

import java.util.Scanner;


class Factory2{
  int inputInt(String a){
    System.out.print("Enter "+ a+ ": ");
    int x= new Scanner(System.in).nextInt();
    return x;
  }
  int fact(int a){
    if(a==0 || a== 1){
      return a;
    }
    int product= a* fact(a-1);
    return product;
  }
}

public class asgQ3{
  public static void main (String args[]){
    Factory2 ref= new Factory2();
    int number= ref.inputInt("any number");
    System.out.println(ref.fact(number));
  }
}
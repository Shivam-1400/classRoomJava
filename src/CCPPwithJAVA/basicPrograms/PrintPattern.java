package CCPPwithJAVA.basicPrograms;

import java.util.Scanner;
public class PrintPattern {
	public static void main(String args[]){
		Scanner cin= new Scanner(System.in);
	  new Pattern1(cin);
	  new Pattern2(cin);
	  new Pattern3(cin);
	  new Pattern4(cin);
	  Pattern5 E= new Pattern5(cin);
	}
}
class Pattern1{
	int A;
  Pattern1(Scanner cin){
    inputRow(cin);
    print();
  }
  void inputRow(Scanner cin){
    System.out.println("Enter number of rows: ");
    A= cin.nextInt();
  }
  void print(){
    for(int m=0; m<A; m++){
      for(int n=0; n<=m; n++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
class Pattern2{
  int A;
  Pattern2(Scanner cin){
    inputRow(cin);
    print();
  }
  void inputRow(Scanner cin){
    System.out.println("Enter number of rows: ");
    A= cin.nextInt();
  }
  void print(){
    for(int m=0; m<A; m++){
      for(int n=0; n<=m; n++){
        System.out.print(m+1+" ");
      }
      System.out.println();
    }
  }
}
class Pattern3{
  int A;
  Pattern3(Scanner cin){
    inputRow(cin);
    print();
  }
  void inputRow(Scanner cin){
    System.out.println("Enter number of rows: ");
    A= cin.nextInt();
  }
  void print(){
    for(int m=0; m<A; m++){
      for(int n=0; n<=m; n++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
class Pattern4{
  int A;
  Pattern4(Scanner cin){
    inputRow(cin);
    print();
  }
  void inputRow(Scanner cin){
    System.out.println("Enter number of rows: ");
    A= cin.nextInt();
  }
  void print(){
    for(int m=0; m<A; m++){
      for(int n=0; n<=m; n++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
class Pattern5{
  int A;
  Pattern5(Scanner cin){
    inputRow(cin);
    print();
  }
  void inputRow(Scanner cin){
    System.out.println("Enter number of rows: ");
    A= cin.nextInt();
  }
  void print(){
    for(int m=0; m<A; m++){
      for(int n=0; n<A; n++){
        if(m==n) {
        	continue;
        }
        System.out.println("* ");
      }
      System.out.println();
    }
  }
}
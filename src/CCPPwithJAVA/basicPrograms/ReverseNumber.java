package CCPPwithJAVA.basicPrograms;

import java.util.Scanner;

class ReverseNumber {
	public static void main(String args[]){
	  methods ref= new methods();
	  ref.inputNumber();
	  ref.process();
	}
}
class methods{
	int a, b;
void inputNumber(){
    System.out.println("Enter number: ");
    a= new Scanner(System.in).nextInt();
  }
  void process(){
  	int temp=0;
    while(a !=0){
      b= a%10;
      temp= temp*10+b;
      a= a/10;
    }
    System.out.println(temp);
  }
  
}

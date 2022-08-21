package ARRAY.OneDArray;

import java.util.Scanner;

class Array1 {

  public static void main(String[] args) {
		int N;
		Scanner cin= new Scanner(System.in);
		
		System.out.println("Enter N: ");
		N= cin.nextInt();
		
		int[] S= new int[N];
		Factory1 ref= new Factory1();
		ref.fillArray(S, cin);
		ref.showArray(S);
		 
  }
}
class Factory1{
  void fillArray(int []Sref, Scanner cin){
    int i;
    for(i=0; i< Sref.length; i++){
      System.out.print("Enter Value S["+i+"]: ");
      Sref[i]= cin.nextInt();
    }
  }
  void showArray(int Sref[]){
    for(int i=0; i< Sref.length; i++){
      System.out.println("S["+i+"]= "+Sref[i]);

    }
  }
}
package CCPPwithJAVA.basicPrograms;

import java.util.Scanner;

class BubbleSorting {
	public static void main(String args[]){
	  methodBS ref= new methodBS();
	  int[] Array= ref.getArray();
	  ref.fillArray(Array);
	  ref.show(Array);
	  ref.sort(Array);
	  ref.show(Array);
	}
}
class methodBS{
  Scanner cin= new Scanner(System.in);
  int[] getArray(){
		System.out.println("Enter number of elements in array: ");
		int n= cin.nextInt();  
    int Aref[]= new int[n];
    return Aref;
  }
  void fillArray(int Aref[]){
    for(int i=0; i<Aref.length; i++){
      System.out.print("Enter element ["+(i+1)+"]: ");
      Aref[i]= cin.nextInt();
    }
  } 
  void show(int Aref[]){
    for(int i=0; i<Aref.length; i++){
      System.out.println(Aref[i]);
      
    }
  }
  void sort(int[] Aref){
    for(int i=0; i<Aref.length; i++){
      for(int j=0; j<Aref.length-1-i; j++){
        if(Aref[j]> Aref[j+1]){
          int temp= Aref[j];
          Aref[j]= Aref[j+1];
          Aref[j+1]= temp;
        }
      }
    }
    System.out.println("Given Array Sorted");
  }
}

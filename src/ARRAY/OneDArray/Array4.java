//Sum of two  1D-arrays
package ARRAY.OneDArray;
import java.util.Scanner;

class Array4{
  public static void main(String [] args){
        Factory4 ref= new Factory4();
    
    int[] A= ref.get1D();
    ref.getArray( A);
    
    int B[]= ref.get1D();
    ref.getArray( B);
    
    int Sum[]= ref.sum( A, B);
    ref.showSum(Sum);
    
  }
}
class Factory4{
    Scanner cin= new Scanner(System.in);
    
    int[] get1D(){
        System.out.print("Enter no. of elements: ");
        int N= cin.nextInt();
        
        int[] Arrayref= new int[N];
        return Arrayref;
    }
    void getArray(int[] Arrayref){
        for(int i=0; i<Arrayref.length; i++){
            System.out.print("Enter elememnt "+i+" :");
            Arrayref[i]= cin.nextInt();
        }
    }
    int[] sum(int[] Aref, int[] Bref){
        int[] Sumref= new int[Aref.length]; 
        for(int i=0; i<Sumref.length; i++){
            Sumref[i]= Aref[i] + Bref[i];
        }
        return Sumref;
    }
    void showSum(int Arrayref[]){
        for(int i=0; i<Arrayref.length; i++){
            System.out.println("Sum["+i+"]= "+ Arrayref[i]);
        }
    }
}
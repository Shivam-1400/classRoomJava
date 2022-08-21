//Greatest element of Array
package ARRAY.OneDArray;

import java.util.Scanner;

class Array2{
    public static void main(String arg[]){
        Factory ref= new Factory();
        
        int A[]= ref.get1D();
        ref.getArray(A);
        ref.showArray(A);
        int max= ref.getMax(A);
        System.out.println("Max= "+max );
        
    }
}
class Factory{
    Scanner cin= new Scanner(System.in);
    
    int[] get1D(){
        int N;
        System.out.print("Enter number of element: ");
        N= cin.nextInt();
        int[] Aref= new int[N];
        
        return Aref;
    }
    void getArray( int[] Aref){
        int i;
        for(i=0; i< Aref.length; i++){
            System.out.print("Enter element "+(i+1)+": ");
            Aref[i]= cin.nextInt();
        }
    }
    void showArray(int[] Aref){
        int i;
        for(i=0; i<Aref.length; i++){
            System.out.println("A["+(i+1)+"]= "+Aref[i]);
            
        }
    }
    int getMax(int[] Aref){
        int i, max=0;
        for(i=0; i< Aref.length; i++){
            if(max< Aref[i]){
                max= Aref[i];
            }
        }
        return max;
    }
    
}

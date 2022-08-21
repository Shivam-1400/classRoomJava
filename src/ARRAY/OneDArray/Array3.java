//Searching element in array
//needs some improvement
package ARRAY.OneDArray;
import java.util.Scanner;

class Array3{
    public static void main(String [] args){
        Factory3 ref= new Factory3();
        int A[]= ref.get1D();
        ref.getArray(A);
        int count= ref.search(A);
        System.out.print(" at "+ count+" position");
        
    }
}
class Factory3{
    Scanner cin= new Scanner( System.in);
    
    int[] get1D(){
        System.out.print("Enter number of elements in array: ");
        int N= cin.nextInt();
        
        int[] Aref= new int[N];
        
        return Aref;
    }
    void getArray(int[] Aref){
        int i;
        for(i=0; i<Aref.length; i++){
            System.out.print("Enter element "+i+": ");
            Aref[i]= cin.nextInt();
        }
    }
    int search(int[] Aref){
        System.out.print("Enter element to search: ");
        int srch= cin.nextInt();
        
        int count=0;
        for(int i=0; i<Aref.length; i++){
            if(srch==Aref[i]){
                System.out.print("Found "+srch);
                break;
            }
            count++;
        }
        return (count+1);
    }
}
//Example 3
//Jagged Array by sir

package ARRAY.TwoDArray;

import java.util.Scanner;

class Factory3{
    Scanner cin= new Scanner(System.in);
    
    int[][] get2D(){
        System.out.print("Enter number of rows: ");
        int r= cin.nextInt();
        int [][] Aref;
        Aref= new int[r][];
        
        for(int m=0; m< r; m++){
            System.out.print("Enter column in row "+(m+1)+": ");
            int c= cin.nextInt();
            
            Aref[m]= new int[c];
        }
        
        return Aref;
    }
    
    void fill(int[] Aref[]){
        for(int r=0; r<Aref.length; r++){
            for(int c=0; c<Aref[r].length; c++){
                System.out.print("Enter value ["+r+"]["+c+"]: ");
                Aref[r][c]= cin.nextInt();
            }
        }
    }
    void show(int Aref[][]){
        for(int r=0; r<Aref.length; r++){
            for(int c=0; c<Aref[r].length; c++){
                System.out.print(Aref[r][c]+ " ");
            }
            System.out.println();
        }
    }
    
    
}
class Ex3{
    public static void main (String[] args) {
        Factory3 ref= new Factory3();
        
        int[][] A= ref.get2D();
        ref.show(A);
        ref.fill(A);
        ref.show(A);
    }
}
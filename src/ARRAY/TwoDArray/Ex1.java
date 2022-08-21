//Example 1 by sir
package ARRAY.TwoDArray;

import java.util.Scanner;
class FACTORY{
    int[][] get2D( int M, int N){
        int[][] Aref= new int[M][N];
        
        return Aref;
    }
    void fill(int Aref[][]){
        Scanner cin= new Scanner(System.in);
        for(int r=0; r<Aref.length; r++){
            for(int c=0; c<Aref[r].length ; c++){
                System.out.print("Enter value A["+r+"]["+c+"]: ");
                Aref[r][c]= cin.nextInt();
            }
        }
        cin.close();
    }
    void show(int[][] Aref){
        for(int r=0; r<Aref.length; r++){
            for(int c=0; c<Aref[r].length; c++){
                System.out.print(Aref[r][c]+ " ");
            }
            System.out.println();
        }
        
    }
    
}
class Ex1{
    public static void main(String[] args){
        FACTORY ref;
        ref= new FACTORY();
        
        int [][] A= ref.get2D(2, 4);
        ref.show(A);
        ref.fill(A);
        ref.show(A);
    }
}
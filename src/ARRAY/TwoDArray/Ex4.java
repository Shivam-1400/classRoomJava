//Example 4
//Sum of to matrix

package ARRAY.TwoDArray;

import java.util.Scanner;

class Factory4{
    Scanner cin= new Scanner(System.in);
    
    int[][] getMatrix(){
        System.out.println("Enter number of rows and columns: ");
        int r= cin.nextInt();
        int c= cin.nextInt();
        
        int[][] Aref= new int[r][c];
        
        return Aref;
    }
    void fillMatrix(int[] Aref[]){
        for(int r=0; r< Aref.length; r++){
            for(int c=0; c< Aref[r].length; c++){
                System.out.print("Enter elemrnt ["+r+"]["+c+"]; ");
                Aref[r][c]= cin.nextInt();
            }
        }
    }
    void showMatrix(int[][] Aref){
        for(int r=0; r<Aref.length; r++){
            for(int c=0; c<Aref[r].length; c++){
                System.out.print(Aref[r][c]+ " ");
            }
            System.out.println();
        }
    }
    void sumMatrix(int[][] Aref, int[][] Bref){
        int[][] Sum= new int[Aref.length][ Aref[0].length];
        for(int r=0; r<Aref.length; r++){
            for(int c=0; c<Aref[r].length; c++){
                Sum[r][c]= Aref[r][c] + Bref[r][c]  ;
                
                 //System.out.print(Sum[r][c]+ " ");
            }
            //System.out.println();
        }
          showMatrix(Sum);
    }
}
class Ex4{
    public static void main (String[] args) {
        Factory4 ref= new Factory4();
        
        System.out.println("Array 1: ");
        int[][] A= ref.getMatrix();
        ref.showMatrix(A);
        ref.fillMatrix(A);
        ref.showMatrix(A);
        
        System.out.println("Array 2: ");
        int[][] B= ref.getMatrix();
        ref.showMatrix(B);
        ref.fillMatrix(B);
        ref.showMatrix(B);
        
        System.out.println("Sum of the arrays: ");
        ref.sumMatrix(A, B);
    }
}
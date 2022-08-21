//Example 5
//Product of matrix
//Need improvement

package ARRAY.TwoDArray;

import java.util.Scanner;
class Factory5{
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
                System.out.print("Enter element ["+r+"]["+c+"]: ");
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
 
    int[][] productMatrix(int[][] Aref , int[][] Bref){
        if(Aref[0].length != Bref.length){
            System.out.println("Product not possible");
            int[][] NO = new int[0][0];
            return NO;
        }
        int[][] Prod= new int[Aref.length][Bref[0].length];
        int sum=0;
        
        for(int m=0; m< Aref.length; m++){
          
            for(int c=0; c< Bref[0].length; c++){
                for(int uw=0; uw< Aref.length; uw++){
                    sum= sum+ Aref[m][uw] * Bref[uw][c];
                }
                Prod[m][c]= sum;
                sum=0;
            }
        }
        return Prod;
        
    }
}
class Ex5{
    public static void main (String[] args) {
        Factory5 ref= new Factory5();
        
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
        
        System.out.println("Product of the arrays: ");
        int[][] Product= ref.productMatrix(A, B);
        
        ref.showMatrix(Product );
    }
}
//Example 6
//Print cross diagonal elements of matrix

package ARRAY.TwoDArray;


import java.util.Scanner;

class Factory6{
    Scanner cin= new Scanner(System.in);
    
    int[][] get2D(){
        System.out.print("Enter rows and columns: ");
        int M= cin.nextInt();
        int N= cin.nextInt();
        
        int [][] Aref= new int[M][N];
        
        return Aref;
    }
    void fillArray( int [] Aref[]){
        for(int r=0; r< Aref.length; r++){
            for(int c=0; c< Aref[r].length; c++){
                System.out.print("Enter element ["+r+"]["+c+"]: ");
                Aref[r][c]= cin.nextInt();
            }
        }
    }
    void showArray(int[][] Aref){
      System.out.println("Array: ");
        for(int r=0; r<Aref.length; r++){
            for(int c=0; c<Aref[r].length; c++){
                System.out.print(Aref[r][c]+" ");
            }
            System.out.println();
        }
    }
    void showDiagonal(int[][] Aref){
      System.out.println("Cross Diagonal Array:");
        for(int r=0; r<Aref.length; r++){
            for(int c=0; c<Aref[r].length; c++){
                if(r==c || (r+c)== Aref.length-1){
                    System.out.print(Aref[r][c]+" ");
                }
              else{
                System.out.print("*"+" ");
                }
            }
            System.out.println();
        }    
    }
}
class Ex6{
    public static void main (String[] args) {
        Factory6 ref= new Factory6();
        
        int[][] A= ref.get2D();
        ref.showArray(A);
        ref.fillArray(A);
        ref.showArray(A);
        ref.showDiagonal(A);
        
    }
}
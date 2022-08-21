package ARRAY.TwoDArray;

import java.util.Scanner;

class Factoryyyyy{
    Scanner cin= new Scanner(System.in);
    
    int[][] get2D(){
        System.out.print("Enter number of rows: ");
        int r= cin.nextInt();
        
        System.out.print("Enter number of columns: ");
        int c= cin.nextInt();
        
        int[][] Aref= new int[r][c];
        
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
class Ex2{
    public static void main (String[] args) {
    	Factoryyyyy ref= new Factoryyyyy();
        
        int[][] A= ref.get2D();
        ref.show(A);
        ref.fill(A);
        ref.show(A);
    }
}
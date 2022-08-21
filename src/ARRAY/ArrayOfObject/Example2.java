//Example
//Array of students

package ARRAY.ArrayOfObject;

import java.util.Scanner;

class STUDENT{
    int cpp, java, total;
    float percentage;
    String name;
    Scanner cin= new Scanner(System.in);
    
    STUDENT[] getSet(){
        System.out.print("Enter number of students: ");
        int N= cin.nextInt();
        
        STUDENT[] Aref= new STUDENT[N];
        for(int i=0; i<Aref.length ; i++){
          Aref[i]= new STUDENT();
        }
        
        return Aref;
    }
    void getData(STUDENT[] Aref){
        for(int m=0; m<Aref.length; m++){
            System.out.println("Student "+(m+1)+": ");
            System.out.print("Enter Cpp and JAVA marks: ");
            Aref[m].cpp= cin.nextInt();
            Aref[m].java= cin.nextInt();
            
            Aref[m].total= Aref[m].cpp+ Aref[m].java;
            Aref[m].percentage= (1.0f* Aref[m].total* 100)/ 200;
        }
    }
    void showData(STUDENT[] Aref){
        System.out.println("Showing Data of Students");
        for(int m=0; m<Aref.length; m++){
            System.out.println("------------------------------------------------------");
            System.out.println("Student "+(m+1)+": ");
            System.out.println("CPP= "+ Aref[m].cpp);
            System.out.println("JAVA= "+ Aref[m].java);
            System.out.println("Total= "+ Aref[m].total);
            System.out.println("Percentage "+ Aref[m].percentage+"\n");
        }
    }
    int maxTotal(STUDENT[] Aref){
      int max=0;
      for(int i=0; i<Aref.length; i++){
        if(max< Aref[i].total){
          max= Aref[i].total;
        }
      }
      return max;
    }
    
    float minPercent(STUDENT[] Aref){
/*if you are assigning arr[0] to min, then 
you can start loop from i = 1 , instead 
of 0 .. a little improvement*/     
      float min= Aref[1].percentage;
      for(int i=0; i<Aref.length; i++){
        if(min> Aref[i].percentage){
          min= Aref[i].percentage;
        }
      }
      return min;
    }
}
class Example2{
    public static void main(String args[]){
        STUDENT ref= new STUDENT();
        
        STUDENT[] List= ref.getSet();
        ref.getData(List);
        ref.showData(List);
        
        int maxTotal= ref.maxTotal(List);
        float minPercentage= ref.minPercent(List);
        
        System.out.println("Max total= "+maxTotal+"\nMin Percentage= "+ minPercentage );
    }
}

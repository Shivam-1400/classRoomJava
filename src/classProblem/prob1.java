package classProblem;

import java.util.Scanner;

public class prob1 {
   public static void main(String a[]){
     Scanner scan= new Scanner(System.in);
     
     System.out.print("Enter 5-digit number: ");
     
     int aa= scan.nextInt();
     int temp, rev=0;
     String revnum="";
     String num;
     while(aa!=0){
       temp=aa % 10;
       //rev= rev*10+ temp;
       revnum= revnum+ temp;
       aa =aa/10;
       
      // if(aa==0){
         
       //  //rev= rev*10;
       //  num= "0"+ rev+"";
      // }
     }
     num= rev+"";
     System.out.println(revnum);
   }
}

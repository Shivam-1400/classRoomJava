package StringClass;

import java.util.Scanner;

public class StringSearch{
  public static void main(String args[]){
    Scanner cin= new Scanner(System.in);
    
    System.out.println("Enter a string: ");
    String str= cin.nextLine();
    
    System.out.println("Enter string to serach: ");
    String search= cin.nextLine();
    
    int foundAt= 0;
    
    while(true){
      foundAt= str.indexOf(search, foundAt);
      
      if(foundAt== -1){
        break;
      }
      else if(foundAt== 0 || str.charAt(foundAt-1)== ' '){
        System.out.println("Found "+search+" at index: "+ foundAt);
      }
      foundAt++;
    }
    cin.close();
  }
}

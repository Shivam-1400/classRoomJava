package StringClass;

import java.util.Scanner;


class LastPathSegment{
  public static void main(String args[]){
    Scanner cin= new Scanner(System.in);
    
    System.out.print("Enter Path: ");
    //c:\dir\sub\files.text
    String path= cin.nextLine();
    
    int pos= path.lastIndexOf("\\");
    String file= path.substring(pos+1);
    System.out.println("File name: "+file);
    
    int pos2= path.lastIndexOf("\\", pos-1);
    String dir= path.substring(pos2+1, pos);
    System.out.println("Directory name: "+dir);
  }
}
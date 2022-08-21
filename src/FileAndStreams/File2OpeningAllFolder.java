//Print all the content of all the folders

package FileAndStreams;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

class File2OpeningAllFolder {
  public static void main(String args[]){
    fileLib A= new fileLib();
    A.inputPath();
    
    File fileArray[]= A.getDir();
    A.openDir(fileArray);
  }
}
class fileLib{
	String dirpath;  //= "//sdcard//DummyDelete";
	Scanner cin= new Scanner(System.in);
  void inputPath(){
    System.out.println("Enter file path: ");
    //       gdirpath= cin.nextLine();
    dirpath= "//sdcard//JAVA";
  }
  
  File[] getDir(){
    File dir= new File(dirpath);
    File ary[]= dir.listFiles();
    
    return ary;
  }
  
  void openDir(File fref[]){
    for(File i: fref){
      if(i.isFile()){
        System.out.println("#file    :"+i.getName());
    
        //Warning--------//.delete();//----------Warning
    		
      }
      else{
        System.out.println("["+i.getName()+"]");
        openDir(i.listFiles());
        //Warning--------//.delete();//----------Warning
        
      }
    }
  }
}


package FileAndStreams;

import java.io.*;

public class ImageCopy{
  public static void main(String args[]){
    try{
      copyImage();
    }
    catch(Exception e){
      e.printStackTrace();
    }
  }
  static void copyImage() throws Exception{
    File src= new File("sdcard//image1.jpg");
    File des= new File("sdcard//imagecopy2.jpg");
    
    FileInputStream fis= new FileInputStream(src);
    FileOutputStream fos= new FileOutputStream(des);
    int bt=0, count=0;
    while(true){
    	bt= fis.read();
     	
    	if(bt== -1){
    	  break;
 	   }
      fos.write(bt);
      count++;
    }
    System.out.println("File copied successfully");
    System.out.println(count+" Byte copied");
  }
} 




/*
 //FileOutputStream.java
import java.io.*;
public class FileInOutStreams
{ public static void main(String[] args) throws Exception
  { copyImage();
  }
        static void copyImage()
        {
          File src=new File("real.jpg");
          read=new FileInputStream(src);
          File des=new File("java.jpg");
          write=new FileOutputStream(des);
          int c,count=0;
          while((c=read.read()!=-1))
          {
          write.write(c);
          count++;
          }
          System.out.print(count+"Byte Copied....");
        }
        catch(FileNotFoundException ex)
        {ex.printStackTrace();}
        catch(IOException ex)
        {ex.printStackTrace();}
        try
        {
        read.close();
        write.close();
        }
        catch(IOException ex){ex.printStackTrace();}
        }
       */
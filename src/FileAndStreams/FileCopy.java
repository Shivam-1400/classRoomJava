package FileAndStreams;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
public class FileCopy {
	public static void main(String args[]) throws Exception{
	  //makeRingTone();
	  try{
	    makeRingTone();
		}
		catch(Exception e){ System.out.println(e);}
	}
	static void makeRingTone() throws Exception{
		Scanner cin= new Scanner(System.in);
		
	  File src= new File("sdcard//DummyDelete//SK.docx");
	  File des= new File("sdcard//skcopy10.docx");
	  
	  FileInputStream fis= new FileInputStream(src);
	  FileOutputStream fos= new FileOutputStream(des);
	  
	  int bt, count=0;
	  while(true){
	    bt= fis.read();
	    
	    if(bt== -1){
	      break;
			}
			
				fos.write(bt);  

			count++;
		}
		
		fis.close();
		fos.close();
		System.out.println("File copied Successfully");
		System.out.println(des.getAbsolutePath()+": size "+count+" bytes");
	}
	
}

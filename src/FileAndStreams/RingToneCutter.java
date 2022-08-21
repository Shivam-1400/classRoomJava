package FileAndStreams;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
public class RingToneCutter {
	public static void main(String args[]) throws Exception{
	  //makeRingTone();
	  try{
	    makeRingTone();
		}
		catch(Exception e){ System.out.println(e);}
	}
	static void makeRingTone() throws Exception{
		Scanner cin= new Scanner(System.in);
		
		System.out.println("Enter the name and path of song: ");
		String a= cin.next();
	  File src= new File(a);
	  
	  System.out.println("Enter the name and path of the ringTone: ");
	  String b= cin.next();
	  File des= new File(b);
	  
	  FileInputStream fis= new FileInputStream(src);
	  FileOutputStream fos= new FileOutputStream(des);
	  
	  int bt, count=0;
	  while(true){
	    bt= fis.read();
	    
	    if(bt== -1){
	      break;
			}
			
			if(count>= 300000 && count<= 1000000){
				fos.write(bt);  
			}
			count++;
		}
		
		fis.close();
		fos.close();
		System.out.println("Ring Tone Made Successfully");
		System.out.println(b+" : size "+count+" bytes");
	}
	
}

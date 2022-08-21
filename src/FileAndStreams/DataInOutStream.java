package FileAndStreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class DataInOutStream {
	public static void main(String args[]) {
		int productId= 1;
		String productName= "Laptop";
		int quantity= 4;
		float price= 200000;
		
		int productId2= 2;
		String productName2= "I-Phone";
		int quantity2= 5;
		float price2= 100000;
	try{	
		FileOutputStream fos= new FileOutputStream("sdcard//productList.txt", true);
		DataOutputStream dos= new DataOutputStream(fos);
		
		//writing record
		dos.writeInt(productId);
		dos.writeUTF(productName);
		dos.writeInt(quantity);
		dos.writeFloat(price);
		
		//writing record 2
		dos.writeInt(productId2);
		dos.writeUTF(productName2);
		dos.writeInt(quantity2);
		dos.writeFloat(price2);
		
		dos.flush();
		fos.close();
		
		FileInputStream fis= new FileInputStream("sdcard//productList.txt");
		DataInputStream dis= new DataInputStream(fis);
	 try{ 	 
		while(true){
		  productId = dis.readInt();
		  productName= dis.readUTF();
		  quantity= dis.readInt();
		  price= dis.readFloat();
		  
		  System.out.println("Product Id: "+ productId);
		  System.out.println("Product Name: "+ productName);
		  System.out.println("Quantity: "+quantity);
		  System.out.println("Price: "+ price);
		}
	 }
	 catch(Exception e){}
	 
	 dis.close();
	 fis.close();
	}	
	catch(Exception e){}
		//dis.flush();
		//fis.close();

	}
}

/*
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInOutStream {

	public static void main(String[] args) 
	{
		
		int productID=1;
		String productName= "laptop";
		int quantity=4;
		float price=200000;
		
		int productID2=2;
		String productName2="I-Phone";
		int quantity2=5;
		float price2=100000;
		
		
		try {
			FileOutputStream fos = new FileOutputStream("sdcard//product.txt",true); // opening file in append mode
			DataOutputStream dos= new DataOutputStream(fos);
			
			
			
			// writing first record
			dos.writeInt(productID);
			dos.writeUTF(productName);
			dos.writeInt(quantity);
			dos.writeFloat(price);
			
			
			// writing second record
			
			dos.writeInt(productID2);
			dos.writeUTF(productName2);
			dos.writeInt(quantity2);
			dos.writeFloat(price2);
			
			
			
			dos.flush();
			dos.close();
			FileInputStream fis = new FileInputStream("sdcard//product.txt");
			DataInputStream dis = new DataInputStream(fis);
			
			
			// reading records from the file
			
			
			try {
				   while(true)
			      	{
					productID = dis.readInt();
					System.out.println("productId:" +productID);
					
					productName = dis.readUTF();
					System.out.println("Product name:" +productName);
					
					quantity = dis.readInt();
					System.out.println("Quantity:" +quantity);
					
					price = dis.readFloat();
					System.out.println("price: "+price);
					
				  }
			}
				
				catch(Exception ex)
				{}
				
				dis.close();

				
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		
	
		}
	

	}
*/
package FileAndStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Company implements Serializable
	{
		String name,webSite;
		Company(String n,String ws)
		{
			name=n; webSite=ws;
		}
	 String getCompDetails()
		{
			return "Company Name="+name+ " Site="+webSite;	
		}
	}

class SerialzeProcess 
	{
		void serializeObject(Company p)
		{
			try{
			FileOutputStream fos=new FileOutputStream("sdcard//file2.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(p);
			oos.close();
			fos.close();
			System.out.println("Object Serialized Successfully.....");
			}
			catch(Exception ex){ex.printStackTrace();}
		}
	void deserializeObject()
		{
			try{
				System.out.println("------  deserializing-------");
				FileInputStream fos=new FileInputStream("sdcard//file2.txt");
				ObjectInputStream oos=new ObjectInputStream(fos);
				Company pp=(Company)oos.readObject();
			System.out.println(pp.getCompDetails());
				oos.close();
				fos.close();
				System.out.println("Object deserialized Successfully.....");
				}
				catch(Exception ex){ex.printStackTrace();}
			}
	}
public class ObjectInOutStream 
{
	public static void main(String[] args) 
	{
		SerialzeProcess sp=new SerialzeProcess();
		Company pro=new Company("Dell", "www.dell.com");
		
		sp.serializeObject(pro);
		
		sp.deserializeObject();
	}
}
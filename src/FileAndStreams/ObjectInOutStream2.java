package FileAndStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Pproduct implements Serializable{
  int id, qty;
  float price;
  String name;
  Pproduct(int a, int b, float c, String d){
    id=a; qty= b;
    price= c;
    name= d;
  }
  void show(){
    System.out.println("id"+ id+"\nQty"+ qty+"\nPrice"+price+"\nName"+name);
  }
}

class ObjectInOutStream2{
  public static void main(String args[]){
    
    Pproduct A= new Pproduct(10, 5, 1000, "Pen");
    Pproduct B= new Pproduct(20, 4, 5000, "Pencil");
    try{
    	FileOutputStream fos= new FileOutputStream("sdcard//classPro2.txt", true);
    	ObjectOutputStream oos= new ObjectOutputStream(fos);
    	
    	//A.show();
    	oos.writeUnshared(A);
    	//oos.writeUnshared(B);
    }
    catch(Exception e){
      System.out.println(e);
      //e.printStackTrace();
    }
    
    try{
      FileInputStream fis= new FileInputStream("sdcard//classPro.txt");
      ObjectInputStream ois= new ObjectInputStream(fis);
      
      Pproduct pt= (Pproduct)ois.readObject();
      pt.show();
    }
    catch(Exception e){ 
      System.out.println(e);
    }
    
    
    
  }
}

package ATM;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AtmProcess3{
  void serailizeObject(Account A, String path){
    try{
      ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(path));
      oos.writeObject(A);
      oos.close();
    }
    catch(Exception e){e.printStackTrace();}
  }
  Account deserializeObject(String path) throws Exception{
  	Account Aref;
  	Account NullRef= null;
    try{
      ObjectInputStream ois= new ObjectInputStream(new FileInputStream(path));
	    Aref= (Account)ois.readObject();
	    ois.close();
	    return Aref;
    }
    catch(Exception e){System.out.println("No Account found. PLease try again");}
    return NullRef;
  }
}

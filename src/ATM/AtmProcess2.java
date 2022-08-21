package ATM;

import java.io.File;

public class AtmProcess2 {
	InputData inref= new InputData();
	AtmProcess3 spref= new AtmProcess3();
	//Account A1= new Account();
  
  void CreateAccount(){
    System.out.println("=======================================================");
    System.out.println("\t\t\tCreate Account");
    System.out.println("=======================================================");

    String name= inref.inputString("name");
    String uid= inref.inputString("User Id (Create using 'a-z','0-9','@','_')");
    int age= inref.inputInt("age");
    int pin, pinc;
    while(true){
      pin= inref.inputInt("PIN");
      pinc= inref.inputInt("PIN again");
      if(pin== pinc){
        break;
      }
      inref.showMsg("PIN didn't match. Please create PIN again");
    }
    int bal= inref.inputInt("opening balance");
    
    String path= "C:\\Project-Folder\\ATM_JAVA\\"+uid+".txt";
    //String path= "sdcard//ATM//"+uid+".txt";
    spref.serailizeObject(new Account(name, uid, age, pin, bal), path);
    System.out.println("\nAccount added successfully\n");

  }
  void checkBal(){
		System.out.println("=======================================================");
    System.out.println("\t\t\tCheck Balance");
    System.out.println("=======================================================");
    
    String uidc= inref.inputString("User Id");
    int pinc= inref.inputInt("PIN");
    
    String path= "C:\\Project-Folder\\ATM_JAVA\\"+uidc+".txt";
    //String path= "sdcard//ATM//"+uidc+".txt";
    try{
    	Account test= (Account)spref.deserializeObject(path);
    	if(verify(pinc, test)==1){
    		System.out.println("\n------------ACCOUNT DETAILS-----------");
    		System.out.println("Name: "+test.name+"\nUser Id: "+test.uid +"\nAge:"+test.age+ "\nBalance: " +test.bal);  
    		System.out.println("--------------------------------------");
    		System.out.println("\nTransaction Successful\n");

      }
    }
    catch(Exception e){}
  }
  
  void deposite(){
    System.out.println("=======================================================");
    System.out.println("\t\t\tDeposite");
    System.out.println("=======================================================");
		
		String uidc= inref.inputString("User Id");
    int pinc= inref.inputInt("PIN");
    
    String path= "C:\\Project-Folder\\ATM_JAVA\\"+uidc+".txt";
    //String path= "sdcard//ATM//"+uidc+".txt";
    try{
    	Account test= (Account)spref.deserializeObject(path);
    	if(verify(pinc, test)==1){
    		int add= inref.inputInt("Amount to deposite");
    		test.bal += add;
    		new File(path).delete();
    			
    		//String path= "sdcard//ATM//"+uid+".txt";
      	spref.serailizeObject(new Account(test.name, test.uid, test.age, test.pin, test.bal), path);
    		System.out.println("\nTransaction Successful\n");

    	}
    }
    catch(Exception e){}
  }
  
  void withdraw(){
    System.out.println("=======================================================");
    System.out.println("\t\t\tWithdraw");
    System.out.println("=======================================================");
		
		String uidc= inref.inputString("User Id");
    int pinc= inref.inputInt("PIN");
    
    String path= "C:\\Project-Folder\\ATM_JAVA\\"+uidc+".txt";
    //String path= "sdcard//ATM//"+uidc+".txt";
    try{
    	Account test= (Account)spref.deserializeObject(path);
    	if(verify(pinc, test)==1){
    		int withd= inref.inputInt("Amount to Writhdraw");
    		if(test.bal >= withd){
    			test.bal -= withd;
    			new File(path).delete();
    			
    			//String path= "sdcard//ATM//"+uid+".txt";
    			spref.serailizeObject(new Account(test.name, test.uid, test.age, test.pin, test.bal), path);
    			System.out.println("\nTransaction Successful\n");

    		}
    		else{
    		  inref.showMsg("Transcation Failed Due to less Balance");
    		}	
    		
    		//new File(path).delete();
    		
    		
    	}
    }
    catch(Exception e){}
  }
  
  void changePIN(){
    System.out.println("=======================================================");
    System.out.println("\t\t\tChange PIN");
    System.out.println("=======================================================");
 	 
 	 String uidc= inref.inputString("User Id");
    int pinc= inref.inputInt("PIN");
    int agec= inref.inputInt("New Age");
    String path= "C:\\Project-Folder\\ATM_JAVA\\"+uidc+".txt";
    //String path= "sdcard//ATM//"+uidc+".txt";
    try{
    	Account test= (Account)spref.deserializeObject(path);
    	int npin, npinc;
    	if(verify(pinc, test)==1 && agec== test.age){
    		while(true){
      		npin= inref.inputInt("New PIN");
      		npinc= inref.inputInt("PIN again");
      		if(npin== npinc){
      		  break;
      	}
      	inref.showMsg("PIN didn't match. Please create PIN again");
    	}
    	new File(path).delete();
    		
    	spref.serailizeObject(new Account(test.name, test.uid, test.age, npin, test.bal), path);
    	System.out.println("\nTransaction Successful\n");

    	}
    	
    }
    catch(Exception e){}
  }	
  
  
  int verify(int pinc, Account A){
    if(A.pin== pinc){
      System.out.println("Account Verified Successfully");
      return 1;
    }
    else{
      System.out.println("UserId and PIN did not Match. Please try again!!");
      return -1;
    }
  }
  
  
}
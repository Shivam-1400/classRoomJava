package ATM;


public class AtmProcess1{
  void menu(){
    while(true){
      System.out.println("=======================================================");
      System.out.println("\t\t\tATM");
      System.out.println("=======================================================");
      System.out.println("	[1] Create New Account");
      System.out.println("	[2] Check Account Balance");
      System.out.println("	[3] Deposite Money");
      System.out.println("	[4] Withdraw Money");
      System.out.println("	[5] Change PIN");
      System.out.println("	[6] Exit");
      //System.out.print("\nEnter your choice: ");
      InputData Aref= new InputData();
      int choice= Aref.inputInt("choice");
      
      
      if(choice ==6 ){
        System.out.println("You selected 6 to EXIT");
        break;
      }
       EnteredChoice(choice);      
    }
  }
  
  void EnteredChoice(int choice){
  	InputData Aref2= new InputData();
  	AtmProcess2 Bref= new AtmProcess2();
    if(choice ==1 ){
    	Aref2.showMsg("You selected 1 to Create New Account");
    	Bref.CreateAccount();
    	
    }
    else if(choice ==2 ){
      Aref2.showMsg("You selected 2 to Check Account Balance");
      Bref.checkBal();
    }
    else if(choice ==3 ){
      Aref2.showMsg("You selected 3 to Deposite Money");
      Bref.deposite();
    }
    else if(choice ==4 ){
      Aref2.showMsg("You selected 4 to Withdraw Money");
      Bref.withdraw();
    }
    else if(choice ==5 ){
      Aref2.showMsg("You selected 5 to Change PIN");
      Bref.changePIN();
    }
    else{
      Aref2.showMsg("\nYou entered wrong choice.\nTry Again!!");
    }
  }
}
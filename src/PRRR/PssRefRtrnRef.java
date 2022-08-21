package PRRR;

import PRRR.BANK;


class BANK{
  int SB, CB;
  void setBal( int s, int c){
    SB= s;  CB= c;
  }
  void show(){
    System.out.println("SB= "+ SB+"  CB+"+ CB);
  }
  void Party(BANK ref){
    SB+= ref.SB;
    CB+= ref.CB;
    
  }
  BANK Party2(BANK ref){
    BANK Pref= new BANK();
    
    Pref.SB= SB + ref.SB;
    Pref.CB= CB + ref.CB;
    
    return Pref;
  }
}



class PssRefRtrnRef {

  public static void main(String[] args) {
		BANK Aref= new BANK();
		Aref.setBal(1, 2);
		Aref.show();
		
		BANK Rref= new BANK();
		Rref.setBal(3, 4);
		Rref.show();
		
		Aref.Party(Rref);
		Aref.show();
		Rref.show();
		
		BANK Cref= Rref.Party2(Aref);
		Cref.show();
  }

}

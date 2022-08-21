package classObject;

class RECT{
  int l=5, b=10;
}

class equalMethod {

  public static void main(String[] args){
  	RECT  r1= new RECT();
  	RECT  r2= new RECT();
  	
  	System.out.println(r1);
  	System.out.println(r2);
  	
  	System.out.println(r1==r2);
  	System.out.println(r1.equals(r2));
  	
  	RECT r3= r1;
  	System.out.println(r1);
  	System.out.println(r3);
  	System.out.println(r1==r3);
  	System.out.println(r1.equals(r3));
  	
  	//--------------------------------------------------
  	
  	String s1= new String("ABC");
  	String s2= new String("ABC");
  	
  	System.out.println(s1);
  	System.out.println(s2);
  	
  	System.out.println(s1== s2);
  	System.out.println(s1.equals(s2));
  }
}
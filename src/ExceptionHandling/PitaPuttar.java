package ExceptionHandling;

class PitaPuttar {
	public static void main(String args[]){
	  System.out.println("START");
	  Lib ref= new Lib();
	  
	  try{
	    ref.doDiv(0);
		} 
		catch(ArrayIndexOutOfBoundsException e){
		  System.out.println(e);
		  e.printStackTrace();
		}
	}
}
class Lib{
  void doDiv(int d){
    System.out.println("in doDiv()");
    
    try{
      int dv=5/d;
      System.out.println(dv);
      
      int arr[]={6, 8, 10};
      System.out.println(arr[d]);
    }
    catch(ArithmeticException exp){
      System.out.println(exp);
    }
    System.out.println("Outside doDiv()");
  }
}

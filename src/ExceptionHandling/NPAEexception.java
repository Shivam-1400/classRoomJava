package ExceptionHandling;

class NPAEexception {
	public static void main(String args[]){
	  System.out.println("START");
	  
	  Referance ref;
	  ref= null;
	  int l=0;
	  
	  try{
	    
	    int dv= 5/0;
	    System.out.println("Div= "+dv);
	    
	    ref.show();
		}
		catch(ArithmeticException e){
			System.out.println(e);
		  System.out.println(e.getMessage());
		}
		catch(NullPointerException e){
			System.out.println(e);
		  System.out.println(e.getMessage());
		}
		
		System.out.println("END");
	}
}
class Referance{
  void show(){
    int a;
  }
}

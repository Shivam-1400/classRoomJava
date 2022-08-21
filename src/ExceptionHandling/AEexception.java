package ExceptionHandling;

class AEexception {
	public static void main(String args[]){
	  System.out.println("Start");
	  
	  int l=0;
	  try {
	    int dv= 5/0;
	    System.out.println("Div= "+dv);
		}
		catch(ArithmeticException e){
		  System.out.println(e);
		  System.out.println();
		  e.printStackTrace();
		  System.out.println(e.getMessage());
		}
		
		System.out.println("END");
	}
}

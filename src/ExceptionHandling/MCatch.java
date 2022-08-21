package ExceptionHandling;

class MCatch {
	public static void main(String args[]){
	  System.out.println("Start");
	  
	  int l=0;
	  int ary[]= {2, 6, 8};
	  try{
	    int val= ary[l];
	    System.out.println("val= "+val);
	    
	    int dv= val/l;
	    System.out.println("Div= "+dv);
	    
	    String str= null;
	    System.out.println(str.length());
		}
		catch (ArithmeticException e){
		  System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e){
		  System.out.println(e);
		}
		catch (NullPointerException e){
		  System.out.println(e);
		}
		
		finally{
		  System.out.println("Finally block executed");
		}
		System.out.println("END");
	}
}

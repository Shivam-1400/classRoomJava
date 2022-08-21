package ExceptionHandling;

//extends Exception -> gives checked exception
//extends RuntimeException -> gives unchecked exception

class FloatingDivException extends Exception{
  FloatingDivException(String msg){
    super (msg);
  }
}

class UserExcp {
  public static void main(String args[]){
    System.out.println("START");
    
    float x=5, y=0.0f;
    
    try{
      if(y==0.0)
      	throw new FloatingDivException("Floating div not allowed");
      else{
        float dv= x/y;
        System.out.println("Div= "+dv); 
      }
    }
    catch(FloatingDivException e){
      System.out.println(e);
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }
}
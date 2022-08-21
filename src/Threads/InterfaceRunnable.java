package Threads;

class Process implements Runnable{
  public void run(){
    int i;
    for(i=1; i<=5; i++){
      System.out.println(i);
    }
  }
}
class Process2 implements Runnable{
  public void run(){
  	int j;
    for(j=6; j<=10; j++){
      System.out.println(j);
    }
  }
}


class InterfaceRunnable{
  public static void main(String args[]){
    Process obj1= new Process();
    Process2 obj2= new Process2();
    
    Thread thrd1= new Thread(obj1);
    Thread thrd2= new Thread(obj2);
    
    thrd1.setPriority(1 );
    thrd2.setPriority(10);
    
    thrd1.start();
    thrd2.start();
  }
}
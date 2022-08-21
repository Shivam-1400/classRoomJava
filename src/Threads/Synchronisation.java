package Threads;

class Resource{
  synchronized void printTable(int N){
    for(int i=1; i<=10; i++){
      System.out.println(N+"*"+i+"="+(N*i));
      try{  Thread.sleep(100);}
      catch(Exception exp){ exp.printStackTrace();}
    }
  }
}
class User implements Runnable{
  Resource printer;
  Thread th;
  int tb1;
  User(Resource res, int t){
    printer= res;
    tb1= t;
    th= new Thread(this);
    th.start();
  }
  public void run(){
    printer.printTable(tb1);
  }
}

class Synchronisation{

  public static void main(String[] args) {
    Resource printer= new Resource();
    
    User thrd1= new User(printer, 5);
    User thrd2= new User(printer, 10);
    
    
  }

}

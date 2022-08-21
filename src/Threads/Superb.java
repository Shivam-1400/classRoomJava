package Threads;

class Processs implements Runnable{
  int sp, ep;
  Thread thrd;
  Processs(int s, int e, String name){
    sp=s; ep=e;
    thrd= new Thread(this);
    thrd.setName(name);
    thrd.start();
  }
  public void run(){
    for(int i=sp; i<=ep; i++){
      System.out.println(thrd.getName()+": "+i);
    }
    System.out.println(thrd.getName()+" finished");
  }
}

class Superb{
  public static void main(String args[]){
    Processs th1;
    th1= new Processs(1, 5, "A");
    
    Processs th2= new Processs(6, 10, "B");
  }
}
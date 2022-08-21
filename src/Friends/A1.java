//Satyam Lal

package Friends;

class A1 implements Runnable{
  public void run(){
    for(int i=7; i<10; i++){
      System.out.println(i);
    }
  }
  public static void main (String args[]) throws Exception{
    Thread th= new Thread(new A1());
    th.start();
    System.out.println("S1");
    th.join();
    System.out.println("S2");
  }
}

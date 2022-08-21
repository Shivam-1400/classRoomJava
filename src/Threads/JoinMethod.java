//join() method of Thread class 
//it is invoked by one thread on other thread to wait 
//for the other thread to complete before proceeding. It 
//will block the calling thread from becoming runnable 
//till the other thread is alive. 

package Threads;

class ProcessEx4 extends Thread{
    int sp, ep;
    ProcessEx4(int s, int e, String name){
        sp=s;
        ep=e;
        setName(name);
        start();
    }
    public void run(){
        for(int i=sp; i<=ep; i++){
            try{
              sleep(10);
            }
            catch(Exception e){ }
            System.out.println(getName()+ ": "+i);
        }
        System.out.println(Thread.currentThread()+ " END");
    }
}
class JoinMethod{
    public static void main(String a[])throws Exception{
        
        System.out.println("Start");
        
        ProcessEx4 thrd1= new ProcessEx4(1, 5, "First");
        ProcessEx4 thrd2= new ProcessEx4(6, 10, "Second");
        
        thrd1.setPriority(10);
        thrd1.setPriority(7);
        thrd1.join();
        thrd2.join();
        
        System.out.println("END");
        
    }
}
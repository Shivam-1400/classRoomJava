//Creating multiple threads of similar process using a single class
//using parameterised constructor

package Threads;

class ProcessEx3 extends Thread{
    int sp, ep;
    ProcessEx3(int s, int e, String name){
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
class ThrdCons{
    public static void main(String a[])throws Exception{
        
        System.out.println("Start");
        
        ProcessEx3 thrd1= new ProcessEx3(1, 5, "First");
        ProcessEx3 thrd2= new ProcessEx3(6, 10, "Second");
        
        thrd1.setPriority(10);
        thrd1.setPriority(7);
                
        System.out.println("END");
        
    }
}
//Creating multi threads

package Threads;

class A2 extends Thread{
    public void run(){
        for(int i=0; i<20; i++){
            System.out.println(getName()+ ": * "+i);
            try {
                Thread.sleep(20);
            }
            catch(Exception e){ }
        }
    }
}
class B2 extends Thread{
    public void run(){
        for(int i=0; i<20; i++){
            System.out.println(getName()+ ": # "+i);
            try {
                Thread.sleep(20);
            }
            catch(Exception e){ }
        }
    }
}
class C2 extends Thread{
    public void run(){
        for(int i=0; i<20; i++){
            System.out.println(getName()+ ": $ "+i);
            try {
                Thread.sleep(20);
            }
            catch(Exception e){ }
        }
    }
}
class Thrd2{
    public static void main(String arg[]){
        A2 thrd1= new A2();
        B2 thrd2= new B2();
        C2 thrd3= new C2();

        thrd1.start();    
        thrd2.start();    
        thrd3.start();
    }
}
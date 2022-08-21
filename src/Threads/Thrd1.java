package Threads;

class A extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println(getName()+": "+ i);
            try {
                Thread.sleep(2);
            }
            catch(Exception e){ }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int j=6; j<=10; j++){
            System.out.println(getName()+": "+ j);
            try {
                Thread.sleep(2);
            }
            catch(Exception e){ }
        }
    }
}
class Thrd1{
    public static void main(String arg[]){
        A thrd1= new A();
        B thrd2= new B();
        
        thrd1.setName("BCE");    
        thrd2.setName("SST");
        
        thrd1.start();    
        thrd2.start();    
    }
}
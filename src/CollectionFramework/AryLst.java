 package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class AryLst{
  public static void main(String args[]){
    ArrayList arr= new ArrayList();
    arr.add(10);
    arr.add(2.09);
    arr.add("Shivam");
    arr.add(0, "RealJava");
    
    System.out.println(arr);
    
    arr.add(new Integer(200));
    System.out.println(arr);
    
    arr.remove(2);
    System.out.println(arr);
    
    arr.remove("Shivam");
    System.out.println(arr);
    
    System.out.println("=============================================================\n\n");
    
    ArrayList<Emplloyee> emarr= new ArrayList<Emplloyee>();
    
    Emplloyee emp1= new Emplloyee("Shivam", 2000000);
    emarr.add(emp1);
    
    System.out.println(emarr);
    
    emarr.add(new Emplloyee("Satyam", 1000000));
    emarr.add(new Emplloyee("Paras", 2000000));
    
    System.out.println(emarr);
    
    //emarr.remove(1);
    //System.out.println(emarr);
    
    //emarr.remove(emp1);
    //System.out.println(emarr);
    
    emarr.add(0, new Emplloyee("Karan", 1000000));
    System.out.println(emarr);
    
    System.out.println("=============================================================\n\n");
    
    System.out.println("=============================================================");
    System.out.println("Iterating all elements of ArrayList in four different ways ");
    System.out.println("=============================================================");
    
    //1
    int i;
    for(i=0; i<emarr.size(); i++){
      Emplloyee emp= emarr.get(i);
      System.out.println(emp);
    }
    
    System.out.println("=============================================================");
    
    //2
    for(Emplloyee emp: emarr){
      System.out.println(emp);
    
    }
    
    System.out.println("=============================================================");
    
    //3
    Iterator<Emplloyee> itr= emarr.iterator();
    while(itr.hasNext() ){
      Emplloyee ref= itr.next();
      System.out.println(ref);
    }
    System.out.println("=============================================================");
    
    //4
    int TotalSal=0;
    Enumeration<Emplloyee> enu= Collections.enumeration(emarr);
    while(enu.hasMoreElements() ){
      Emplloyee ref= enu.nextElement();
      System.out.println(ref);
      TotalSal+= ref.sal;
    }
    
    System.out.println("=============================================================");
		System.out.println("TOtal Salary= "+ TotalSal);

  }
}

class Emplloyee{
  String name;
  int sal;
  Emplloyee(String name, int sal){
    this.name= name;
    this.sal= sal;
  }
  public String toString(){
    //System.out.println("Name: "+name+" Sal: "+sal);
    
    return ("Name: "+name+" + Sal: "+sal);
  }
}
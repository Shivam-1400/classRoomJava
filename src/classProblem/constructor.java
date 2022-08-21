package classProblem;

import java.util.Scanner;



class Default{


Default(){


System.out.println("***Constructor Without Parameters***"); System.out.println();


System.out.println("Enter deatails of student ");


}


}


class Parameterised {


Parameterised(String id, String name){


System.out.println("***Constructor With Parameters***");


System.out.println();


System.out.println("Name is "+name+" Student id is "+id);


}


}


class Ab{


private Ab(){


String a;


}


Ab(String b){


String a=b;
 

System.out.println();


System.out.println("This is private "+a);


}


}


public class constructor {


public static void main(String[] args) { 
    Default a1=new Default(); 
System.out.println("Uid = "); 
Scanner sc=new Scanner(System.in); 
String uid = sc.next(); 
System.out.println("Name = "); 
String name = sc.next();


Parameterised a2=new Parameterised(uid,name); Ab a3=new Ab("class");


}
}


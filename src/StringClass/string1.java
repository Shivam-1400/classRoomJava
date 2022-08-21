package StringClass;

class string1{
  public static void main(String args[]){
    String s1= "Shivam";
    System.out.println(s1);
    
    String s2= "Shivam";
    System.out.println(s2);
    
    System.out.println(s2==s1);
    System.out.println(s2.equals(s1));
    
    System.out.println("----------------------------------");
    
    String s3= new String("Keshri");
    System.out.println(s3);
    
    String s4= new String("Keshri");
    System.out.println(s4);
    
    System.out.println(s3==s4);
    System.out.println(s3.equals(s4));
    
    System.out.println("----------------------------------");
    
    String s5= new String(s1);
    System.out.println(s5);
    
    String s6= new String(s1);
    System.out.println(s6);
    
    System.out.println(s5==s6);
    System.out.println(s5.equals(s6));
    
    System.out.println("----------------------------------");
    
    char[] c= {'A', 'B', 'C', 'D'};
    String s7= new String(c);
    System.out.println(s7);
    
    System.out.println("----------------------------------");
    
    byte[] bt= {65, 66, 67, 68};
    String s8= new String(bt);
    System.out.println(s8);
    
    System.out.println("----------------------------------");
    
    System.out.println(s7== s8);
    System.out.println(s7.equals(s8));
    
    
    
  }
}
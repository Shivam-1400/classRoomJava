package Aggregation;

class PROFESSOR{
  String name;
  PROFESSOR(String N){ name= N;}
}

class DEPARTMENT{
  PROFESSOR hod;
  void setHOD(PROFESSOR pro){
    hod= pro;
  }
}

class College{
  public static void main(String args[]){
    PROFESSOR prof= new PROFESSOR("PkGabbar");
    DEPARTMENT cse= new DEPARTMENT();
    cse.setHOD(prof);
    
    DEPARTMENT ece= new DEPARTMENT();
    ece.setHOD(prof);
    
    System.out.println(cse.hod.name);
    System.out.println(ece.hod.name);
  }
}

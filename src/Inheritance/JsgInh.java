package Inheritance;

//Reusibility

class Lib{
  float Pi= 3.14f;
  float getSq(float a){
    return (a*a);
  }
}

class CIRCLE2 extends Lib{
  float ar;
  void ar(){
    ar= Pi* getSq(10);
    System.out.println(ar);
  }
}

class JsgInh{
  public static void main(String args[]){
    new CIRCLE2().ar();
  }
}
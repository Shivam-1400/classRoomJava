package Basic;

//==+== |\ || ||== ==+== |\ || ==+==  ==+== ||==
//  +   ||\|| ||__   +   ||\||   |      |   ||__
//==+== || \| ||   ==+== || \| ==+==    |   ||__

//Infinite loop  



class main3 {
  public static void main(String a[]) {
    boolean x= 2<=3, y=3>=4;
    System.out.println("X= "+x+"\nY= "+y);
    
    while(x){
      System.out.println("Hello");
      //ctrl+c to stop infinite loops.
    }
  }
}

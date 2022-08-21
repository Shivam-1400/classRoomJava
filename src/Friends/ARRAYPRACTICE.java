package Friends;

import java.util.Scanner;
class ARRAYPRACTICE
{
    public static void main(String[] args) {
        

    
    FACTORY ref=new FACTORY();
    int ary1[]=ref.createarray(5);
    int ary2[]=ref.createarray(5);
    
    ref.filearray(ary1);
    ref.filearray(ary2);
    ref.sumarray(ary1,ary2);
    }
}
class FACTORY
{
    int []createarray(int n)
    {
        int ary[]=new int[n];
        return(ary);
    }
    void filearray(int sary[])
    {
        Scanner cin=new Scanner(System.in);
        for(int i=0;i<sary.length;i++)
        {
            System.out.println("enter the value");
            sary[i]=cin.nextInt();
        }
    }
    void sumarray(int ary1[],int ary2[])
    {int i;
        int[] ary3=new int[5];
         for( i=0;i<ary3.length;i++)
        {
            
           ary3[i]=ary1[i]+ary2[i];
        
        System.out.println(ary3[i]+"sum");
        }
    }
}
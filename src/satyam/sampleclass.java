package satyam;

import java.util.Scanner;

class sampleclass {


	public static void main(String[] args) 
	{
		simpleinterest obj=new simpleinterest();
		obj.input();
		int SimpleInterest=obj.process();
		
		System.out.println("Simple Interest :"+SimpleInterest);

	}

}


class simpleinterest
{
	int p, r, t;
	Scanner cin = new Scanner(System.in);
	void input()
	{
		System.out.println("enter principal ,rate and time:");
		int p=cin.nextInt();
		int r=cin.nextInt()
;
		int t=cin.nextInt();
		
		
	}
	
	int  process()
	{	
		int SI= (p*r*t)/100;
		return SI;
		
	}
	
	
}
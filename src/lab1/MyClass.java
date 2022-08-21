package lab1;

public class MyClass {
	
	public static void showUse(){
		System.out.println("->This is the static method of the custom class.");
		}
		public void showUse(int a)
		{
		System.out.println("->This is the overloaded method of custom class and the parameter is "+a);
		}
		
		
		public static int addNum(int a,int b){return a+b;
		}
		public int addNum(int a,int b,int c){
		return a+b+c;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj=new MyClass();
		//object of Main class
		System.out.println("Sum of the two numbers are:"+addNum(2,3));
		//Static method of Main class
		System.out.println("Sum of the three numbers are:"+obj.addNum(2,3,4));
		MyClass obj1=new MyClass();
		MyClass.showUse();
		obj1.showUse(2);
	}

}
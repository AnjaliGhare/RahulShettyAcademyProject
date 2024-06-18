package coreJava;

public class ConstrctorDemo {


     //default constructor
		public ConstrctorDemo() 
		{
			System.out.println("I am the Constrctor");
		}
		
		 //default constructor
		public ConstrctorDemo(int a, int b) 
		{
			System.out.println("I am in the parameterized Constrctor");
			System.out.println(a+" & "+b +" are the parameters");
		}
		
		
		public void getData() 
		{			
			System.out.println("I am the method");
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			ConstrctorDemo constructor =new ConstrctorDemo();
			ConstrctorDemo para_const=new ConstrctorDemo(1,2);
			
	}

}

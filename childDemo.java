package coreJava;

public class childDemo extends parentDemo {
	
	String name ="child class";
	public void getData() 
	{
		System.out.println(name);
		System.out.println(super.name);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	childDemo cd= new childDemo();
	cd.getData();
	}

}

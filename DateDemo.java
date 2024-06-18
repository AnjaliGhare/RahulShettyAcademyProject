package coreJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//current date..current time./
		Date date = new Date();
		
		SimpleDateFormat simpleformat1= new SimpleDateFormat("M/d/YYYY");
		System.out.println(simpleformat1.format(date));
		
		SimpleDateFormat simpleformat2= new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");	
		System.out.println(simpleformat2.format(date));
		
		System.out.println(date.toString());

		
	}

}

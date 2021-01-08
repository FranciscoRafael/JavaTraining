package Primitive;

import java.util.Date;

public class Import {
	public static void main(String[] args) {
		
		Date d = new Date(); 
		System.out.println(d);
		
		long day = d.getTime();
		
		System.out.println(day);
		
	}
}

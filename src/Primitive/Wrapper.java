package Primitive;

public class Wrapper {

	public static void main(String[] args) {
		
		Byte b = 100; 
		Short s = 1000; 
		Integer i = 10000; 
		Long l = 100000L; 
		Double d = 10.1; 

		Boolean boo = true; 
		Float f = 100.123f;
		Character c = 'a';

		System.out.println(b.intValue());
		System.out.println(s.toString());
		System.out.println(i.doubleValue());
		System.out.println(l.hashCode());
		System.out.println(d.intValue());
		System.out.println(boo.booleanValue());
		System.out.println(f.intValue());
		System.out.println(c.toString());
	}	
}

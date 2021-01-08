package fundamentals;

public class Temperatura {
	public static void main(String[] args) {
		
		final double FATOR = 5.0/9.0; 
		final int AJUSTE = 32; 
		
		double Ftemp = 86.0; 
		double result; 
		
		result = (Ftemp - AJUSTE) * FATOR; 
		System.out.println("Resultado em Celsius é: " + result);
			
	}

}

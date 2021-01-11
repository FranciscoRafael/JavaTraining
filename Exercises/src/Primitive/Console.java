package Primitive;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nome = entrada.nextLine();
		System.out.println(nome);
		entrada.close();
	}
}
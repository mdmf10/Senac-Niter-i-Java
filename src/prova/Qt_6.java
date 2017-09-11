package prova;

import java.util.Scanner;

public class Qt_6 {
	public static void main(String[] args){
		
		double valor;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Valor depositado: ");
		valor = leitura.nextDouble();
		
		valor = (0.7 * valor * 5 ) + valor;
		
	}
}

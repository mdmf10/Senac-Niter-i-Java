package Aula01_09_17;

import java.util.Scanner;

public class TesteLogin {
	public static void main(String[] args){
		
		int senha = 123;
		int senhaDigitada;
		
		//Faz leitura do teclado(Entrada de dados)
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a senha: ");
		senhaDigitada = scan.nextInt();
		 //fecha o buffer
		scan.close();
		
		while(senha== senhaDigitada) {
			System.out.println("Está logado");
		}
	}
}

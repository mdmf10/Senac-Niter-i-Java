package Aula01_09_17;

import java.util.Scanner;

public class TesteNextLine {
	public static void main(String[] args){
		
		//tipos wrapper
		String nomeCompleto;
		Integer idade;
		Double peso;
		String sexo;
		Boolean maiorIdade = false;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o nome completo: ");
		nomeCompleto = teclado.nextLine();
		
		System.out.print("Informe a idade: ");
		idade = teclado.nextInt();
		
		System.out.print("Informe o peso: ");
		peso = teclado.nextDouble();
		
		System.out.print("Informe o sexo: ");
		sexo = teclado.next();
		teclado.close();
		
		if(idade>= 18)
			maiorIdade = true;
		
		System.out.println("O nome informado foi: " + nomeCompleto +
						"\nA idade informada foi: " + idade +
						"\nO peso informada foi: " + peso +
						"\nO sexo informada foi: " + sexo +
						"\nCom os dados informados foi definido que a pessoa � " +
						(maiorIdade ? "maior":"menor") + "de idade");
	}
}

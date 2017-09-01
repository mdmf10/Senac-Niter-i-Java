package Aula01_09_17;

public class Ex3 {
	public static void main(String[] args) {
		
		double assinatura = 32;
		double impulsos = .09;
		double chamadasCelular = .35;
		
		Double valorDaConta = assinatura + ((254-90) * impulsos) + 23 *  chamadasCelular;
		
		System.out.println("O valor da conta será: " + valorDaConta);
		
	}
}

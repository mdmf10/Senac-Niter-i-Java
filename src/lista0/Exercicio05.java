package lista0;

public class Exercicio05 {	
	public static void main(String[] args) {
		double numeroEleitores;
		double votoBranco;
		double votoNulo;
		double votoValidos;
		double pBranco;
		double pNulo;
		double pValido;
		
		numeroEleitores = 100;
		votoBranco = 10.;
		votoNulo = 5.;
		votoValidos = 85.;
		
		votoBranco = (votoBranco/numeroEleitores)*100;
		votoNulo = (votoNulo/numeroEleitores)*100;
		votoValidos = (votoValidos/numeroEleitores)*100;
		
		System.out.println("pBranco");
		System.out.println("pNulo");
		System.out.println("pValido");
	}
}



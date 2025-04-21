package aula2;

public class tipoVariaveis {

	public static void main(String[] args) {
		String meuNome = "Rafael";
		
		System.out.print(meuNome);
		
		double salarioMinimo = 2500;
		System.out.print(salarioMinimo);
		
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		short numeroCurto2 = (short) numeroNormal;
		
		System.out.print(numeroCurto2);
		int numero = 5;
		
		numero = 10;
		System.out.print(numero);
		
		
		
		final double VALOR_DE_PI = 3.14;
		
		System.out.print(VALOR_DE_PI);
		
		//VALOR_DE_PI = 10.75;
	}
	
}

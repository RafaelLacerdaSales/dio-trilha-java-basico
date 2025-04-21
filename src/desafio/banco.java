package desafio;

public class banco {
public static void main(String[] args) {
	double saldo = 25;
	double valorSolicitado = 18;
	if(saldo>=valorSolicitado) {
		saldo -= valorSolicitado;
	} else {
		System.out.println("Saldo Insuficiente");
	}
	System.out.println("Saldo Atual R$" + saldo);
	
}
}

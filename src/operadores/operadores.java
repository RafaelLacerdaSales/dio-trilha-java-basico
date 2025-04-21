package operadores;

public class operadores {

    public static void main(String[] args) {
        String nomeCompleto = "linguagem " + " java";
        System.out.println(nomeCompleto);
        
        int numero = 5;
        numero = - numero;
        
        System.out.println(numero);
        
        numero = numero * -1;
        
        System.out.println(numero);
        
        
        
        int Numero = 5;
        		
        	//Numero = Numero + 2; 
        
        	

        System.out.println(++ Numero);
        
        System.out.println(-- Numero);
        
        
        
        boolean variavel = true;
        
        variavel = !variavel;
        
        System.out.println(variavel);
        
        
        
        int a,b;
        
        a = 5;
        b = 6;
        
        String resultado = a==b ? "verdadeiro" : "falsa";
        
        System.out.println(resultado);
        
        
        
        int numero1 = 1;
        int numero2 = 2;
        
        boolean simNao = numero1 == numero2;
        
        System.out.println("numeroum é igual a numeroDois? " + simNao);
        
         simNao = numero1 != numero2;
        
        System.out.println("numeroum é diferente numeroDois? " + simNao);
        
        
        simNao = numero1 > numero2;
        
        System.out.println("numeroum é maior que numeroDois? " + simNao);
        
        
        
        
        boolean condicao1= true;
        
        boolean condicao2= true;
        
        if(condicao1 && condicao2) {
        	
        	System.out.println("as duas condições são verdadeiras");
        }
        
        if(condicao1 || condicao2) {
        	
        	System.out.println("uma das condições são verdadeiras");
        }
        
                
    }
}

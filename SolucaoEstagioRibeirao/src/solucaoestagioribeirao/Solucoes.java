package solucaoestagioribeirao;


public class Solucoes {
	
	public static void ProblemaValorSoma() {
		int INDECE = 13,SOMA =0, K=0;
		
		while(K<INDECE) {
			K+= 1;
			SOMA += K;
		}
		
		System.out.print("O valor da variavel soma é: "+SOMA);
		
	}
	
	public static void ProblemaFibonacci (int Numero) {
		if(Numero == 0 || Numero == 1) {
			System.out.print("O numero Informado Percente a sequencia de Fibonacci");
		}else if(Numero < 0){
			System.out.print("O numero inserido é negativo,por favor inserir um numero inteiro positivo");
		}else {
			int fibonnacci = 1;
			for(int i = 0; i <= Numero; i++) {
				
				if(Numero == fibonnacci) {
					System.out.print("O numero Informado Percente a sequencia de Fibonacci");
					break;
				}else if(Numero > fibonnacci) {
					System.out.print("O numero Informado nao Percente a sequencia de Fibonacci");
					break;
				}
				
				fibonnacci += fibonnacci;
				
			}
			
		}
	}
	
	public static void ProblemaProximoElemento() {
		
		System.out.print("a)1, 3, 5, 7,"+ 9);
		System.out.print("\nb)2, 4, 8, 16, 32, 64,"+128);
		System.out.print("\nc)0, 1, 4, 9, 16, 25, 36,"+49);
		System.out.print("\nd) 4, 16, 36, 64,"+100);
		System.out.print("\ne) 1, 1, 2, 3, 5, 8,"+13);
		System.out.print("\nf) 2,10, 12, 16, 17, 18, 19,"+20);	
		
	}
	
	public static void ProblemaInversãoString(String texto) {
		String invertida = "";
		for(int i = texto.length() -1; i >=0;i--) {
			invertida += texto.charAt(i);
			
		}
		System.out.println("A String "+texto+" invertida ficou:"+invertida);
		
			
	}
	

}

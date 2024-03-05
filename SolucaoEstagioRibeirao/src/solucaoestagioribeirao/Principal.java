package solucaoestagioribeirao;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		Solucoes.ProblemaValorSoma();
		
		System.out.print("\nInforme um numero inteiro positivo:");
		int numero = in.nextInt();
		
		Solucoes.ProblemaFibonacci(numero);
		
		Solucoes.ProblemaProximoElemento();
		
		System.out.print("\nInsira um String:");
		String palavra = in.next();
		
		Solucoes.ProblemaInversãoString(palavra);
		
		in.close();
	}

}

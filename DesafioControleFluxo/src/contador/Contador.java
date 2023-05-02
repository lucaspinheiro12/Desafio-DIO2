package contador;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		}catch ( ParametrosInvalidosException e) {
			e.printStackTrace();
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}else {
			System.out.println("Os numeros escolhidos são: " + parametroUm + "|" + parametroDois);
			int contagem = parametroDois - parametroUm;
			System.out.print("A SEQUENCIA DE NUMERO É: ");
			for(int i = 1 ; i<= contagem ; i++) {	
				System.out.print( i+ ", ");
			}
			
		}
		
		//realizar o for para imprimir os números com base na variável contagem
	}
}

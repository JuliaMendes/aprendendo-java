package controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a m�dia:");
		double media = entrada.nextDouble();
		
		boolean criterioAprovacaoAtingido = media <= 10 && media >= 7.0;
		if(criterioAprovacaoAtingido) {
			System.out.print(" Aluno aprovado! Parab�ns");
				
		}
		
		boolean criterioRecuperacaoAtingido = media < 7 && media >= 4.5;
		if(criterioRecuperacaoAtingido) {
			System.out.print("Aluno de recupera��o!");
		}
			
		boolean criterioReprovacaoAtingido = media < 4.5 && media >= 0;
		if(criterioReprovacaoAtingido) {
			System.out.print("Aluno reprovado!");
								
		}
			
	
		
		entrada.close();
	}

}

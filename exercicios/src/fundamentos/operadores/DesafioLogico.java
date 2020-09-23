package fundamentos.operadores;

public class DesafioLogico {
	
	public static void main(String[] args) {
		// Trabalho na terça (v ou F)
		// Trabalho na quinta (V ouF)
		
		boolean trabalho1 = true;
		boolean trabalho2= true;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		//Operador Unitário.
		boolean maisSaudável = !comprouSorvete;
		
		
		System.out.println("Comprou TV 50\"? " + comprouTV50);
		System.out.println("Comprou TV 32\"? " + comprouTV32);
		System.out.println("Comprou sorvete? " + comprouSorvete);
		System.out.println("Mais saudável? " +  maisSaudável);
		
	}
	
	
	

}

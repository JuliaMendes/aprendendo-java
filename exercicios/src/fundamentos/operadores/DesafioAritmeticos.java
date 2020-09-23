package fundamentos.operadores;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		var a = (3+2)*6;
		var b = Math.pow(a, 2);
		var c = 3*2 ;
		var d = b/c;
		
		var e = (1-5)*(2-7) / 2;
		var f = Math.pow(e, 2);
		
		var g = d-f;
		
		var h = g/10;
		var i = Math.pow(h, 3);
		System.out.println("O resultado da equação é: " + i);
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1-5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2 );
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println("O resultado é " + resultado);
				
	}

}

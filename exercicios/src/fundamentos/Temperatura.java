package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (F - 32) x 5/9 = C
		
		final double ajuste = 32;
		final double multiplicador = 5.0/9.0;
		
		double  f = 86;
		
		double celsius = (f-ajuste) * multiplicador;
		
		System.out.println("A conversão de Fahrenheit para Celsius é = "+ celsius + " °C");
	}

}

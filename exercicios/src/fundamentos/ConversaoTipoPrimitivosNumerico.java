package fundamentos;

public class ConversaoTipoPrimitivosNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; // implícita
		System.out.println(a);
		
		float b = (float) 1.123555874; // explícita (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; // explíicta (CAST)
		System.out.println(d);
		
		double e  = 1.9999999999;
		int f = (int) e; // explícita (CAST)
		System.out.println(f);
	}

}

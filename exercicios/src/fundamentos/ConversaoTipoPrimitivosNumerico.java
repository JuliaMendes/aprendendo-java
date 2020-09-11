package fundamentos;

public class ConversaoTipoPrimitivosNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; // impl�cita
		System.out.println(a);
		
		float b = (float) 1.123555874; // expl�cita (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; // expl�icta (CAST)
		System.out.println(d);
		
		double e  = 1.9999999999;
		int f = (int) e; // expl�cita (CAST)
		System.out.println(f);
	}

}

package fundamentos;

public class ConversaoTipoPrimitivoNumerico 
{	
	public static void main(String[] args) 
	{
		//metodo (CAST)
		
		//procedimento
		//tipo nome_variavel = (tipo) variavel_antiga
		
		
		int i = 2;
		float f = i;//conversão implícita
		System.out.println(f);
		
		int n = 1245;
		byte c = (byte) n;///explícita(cast)
		System.out.println(c);
		
		double e = 1;
		int u = (int) e;//explícita (cast)
		System.out.println(u);
	}
}


package fundamentos;

public class Wrappers {
	
	public static void main(String[] args) {
		//A mesma regra usada nos tipos primitivo é usado nos wrappers
		//Nos wrappers é possivel usar notação ponto
		//A primeira letra é em maiúsculo
		
		//tipos inteiros
		Byte b = 100;//equivalente ao byte
		Short s = 1_000;//equivalente ao short
		Integer i = 20_000_000;//equivalente ao int
		Long l = 20_00_000_000_000_000L;//equivalente ao long
	
		//tipos reais
		Float f = 2_000.00F;
		Double d = 200_000.00;
		
		//outros
		Boolean bo = true;//equivalente ao boolean
		
		Character c = '#';//equivalente ao char
		
		//Algumas possibilidades com os wrappers
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i + l);
		
		bo = bo.parseBoolean("false");
		System.out.println(bo);
		
		System.out.println(c + "....");
		
		System.out.println(f);
		
		System.out.println(d);
	}
}

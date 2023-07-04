package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número");//vai fazer um input usando a biblioteca swing
		
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número");
	
		int numero1 = Integer.parseInt(valor1);
		int numero2 = Integer.parseInt(valor2);
		
		/*
		 * -------todas as funções de conversão--------
		 * 
		 * Byte.parseByte(valor);
		 * Short.parseShort(valor);
		 * Integer.parseInt(valor);
		 * Long.parseLong(valor);
		 * 
		 * Float.parseFloat(valor);
		 * Double.parseDouble(valor);
		 * 
		 * Boolean.parseBoolean(valor);
		 *
		 */
		
		
		System.out.printf("A soma entre %,d e %,d e: %,2d", numero1, numero2, (numero1 + numero2));
		
		
	}
}

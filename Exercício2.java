package Exercicios;

import javax.swing.JOptionPane;

public class Exerc�cio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double A, B, C, D;
		
		A=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		B=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
		C=A-B;
		D=B-A;
		String texto = diferenca(A, B, C, D);
		
		JOptionPane.showMessageDialog(null, texto);
	
	}
	
	static String diferenca(double um, double dois, double resultado, double resultado1) 
	
		{
		
		
			
		if(um==dois) 
			return "N�o existe diferen�a xD";
		
		if(um>dois) 
			return "A diferen�a entre "+um+" e "+dois+" � "+resultado;
		
		if(dois>um)
			return "A diferen�a entre "+um+" e "+dois+" � "+resultado1;
		else
			return "VALOR INEXISTENTE";
		
		
		
			
		}
		
		
		
	}
	



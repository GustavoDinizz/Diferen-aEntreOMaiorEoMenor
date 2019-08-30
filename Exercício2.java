package Exercicios;

import javax.swing.JOptionPane;

public class Exercício2 {

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
			return "Não existe diferença xD";
		
		if(um>dois) 
			return "A diferença entre "+um+" e "+dois+" é "+resultado;
		
		if(dois>um)
			return "A diferença entre "+um+" e "+dois+" é "+resultado1;
		else
			return "VALOR INEXISTENTE";
		
		
		
			
		}
		
		
		
	}
	



package modulo1;

import javax.swing.JOptionPane;

public class Aula4 {

	public static void main(String[] args) {
		
		int resp = JOptionPane.showConfirmDialog(null, "Gostaria de iniciar os calculos");
		if(resp==0) {
			int num1 = (int)Double.parseDouble(JOptionPane.showInputDialog(null,"Qual o primeiro numero para somar?"));
			int num2 = (int)Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o primeiro numero para somar?"));
			JOptionPane.showMessageDialog(null,"A soma foi "+(num1+num2));
			
		}else {
			JOptionPane.showMessageDialog(null,"Ok, você cancelou o programa.");
		}
	}
}

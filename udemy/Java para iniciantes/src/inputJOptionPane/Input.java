package inputJOptionPane;

import javax.swing.JOptionPane;

public class Input {

	public static void main (String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		JOptionPane.showMessageDialog(null, "Bem Vindo(a) "+nome);
	}
}

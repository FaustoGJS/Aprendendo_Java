package inputScanner;

import java.util.Scanner;

public class Input {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome;
		System.out.print("Digite seu nome: ");
		nome=input.nextLine();
		System.out.print("Bem Vindo(a) "+nome);
	}

}

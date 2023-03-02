/*Aplicando o uso de metodo e calculo com concatenação com variaveis global e variaveis local*/

package modulo1;

public class Aula2 {

	static int num1 =10;
	static int num2 =20;
	static String frase = "a suma das variaveis é ";
	
	public static void main(String[] args) {
		
		calculadora(num1,num2);
		
	}
	
	public static void calculadora(int a,int b) {
		int c=a+b;
		System.out.print(frase+c);
	}
	
}

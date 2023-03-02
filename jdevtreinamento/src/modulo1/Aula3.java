/*Aplicando o uso de metodos e operadores lógicos*/

package modulo1;

public class Aula3 {
	
	static int nota1=5;
	static int nota2=2;
	static int nota3=0;
	static int nota4=7;
	static int notaFinal;

	public static void main(String[] args) {
		media(nota1,nota2,nota3,nota4);
	}
	
	public static void media(int a, int b, int c,int d) {
		notaFinal = (a+b+c+d)/4;
		System.out.println("Sua nota final foi "+notaFinal);
		resultadoFinal(notaFinal);
		
	}
	
	public static void resultadoFinal(int a) {
		if(a>=1) {
			if(a>=2&&a<=5) {
				System.out.print("Recuperação");
			}
			else if(a>=6&&a<=8) {
				System.out.print("Muito bem, passou de ano");
			}
			else {
				System.out.print("Parabens, você é um excelente aluno");
			}
		}else {
			System.out.print("Reprovado sem chance de recuperação");
		}
	}
}



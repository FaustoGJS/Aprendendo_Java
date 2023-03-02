package modulo1;

import javax.swing.JOptionPane;

public class Aula3B {


		static int nota1;
		static int nota2;
		static int nota3;
		static int nota4;
		static int notaFinal;
		static String message;

		public static void main(String[] args) {
			entrada();
		}
		
		public static void entrada() {
			nota1=(int)Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
			nota2=(int)Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
			nota3=(int)Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota"));
			nota4=(int)Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota"));
			media(nota1,nota2,nota3,nota4);
			JOptionPane.showMessageDialog(null, message);
		}
		
		public static void media(int a, int b, int c,int d) {
			notaFinal = (a+b+c+d)/4;
			System.out.println("Sua primeira nota foi = "+a);
			System.out.println("Sua segunda nota foi = "+b);
			System.out.println("Sua terceira nota foi = "+c);
			System.out.println("Sua quarta nota foi = "+d);
			System.out.println("-----------------------------");
			System.out.println("Sua media final foi "+notaFinal);
			resultadoFinal(notaFinal);
			
		}
		
		public static void resultadoFinal(int a) {
			
			if(a>=1) {
				if(a>=2&&a<=5) {
					message="Recuperação";
				}
				else if(a>=6&&a<=8) {
					message="Muito bem, passou de ano";
				}
				else {
					message="Parabens, você é um excelente aluno";
				}
			}else {
				message = "Reprovado sem chance de recuperação";
			}
		}
	}



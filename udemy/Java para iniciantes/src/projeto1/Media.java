package projeto1;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.management.RuntimeErrorException;
import javax.swing.JOptionPane;

import fileSystemWrite.Write;

public class Media {
	

	public static void main(String[] args) throws IOException {
		String matricula = null;
		int n1=0,n2=0,n3=0,n4=0;
		int notaMedia = 0;
		String status = null;
		String erro=null;
		
		
		try {
			matricula = JOptionPane.showInputDialog("Digite o numero de matricula: ");
			if(matricula.length()<5) {
				throw new RuntimeException();
				}			
			}
			catch(RuntimeException e) {
				JOptionPane.showMessageDialog(null,"Matricula deve ter 5 digitos" );
			}
		
		try {
			
			n1 = Integer.parseInt( JOptionPane.showInputDialog(null, "1° nota"));
			if(n1<0||n1>=11) {
				erro="n1";
				throw new RuntimeException();
				
			}
			n2 = Integer.parseInt( JOptionPane.showInputDialog(null, "2° nota"));
			if(n2<0||n2>=11) {
				erro="n2";
				throw new RuntimeException();
				
			}
			
			
			n3 = Integer.parseInt( JOptionPane.showInputDialog(null, "3° nota"));
			if(n3<0||n3>=11) {
				erro="n3";
				throw new RuntimeException();
			}
			n4 = Integer.parseInt( JOptionPane.showInputDialog(null, "4° nota"));
			if(n4<0||n4>=11) {
				erro="n4";
				throw new RuntimeException();
			}
		}catch(RuntimeException e) {
				JOptionPane.showMessageDialog(null,"Informe apenas notas entre 0 e 10");
				System.out.print(erro);
				}
		notaMedia = (n1+n2+n3+n4)/4;
			if(notaMedia<3) {
				JOptionPane.showMessageDialog(null, "Reprovado - nota: "+notaMedia,null, JOptionPane.ERROR_MESSAGE);
				status="Reprovado";
			}
			else if(notaMedia>=4&&notaMedia<6) {
				JOptionPane.showMessageDialog(null, "Recuperação - nota: "+notaMedia,null, JOptionPane.WARNING_MESSAGE);
				status="Recuperação";
			}else if(notaMedia>=6&&notaMedia<=10) {
				JOptionPane.showMessageDialog(null, "Aprovado - nota: "+notaMedia,null, JOptionPane.INFORMATION_MESSAGE);
				status="Aprovado";
			}
		
		
		String path = "aluno-"+matricula+".txt";
		Writer arquivo = new PrintWriter(path);
		arquivo.write("Aluno: "+matricula+"\n 1° Nota:"+n1+"\n 2° Nota:"+n2+"\n 3° Nota:"+n3+"\n 4° Nota:"+n4+"\n Media: "+notaMedia+"\n Status: "+ status);
		arquivo.flush();
		arquivo.close();
	}
	
	
	


}

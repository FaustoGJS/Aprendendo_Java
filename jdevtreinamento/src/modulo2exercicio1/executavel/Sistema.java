package modulo2exercicio1.executavel;

import javax.swing.JOptionPane;

import modulo2exercicio1.classes.Aluno;

public class Sistema {

	public static void main (String[] args) {
		cadastro();
	}
	
	
	public static void cadastro() {
		Aluno aluno = new Aluno();
		
		aluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));
		aluno.setSerie(JOptionPane.showInputDialog("Qual a série do ensino fundamental esta matriculado: "));
		
		aluno.setMateria1(JOptionPane.showInputDialog("Digite a 1° matéria: "));
		aluno.setNota1materia1( Double.parseDouble(JOptionPane.showInputDialog("Qual nota tirou em "+aluno.getMateria1()+ " no 1° bimestre: ")));
		aluno.setNota2materia1( Double.parseDouble(JOptionPane.showInputDialog("Qual nota tirou em "+aluno.getMateria1()+ " no 2° bimestre: ")));
		aluno.setNota3materia1( Double.parseDouble(JOptionPane.showInputDialog("Qual nota tirou em "+aluno.getMateria1()+ " no 3° bimestre: ")));
		aluno.setNota4materia1( Double.parseDouble(JOptionPane.showInputDialog("Qual nota tirou em "+aluno.getMateria1()+ " no 4° bimestre: ")));
		
		aluno.setMateria2(JOptionPane.showInputDialog("Digite a 2° matéria: "));
		aluno.setNota2materia2( Double.parseDouble(JOptionPane.showInputDialog("Qual nota tirou em "+aluno.getMateria2()+ " no 1° bimestre: ")));
		aluno.setNota1materia2( Double.parseDouble(JOptionPane.showInputDialog("Qual nota tirou em "+aluno.getMateria2()+ " no 2° bimestre: ")));
		aluno.setNota3materia2( Double.parseDouble(JOptionPane.showInputDialog("Qual nota tirou em "+aluno.getMateria2()+ " no 3° bimestre: ")));
		aluno.setNota4materia2( Double.parseDouble(JOptionPane.showInputDialog("Qual nota tirou em "+aluno.getMateria2()+ " no 4° bimestre: ")));
		
		aluno.setMateria3(JOptionPane.showInputDialog("Digite a 3° matéria: "));
		aluno.setNota1materia3( Double.parseDouble(JOptionPane.showInputDialog("Qual nota tirou em "+aluno.getMateria3()+ " no 1° bimestre: ")));
		aluno.setNota2materia3( Double.parseDouble(JOptionPane.showInputDialog("Qual nota tirou em "+aluno.getMateria3()+ " no 2° bimestre: ")));
		aluno.setNota3materia3( Double.parseDouble(JOptionPane.showInputDialog("Qual nota tirou em "+aluno.getMateria3()+ " no 3° bimestre: ")));
		aluno.setNota4materia3( Double.parseDouble(JOptionPane.showInputDialog("Qual nota tirou em "+aluno.getMateria3()+ " no 4° bimestre: ")));
		
		aluno.setMateria4(JOptionPane.showInputDialog("Digite a 4° matéria: "));
		aluno.setNota1materia4( Double.parseDouble(JOptionPane.showInputDialog("Qual nota tirou em "+aluno.getMateria4()+ " no 1° bimestre: ")));
		aluno.setNota2materia4( Double.parseDouble(JOptionPane.showInputDialog("Qual nota tirou em "+aluno.getMateria4()+ " no 2° bimestre: ")));
		aluno.setNota3materia4( Double.parseDouble(JOptionPane.showInputDialog("Qual nota tirou em "+aluno.getMateria4()+ " no 3° bimestre: ")));
		aluno.setNota4materia4( Double.parseDouble(JOptionPane.showInputDialog("Qual nota tirou em "+aluno.getMateria4()+ " no 4° bimestre: ")));
		
		JOptionPane.showMessageDialog(null,
				"Aluno : "+aluno.getNome()+
				" - Série: "+aluno.getSerie()+"° grau do fundamental "+ 
				
				"\n\n Matéria: "+ aluno.getMateria1()+
				"\n 1° bimestre: "+aluno.getNota1materia1()+
				"\n 2° bimestre: "+aluno.getNota2materia1()+
				"\n 3° bimestre: "+aluno.getNota3materia1()+
				"\n 4° bimestre: "+aluno.getNota4materia1()+
				"\n Média: "+aluno.getMediaMateria1()+
				"\n"+aluno.getStatusMateria1()+
				
				"\n-----\n Matéria: "+ aluno.getMateria2()+
				"\n 1° bimestre: "+aluno.getNota1materia2()+
				"\n 2° bimestre: "+aluno.getNota2materia2()+
				"\n 3° bimestre: "+aluno.getNota3materia2()+
				"\n 4° bimestre: "+aluno.getNota4materia2()+
				"\n Média: "+aluno.getMediaMateria2()+
				"\n"+aluno.getStatusMateria2()+
				
				"\n-----\n Matéria: "+ aluno.getMateria3()+
				"\n 1° bimestre: "+aluno.getNota1materia3()+
				"\n 2° bimestre: "+aluno.getNota2materia3()+
				"\n 3° bimestre: "+aluno.getNota3materia3()+
				"\n 4° bimestre: "+aluno.getNota4materia3()+
				"\n Média: "+aluno.getMediaMateria3()+
				"\n"+aluno.getStatusMateria3()+
				
				"\n-----\n Matéria: "+ aluno.getMateria4()+
				"\n 1° bimestre: "+aluno.getNota1materia4()+
				"\n 2° bimestre: "+aluno.getNota2materia4()+
				"\n 3° bimestre: "+aluno.getNota3materia4()+
				"\n 4° bimestre: "+aluno.getNota4materia4()+
				"\n Média: "+aluno.getMediaMateria4()+
				"\n"+aluno.getStatusMateria4()
				);
	}
}

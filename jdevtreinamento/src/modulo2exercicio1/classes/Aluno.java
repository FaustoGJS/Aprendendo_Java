package modulo2exercicio1.classes;

public class Aluno {
	
	String nome;
	String serie;
	
	String materia1;
	String materia2;
	String materia3;
	String materia4;
	
	double nota1materia1;
	double nota2materia1;
	double nota3materia1;
	double nota4materia1;
	double nota1materia2;
	double nota2materia2;
	double nota3materia2;
	double nota4materia2;
	double nota1materia3;
	double nota2materia3;
	double nota3materia3;
	double nota4materia3;
	double nota1materia4;
	double nota2materia4;
	double nota3materia4;
	double nota4materia4;
	
	String statusMateria1;
	String statusMateria2;
	String statusMateria3;
	String statusMateria4;
	
	static double mediaMateria1;
	static double mediaMateria2;
	static double mediaMateria3;
	static double mediaMateria4;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public String getMateria1() {
		return materia1;
	}
	public void setMateria1(String materia1) {
		this.materia1 = materia1;
	}
	public String getMateria2() {
		return materia2;
	}
	public void setMateria2(String materia2) {
		this.materia2 = materia2;
	}
	public String getMateria3() {
		return materia3;
	}
	public void setMateria3(String materia3) {
		this.materia3 = materia3;
	}
	public String getMateria4() {
		return materia4;
	}
	public void setMateria4(String materia4) {
		this.materia4 = materia4;
	}
	
	public double getNota1materia1() {
		return nota1materia1;
	}
	public void setNota1materia1(double nota1materia1) {
		this.nota1materia1 = nota1materia1;
	}
	public double getNota2materia1() {
		return nota2materia1;
	}
	public void setNota2materia1(double nota2materia1) {
		this.nota2materia1 = nota2materia1;
	}
	public double getNota3materia1() {
		return nota3materia1;
	}
	public void setNota3materia1(double nota3materia1) {
		this.nota3materia1 = nota3materia1;
	}
	public double getNota4materia1() {
		return nota4materia1;
	}
	public void setNota4materia1(double nota4materia1) {
		this.nota4materia1 = nota4materia1;
	}
	public double getNota1materia2() {
		return nota1materia2;
	}
	public void setNota1materia2(double nota1materia2) {
		this.nota1materia2 = nota1materia2;
	}
	public double getNota2materia2() {
		return nota2materia2;
	}
	public void setNota2materia2(double nota2materia2) {
		this.nota2materia2 = nota2materia2;
	}
	public double getNota3materia2() {
		return nota3materia2;
	}
	public void setNota3materia2(double nota3materia2) {
		this.nota3materia2 = nota3materia2;
	}
	public double getNota4materia2() {
		return nota4materia2;
	}
	public void setNota4materia2(double nota4materia2) {
		this.nota4materia2 = nota4materia2;
	}
	public double getNota1materia3() {
		return nota1materia3;
	}
	public void setNota1materia3(double nota1materia3) {
		this.nota1materia3 = nota1materia3;
	}
	public double getNota2materia3() {
		return nota2materia3;
	}
	public void setNota2materia3(double nota2materia3) {
		this.nota2materia3 = nota2materia3;
	}
	public double getNota3materia3() {
		return nota3materia3;
	}
	public void setNota3materia3(double nota3materia3) {
		this.nota3materia3 = nota3materia3;
	}
	public double getNota4materia3() {
		return nota4materia3;
	}
	public void setNota4materia3(double nota4materia3) {
		this.nota4materia3 = nota4materia3;
	}
	public double getNota1materia4() {
		return nota1materia4;
	}
	public void setNota1materia4(double nota1materia4) {
		this.nota1materia4 = nota1materia4;
	}
	public double getNota2materia4() {
		return nota2materia4;
	}
	public void setNota2materia4(double nota2materia4) {
		this.nota2materia4 = nota2materia4;
	}
	public double getNota3materia4() {
		return nota3materia4;
	}
	public void setNota3materia4(double nota3materia4) {
		this.nota3materia4 = nota3materia4;
	}
	public double getNota4materia4() {
		return nota4materia4;
	}
	public void setNota4materia4(double nota4materia4) {
		this.nota4materia4 = nota4materia4;
	}
	
	
	public String getStatusMateria1() {
		return statusMateria1;
	}
	public void setStatusMateria1(String statusMateria1) {
		this.statusMateria1 = statusMateria1;
	}
	public String getStatusMateria2() {
		return statusMateria2;
	}
	public void setStatusMateria2(String statusMateria2) {
		this.statusMateria2 = statusMateria2;
	}
	public String getStatusMateria3() {
		return statusMateria3;
	}
	public void setStatusMateria3(String statusMateria3) {
		this.statusMateria3 = statusMateria3;
	}
	public String getStatusMateria4() {
		return statusMateria4;
	}
	public void setStatusMateria4(String statusMateria4) {
		this.statusMateria4 = statusMateria4;
	}
	
	
	public double getMediaMateria1() {
		double a=(nota1materia1+nota2materia1+nota3materia1+nota4materia1)/4;
		if(a>=1.9) {
			if(a>=1.9&&a<=5.0) {
				setStatusMateria1("Recuperação");
			}
			else if(a>=6.0&&a<=8.0) {
				setStatusMateria1("Muito bem, passou de ano");
			}
			else if(a>=8.1){
				setStatusMateria1("Parabens, você é um excelente aluno");
			}
		}else {
			setStatusMateria1("Reprovado sem chance de recuperação");
		}
	
		return a;
	}
	
	public double getMediaMateria2() {
		 double a=(nota1materia2+nota2materia2+nota3materia2+nota4materia2)/4;
		if(a>=1.9) {
			if(a>=1.9&&a<=5.0) {
				setStatusMateria2("Recuperação");
			}
			else if(a>=6.0&&a<=8.0) {
				setStatusMateria2("Muito bem, passou de ano");
			}
			else if(a>=8.1){
				setStatusMateria2("Parabens, você é um excelente aluno");
			}
		}else {
			setStatusMateria2("Reprovado sem chance de recuperação");
		}
	
		return a;
	}
	
	public double getMediaMateria3() {
		double a=(nota1materia3+nota2materia3+nota3materia3+nota4materia3)/4;
		if(a>=1.9) {
			if(a>=1.9&&a<=5.0) {
				setStatusMateria3("Recuperação");
			}
			else if(a>=6.0&&a<=8.0) {
				setStatusMateria3("Muito bem, passou de ano");
			}
			else if(a>=8.1){
				setStatusMateria3("Parabens, você é um excelente aluno");
			}
		}else {
			setStatusMateria3("Reprovado sem chance de recuperação");
		}
	
		return a;
	}
	
	public double getMediaMateria4() {
		double a =(nota1materia4+nota2materia4+nota3materia4+nota4materia4)/4;
		if(a>=1.9) {
			if(a>=1.9&&a<=5.0) {
				setStatusMateria4("Recuperação");
			}
			else if(a>=6.0&&a<=8.0) {
				setStatusMateria4("Muito bem, passou de ano");
			}
			else if(a>=8.1) {
				setStatusMateria4("Parabens, você é um excelente aluno");
			}
		}else {
			setStatusMateria4("Reprovado sem chance de recuperação");
		}
	
		return a;
	}
	
	
		
	
	
}

package enum3;

public enum DiaSemana {
	SEGUNDA("segunda-feira"),
	TERCA("terça-feira"),
	QUARTA("quarta-feira"),
	QUINTA("quinta-feira"),
	SEXTA("sexta-feira"),
	SABADO("sabado"),
	DOMINGO("domingo");
	
	private String descricao;
	
	private DiaSemana(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}

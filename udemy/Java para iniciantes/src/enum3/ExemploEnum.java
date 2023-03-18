package enum3;

public class ExemploEnum {
	
	public static void main(String[] args) {
		DiaSemana semana = DiaSemana.SABADO;
		
		switch(semana.ordinal()) {
			case 0:
				System.out.print("Hoje é "+semana.getDescricao()+", dia de trabalhar.");
				break;
			case 1:
				System.out.print("Hoje é "+semana.getDescricao()+", dia de trabalhar.");
				break;
			case 2:
				System.out.print("Hoje é "+semana.getDescricao()+", dia de trabalhar.");
				break;
			case 3:
				System.out.print("Hoje é "+semana.getDescricao()+", dia de trabalhar.");
				break;
			case 4:
				System.out.print("Hoje é "+semana.getDescricao()+", dia de trabalhar.");
				break;
			case 5:
				System.out.print("Hoje é "+semana.getDescricao()+", dia de folgar.");
				break;
			case 6:
				System.out.print("Hoje é "+semana.getDescricao()+", dia de folgar.");
				break;
			default:
				System.out.print("Dia da semana inválido");
				break;
			
	}
}
	
	

}

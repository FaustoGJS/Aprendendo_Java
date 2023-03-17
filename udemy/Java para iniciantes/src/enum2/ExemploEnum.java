package enum2;

public class ExemploEnum {
	
	public static void main(String[] args) {
		DiaSemana semana = DiaSemana.TERCA;
		
		if(semana==DiaSemana.SEGUNDA) {
			System.out.print("Processando "+semana.getDescricao());
		}else if(semana==DiaSemana.TERCA) {
			System.out.print("Processando "+semana.getDescricao());
		}else if(semana==DiaSemana.QUARTA) {
			System.out.print("Processando "+semana.getDescricao());
		}else if(semana==DiaSemana.QUINTA) {
			System.out.print("Processando "+semana.getDescricao());
		}else if(semana==DiaSemana.SEXTA) {
			System.out.print("Processando "+semana.getDescricao());
		}else if(semana==DiaSemana.SABADO) {
			System.out.print("Processando "+semana.getDescricao());
		}else if(semana==DiaSemana.DOMINGO) {
			System.out.print("Processando "+semana.getDescricao());
		}
		System.out.println("\n-------------------");
		for(DiaSemana dia: DiaSemana.values()) {
			System.out.println(dia.ordinal());
			System.out.println(dia.name());
			System.out.println(dia.getDescricao());
			System.out.println("-------------------");
		}
	}

}

package Enum1;

public class exemploEnum {
	
	public enum DIA_SEMANA {
		SEGUNDA,
		TERCA,
		QUARTA,
		QUINTA,
		SEXTA,
		SABADO,
		DOMINGO
	}

	public static void main(String[] args) {
		
		DIA_SEMANA semana = DIA_SEMANA.SEGUNDA;
		
		if(semana==DIA_SEMANA.SEGUNDA) {
			System.out.print("Processando Segunda...");
		}else if(semana==DIA_SEMANA.TERCA) {
			System.out.print("Processando Terça...");
		}else if(semana==DIA_SEMANA.QUARTA) {
			System.out.print("Processando Quarta...");
		}else if(semana==DIA_SEMANA.QUINTA) {
			System.out.print("Processando Quinta...");
		}else if(semana==DIA_SEMANA.SEXTA) {
			System.out.print("Processando Sexta...");
		}else if(semana==DIA_SEMANA.SABADO) {
			System.out.print("Processando Sabado...");
		}else if(semana==DIA_SEMANA.DOMINGO) {
			System.out.print("Processando Domingo...");
		}else {
			System.out.print("Dia inválido");
		}
	}
	
}

package modulo1;

public class Aula5 {

	public static void main(String[] args) {
		int i=0;
		System.out.println("loop - while");
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		System.out.println("-----------------");
		System.out.println("loop - do while");
		i=0;
		do {
			System.out.println(i);
			i++;
		}while(i<=5);
		System.out.println("-----------------");
		System.out.println("loop - for");
		for(int a=0;a<=5;a++) {
			System.out.println(a);
		}
	}
}

package fileSystemReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
	
	public static void main(String[] args) throws IOException  {
		
		String path = "arquivoTeste.txt";
		BufferedReader leitura = new BufferedReader(new FileReader(path));
		
		String arquivo;
		
		while((arquivo = leitura.readLine())!=null) {
			System.out.println(arquivo);
		}
		leitura.close();
		
	}

}

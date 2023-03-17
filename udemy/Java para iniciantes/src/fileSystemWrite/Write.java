package fileSystemWrite;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class Write {
	public static void main(String[] args) throws IOException {
		
		String path="arquivoTeste.txt";
		
		Writer write = new PrintWriter(path);
		write.write("criando arquivo de texto\n");
		for(int i=0;i<=10;i++) {
			write.write(i+"\n");
		}
		write.flush();
		write.close();
		
	}

}

package br.com.alura.javaLeitura.teste;

import java.io.*;

public class TesteCopiarArquivo {
	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada
		InputStream fis = new FileInputStream("lorem.txt");
	    Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream fic = new FileOutputStream("lorem3.txt");
		Writer Osw = new OutputStreamWriter(fic);
		BufferedWriter bw = new BufferedWriter(Osw);

		
		String linha = br.readLine();
		
		while(linha != null && !linha.isEmpty() ) {
			
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
			bw.flush();

		}
		
		System.out.println(linha);
		br.close();
		bw.close();
		
	}

}

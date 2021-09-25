package br.com.alura.javaLeitura.teste;

import java.io.*;

public class TesteLeitura {
	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada
		InputStream fis = new FileInputStream("lorem.txt");
	    Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		while(linha != null ) {
			
			linha = br.readLine();
			System.out.println(linha);

		}
		System.out.println(linha);
		br.close();
		
	}

}

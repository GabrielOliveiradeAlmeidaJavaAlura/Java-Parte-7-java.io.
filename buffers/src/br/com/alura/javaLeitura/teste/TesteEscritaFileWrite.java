package br.com.alura.javaLeitura.teste;

import java.io.*;

public class TesteEscritaFileWrite {
	public static void main(String[] args) throws IOException {
		

//
//		OutputStream fic = new FileOutputStream("lorem2.txt");
//		Writer Osw = new OutputStreamWriter(fic);
//		BufferedWriter bw = new BufferedWriter(Osw);
		FileWriter FW = new FileWriter("Lorem2.txt");
		FW.write("Lorem ipsum dolor sit amet");
		FW.write(System.lineSeparator());
		FW.write(System.lineSeparator());
		FW.write("Depois eu vou dar uma olhada2");
		FW.close();
		
		InputStream fis = new FileInputStream("lorem2.txt");
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

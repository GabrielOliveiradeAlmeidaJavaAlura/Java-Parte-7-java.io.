package br.com.alura.javaLeitura.teste;

import java.io.*;

public class TesteEscrita3 {
	public static void main(String[] args) throws IOException {
		


//		OutputStream fic = new FileOutputStream("lorem2.txt");
//		Writer Osw = new OutputStreamWriter(fic);
//		BufferedWriter bw = new BufferedWriter(Osw);
		long ini = System.currentTimeMillis(); 
		PrintStream ps = new PrintStream("lorem2.txt");
		
		ps.println("kkk");
		ps.println();
		ps.println();
		ps.println("Lorem ispsulum");
//		bw.newLine();
//		bw.write("mo base. Faremos uma cópia desta classe");
//		bw.newLine();
//		bw.write("Depois eu vou dar uma olhada");
//		bw.close();
		long fim = System.currentTimeMillis();

        System.out.println("Passaram " + (fim - ini) + " milissegundos");
		
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

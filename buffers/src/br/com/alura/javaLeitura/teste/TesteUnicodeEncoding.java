package br.com.alura.javaLeitura.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEncoding {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String C = "ç";
		System.out.println(C.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		 byte[] bytes = C.getBytes("UTF-16");
		 System.out.println(bytes.length + ", UTF-16");
		 String sNovo = new String(bytes, "UTF-16");
	        System.out.println(sNovo);

		 
		 bytes = C.getBytes(StandardCharsets.US_ASCII);
		 System.out.println(bytes.length + ", US_ASCII ");
		 sNovo = new String(bytes, "US_ASCII");
	        System.out.println(sNovo);
		 
		 bytes = C.getBytes("Windows-1252");
		 System.out.println(bytes.length + ", Windows-1252.");
		 sNovo = new String(bytes, "windows-1252");
	        System.out.println(sNovo);

	}

}

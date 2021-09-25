package br.com.alura.javaLeitura.teste;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Random;

import javax.imageio.ImageIO;

public class TesteLeitura {
	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada
		FileInputStream fis = new FileInputStream("lorem.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		BufferedImage imagem = ImageIO. read(new File("gfgf.png"));
		String linha = br.readLine();
		int w = imagem.getWidth();
		int h = imagem.getHeight();
		int[] pixels = imagem.getRGB(0, 0, w, h, null, 0, w);
		Random r = new Random();

		for (int col = 0; col < w; col++) {
		  for (int lin = 0; lin < h; lin++) {
		    pixels[w * lin + col] =
		      new Color(r.nextInt(255), col % 255, lin % 255).getRGB();
		  }
		}

		imagem.setRGB(0, 0, w, h, pixels, 0, w);
		
		while(linha != null ) {
			linha = br.readLine();
			 System.out.println(linha);

		}
		System.out.print(imagem);
		br.close();
		
	}

}

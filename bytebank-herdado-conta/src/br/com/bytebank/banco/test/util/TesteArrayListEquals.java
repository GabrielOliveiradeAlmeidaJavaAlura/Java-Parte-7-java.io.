package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import br.com.bytebank.banco.modelo.*;

public class TesteArrayListEquals {
	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta c0 = new ContaCorrente(33, 45);
		lista.add(c0);
		Conta c1 = new ContaCorrente(33, 45);
		//lista.add(c1);
		
		for (Conta conta : lista) {
	        System.out.println(conta);

		}
		boolean existe = lista.contains(c1);
		System.out.println("já existe? "+ existe);
		
	System.out.println(c1.equals(c0));
		
	}
}

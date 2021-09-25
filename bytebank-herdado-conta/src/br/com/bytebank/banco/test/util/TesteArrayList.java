package br.com.bytebank.banco.test.util;

import java.util.*;

import br.com.bytebank.banco.modelo.*;

public class TesteArrayList {
	public static void main(String[] args) {
		// ArrayList<Conta> lista = new ArrayList<Conta>();
		// List<Conta> lista = new ArrayList<Conta>(); Conta c0 = new
		// ContaCorrente(33,45);
		// List<Conta> lista = new LinkedList<Conta>();
		List<Conta> lista = new Vector<Conta>();
		
		Conta c1 = new ContaCorrente(33, 45);
		lista.add(c1);
		Conta c2 = new ContaCorrente(34, 45);
		lista.add(c2);
		Conta c3 = new ContaCorrente(34, 45);
		lista.add(c3);
		Conta c4 = new ContaCorrente(33, 45);
		lista.add(c4);
		Conta c5 = new ContaCorrente(33, 45);
		lista.add(c5);
		Conta c6 = new ContaCorrente(33, 45);
		lista.add(c6);
		Conta c7 = new ContaCorrente(33, 45);
		lista.add(c7);
		Conta c8 = new ContaCorrente(33, 45);
		lista.add(c8);
		Conta c9 = new ContaCorrente(33, 45);
		lista.add(c9);
		Conta c10 = new ContaCorrente(33, 45);
		lista.add(c10);
		Conta c11 = new ContaCorrente(33, 45);
		lista.add(c11);
		Conta c12 = new ContaCorrente(33, 45);
		lista.add(c12);
		Conta c13 = new ContaCorrente(33, 45);
		lista.add(c13);
		Conta c14 = new ContaCorrente(33, 45);
		lista.add(c14);
		Conta c15 = new ContaCorrente(33, 45);
		lista.add(c15);
		Conta c16 = new ContaCorrente(33, 45);
		lista.add(c16);

		for (int indice = 0; indice < lista.size(); indice++) {
			System.out.println(lista.get(indice));
		}
		for (Conta oRef : lista) {
			System.out.println(oRef);
		}

	}
}

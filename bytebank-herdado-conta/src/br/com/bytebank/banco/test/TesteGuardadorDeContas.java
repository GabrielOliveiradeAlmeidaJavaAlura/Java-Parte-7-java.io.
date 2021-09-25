package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TesteGuardadorDeContas {

	public static void main(String[] args) {

		GuardadorDeContas Guardador = new GuardadorDeContas();

		Conta c = new ContaCorrente(20, 33);
		Guardador.adicionar(c);

		Conta c2 = new ContaCorrente(23, 34);
		Guardador.adicionar(c2);

		int tamanho = Guardador.getQuantElem();
		System.out.println(tamanho);
		Conta ref = Guardador.getReferencia(2);

		GuardadorObjects GuardObject = new GuardadorObjects();
		Conta c3 = new ContaCorrente(90, 34);
		GuardObject.Adicionar(c3);
		
		Conta c4 = new ContaPoupanca(90, 34);
		GuardObject.Adicionar(c4);
		
		int c5 = 4;
		GuardObject.Adicionar(c5);
		
		ContaCorrente GUGU =(ContaCorrente) GuardObject.getObject(2);
		int tamanho3 = GuardObject.getQuantObjct();
		for(int tamanho2 = 0; GuardObject.getQuantObjct()>tamanho2 ; tamanho2++){
			System.out.println(GuardObject.getObject(tamanho2));
			
		}
	}
	}
		
		

	



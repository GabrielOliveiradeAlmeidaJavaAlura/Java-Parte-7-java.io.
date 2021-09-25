package br.com.bytebank.banco.modelo;

public class GuardadorObjects {
	private int indiceLivre;
	private Object[] objetos;

	public GuardadorObjects() {
		this.objetos = new Object[10];
	}

	public void Adicionar(Object obj) {
		this.objetos[indiceLivre] = obj;
		indiceLivre++;
	}

	public int getQuantObjct() {
		return this.indiceLivre;
	}

	public Object getObject(int indice) {
		return this.objetos[indice];
	}

	

}

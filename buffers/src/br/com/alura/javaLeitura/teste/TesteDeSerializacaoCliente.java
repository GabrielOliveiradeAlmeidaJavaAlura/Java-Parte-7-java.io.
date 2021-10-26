package br.com.alura.javaLeitura.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

 

public class TesteDeSerializacaoCliente {
 public static void main(String[] args) throws IOException, ClassNotFoundException {
//
//Cliente cliente = new Cliente();
//cliente.setCpf("12345678");
//cliente.setNome("Nico");
//cliente.setProfissao("Dev");
//
//
//	 ObjectOutputStream OOS = new ObjectOutputStream( new FileOutputStream("Cliente.bin"));
//	 OOS.writeObject(cliente);
//	 OOS.close();
	 
	 ObjectInputStream OIS = new ObjectInputStream( new FileInputStream("Cliente.bin"));
	 Cliente cliente = (Cliente) OIS.readObject();
	 System.out.println(cliente.getCpf()+", "+ cliente.getNome()+", "+ cliente.getProfissao()+".");
	 OIS.close();
	 
}
	   

}


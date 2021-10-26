package br.com.alura.javaLeitura.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

 
public class TesteDeSerializacao {
 public static void main(String[] args) throws IOException, ClassNotFoundException {
	 String Nome= "Nico Steppat";
//	 ObjectOutputStream OOS = new ObjectOutputStream( new FileOutputStream("Object.bin"));
//	 OOS.writeObject(Nome);
//	 OOS.close();
//	 
	 ObjectInputStream OIS = new ObjectInputStream( new FileInputStream("Object.bin"));
	 String nome = (String) OIS.readObject();
	 System.out.println(nome);
	 OIS.close();
	 
}
	// TODO Auto-generated method stub

}


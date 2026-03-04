package com.singleton.singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;

@SpringBootApplication
public class SingletonApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SingletonApplication.class, args);

		// Demonstração de uso das diferentes implementações de singleton

		// Chama o singleton implementado com campo público final (ElvisField)
		ElvisField.INSTANCE.leaveTheBuilding();

		// Chama o singleton implementado com factory estática (ElvisFactory)
		ElvisFactory.getInstance().leaveTheBuilding();

		// Chama o singleton implementado com enum (ElvisEnum)
		ElvisEnum.INSTANCE.leaveTheBuilding();

		// Chama o singleton serializável que preserva a propriedade via readResolve
		ElvisSerialized.INSTANCE.leaveTheBuilding();

		// Teste rápido de serialização/desserialização para provar que readResolve preserva o singleton
		File f = new File(System.getProperty("java.io.tmpdir"), "elvis.ser");
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f))) {
			out.writeObject(ElvisSerialized.INSTANCE);
		}

		ElvisSerialized deserialized;
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(f))) {
			deserialized = (ElvisSerialized) in.readObject();
		}

		System.out.println("ElvisSerialized same instance after deserialize: " + (deserialized == ElvisSerialized.INSTANCE));
	}

}

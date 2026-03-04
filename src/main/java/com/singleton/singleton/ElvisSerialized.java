package com.singleton.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

// Singleton serializável preservando a propriedade de singleton via readResolve
// Conceitos aplicados:
// - implementa Serializable
// - campos de instância são marcados como transient para que o estado não crie uma nova instância durante desserialização
// - fornece readResolve() que devolve a instância única (preserva singleton após desserialização)
public class ElvisSerialized implements Serializable {
    private static final long serialVersionUID = 1L;

    // Instância única, campo público final (abordagem do livro)
    public static final ElvisSerialized INSTANCE = new ElvisSerialized();

    // Exemplo de campo de instância que não deve controlar a identidade do singleton
    // Tornado transient para evitar que seu estado cause criação de novos objetos durante desserialização
    private transient String[] favoriteSongs = {"Heartbreak Hotel", "Hound Dog"};

    private ElvisSerialized() {
        // construtor privado
    }

    public void leaveTheBuilding() {
        System.out.println("ElvisSerialized: leaveTheBuilding");
    }

    // readResolve garante que, ao desserializar, retornamos a instância única em vez de um impostor.
    private Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }
}


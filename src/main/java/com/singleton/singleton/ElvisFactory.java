package com.singleton.singleton;

// Implementação do singleton com factory estática
// Conceitos aplicados:
// - campo privado static final que armazena a instância única
// - construtor privado para impedir instanciação externa
// - método público estático getInstance() expõe a instância (factory estática)
// Vantagens: permite alterar a estratégia de instanciação sem mudar a API

public class ElvisFactory {
    private static final ElvisFactory INSTANCE = new ElvisFactory();

    private ElvisFactory() {
        // construtor privado
    }

    public static ElvisFactory getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {
        System.out.println("ElvisFactory: leaveTheBuilding");
    }
}


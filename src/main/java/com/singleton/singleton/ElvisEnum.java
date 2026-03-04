package com.singleton.singleton;

// Implementação do singleton usando enum (abordagem preferida do livro)
// Conceitos aplicados:
// - enum com um único elemento garante uma única instância de forma segura
// - fornece serialização automática e proteção contra reflection/serialização
public enum ElvisEnum {
    INSTANCE;

    public void leaveTheBuilding() {
        System.out.println("ElvisEnum: leaveTheBuilding");
    }
}


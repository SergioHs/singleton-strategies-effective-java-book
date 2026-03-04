package com.singleton.singleton;

// Implementação do singleton com campo público final
// Conceitos aplicados:
// - public static final INSTANCE: deixa claro na API que a classe é um singleton (Gamma95)
// - construtor privado para impedir instanciação externa
// - proteção contra criação via reflection usando uma flag estática


public class ElvisField {
    // Campo público, estático e final que contém a única instância
    public static final ElvisField INSTANCE = new ElvisField();

    // Flag para detectar tentativas posteriores de criação (ex.: via reflection)
    private static boolean instanceCreated = false;

    private ElvisField() {
        if (instanceCreated) {
            // Defesa simples contra criação adicional por reflection
            throw new IllegalStateException("Instância já criada. Singleton garantido.");
        }
        instanceCreated = true;
    }

    public void leaveTheBuilding() {
        System.out.println("ElvisField: leaveTheBuilding");
    }
}


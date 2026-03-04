# ITEM 3: ENFORCE THE SINGLETON PROPERTY WITH A PRIVATE CONSTRUCTOR OR AN ENUM TYPE

Este projeto contém implementações de exemplo do Item 3 (Capítulo 2) do livro "Effective Java, Third Edition":

- Título do item: ITEM 3: ENFORCE THE SINGLETON PROPERTY WITH A PRIVATE CONSTRUCTOR OR AN ENUM TYPE

Tópicos abordados e exerctados no item do livro:
- Um singleton garante que exista exatamente uma instância de uma classe.
- Abordagens apresentadas no livro e implementadas aqui:
  - Campo público final (public static final INSTANCE) — inicialização imediata; API clara.
  - Factory estática (método getInstance()) — permite trocar a estratégia de criação sem mudar a API.
  - Enum com único elemento — abordagem preferida (segura contra serialização e reflection).
  - Serializable com readResolve() — preserva a propriedade de singleton após desserialização.

Arquivos de exemplo neste projeto (src/main/java/com/singleton/singleton):
- ElvisField.java        — singleton com campo público final
- ElvisFactory.java      — singleton com factory estática (getInstance)
- ElvisEnum.java         — singleton com enum (abordagem preferida)
- ElvisSerialized.java   — singleton serializável com readResolve()
- SingletonApplication.java — demonstração de uso e teste rápido de desserialização

Observações rápidas:
- Singletons dificultam testes (difícil substituição por mocks) — usar interfaces quando necessário.
- Proteção contra criação via reflection pode ser aplicada no construtor (lançar exceção se já existe instância).

Este README resume que o código implementa os exemplos do Item 3 do Effective Java (Third Edition).

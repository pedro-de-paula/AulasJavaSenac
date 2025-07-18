
# 🚗 Aula04 – Orientação a Objetos com a Classe `Carro`

> Nesta aula, criamos uma classe `Carro` e simulamos seu comportamento no console com atributos, métodos e instâncias.

---

## 📄 Arquivos incluídos

### 🧱 `Carro.java`
Define a estrutura de um carro como um objeto com:

- **Atributos**:
  - `cor` → cor do carro
  - `modelo` → modelo do carro
  - `ano` → ano de fabricação
  - `estaLigado` → indica se o carro está ligado ou não

- **Métodos**:
  - `ligar()` → liga o carro, se ainda estiver desligado
  - `desligar()` → desliga o carro, se estiver ligado

Inclui verificação para evitar ligar/desligar repetidamente.

---

### ▶️ `Main.java`
Classe que contém o método `main` para testar a classe `Carro`.

Simula o seguinte fluxo:
1. Criação de um carro (`Fiat Toronto`, vermelho, ano 2025)
2. Liga o carro
3. Tenta ligar novamente (mensagem: já está ligado)
4. Desliga o carro
5. Tenta desligar novamente (mensagem: já está desligado)



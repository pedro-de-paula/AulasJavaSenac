# 🛵 Aula05 – Simulando uma Moto em Java

> Aprendendo orientação a objetos com um exemplo simples e real: uma moto com baú que abre e fecha.

---

## 📄 Arquivos desta aula

### 🔧 `Moto.java`
Define uma classe `Moto` com:

- **Atributos**:
  - `cor` → cor da moto
  - `modelo` → modelo da moto
  - `ano` → ano de fabricação
  - `bauaberto` → controla se o baú está aberto (inicia como `false`)

- **Métodos**:
  - `abribau()` → abre o baú, se ainda estiver fechado
  - `fecharbau()` → fecha o baú, se estiver aberto

Ambos os métodos incluem mensagens personalizadas, que refletem o estado atual do baú.

---

### ▶️ `Main.java`
Classe principal que cria uma moto e simula interações com o baú.

Fluxo:
1. Cria uma moto modelo "CG", preta, ano 2015
2. Abre o baú
3. Tenta abrir novamente (mensagem: já está aberto)
4. Fecha o baú
5. Tenta fechar de novo (mensagem: já está fechado)

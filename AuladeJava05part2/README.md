# 🏥 Aula05Part2 – Identificando Cargos do Hospital com Java

> Um programa interativo em Java que identifica o cargo de uma pessoa com base na cor do jaleco informada.

---

## 📄 Arquivos desta aula

### 🧩 `CargosdoHospital.java`
Contém três classes internas representando cargos no hospital:

- `Medico` → retorna `"Médico"`
- `Enfermeiro` → retorna `"Enfermeiro"`
- `Paciente` → retorna `"Paciente"`

Cada classe tem um método `getCargo()` que retorna o nome do cargo.

---

### 👨‍⚕️ `Main.java`
Classe principal que:

1. Pergunta ao usuário qual é a cor do jaleco.
2. Usa `switch-case` para verificar a cor digitada:
   - `branco` → Médico
   - `azul` → Enfermeiro
   - `verde` → Paciente
3. Mostra no terminal o cargo correspondente.
4. Exibe uma mensagem de erro se a cor não for reconhecida.

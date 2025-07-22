public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        if (nome.toLowerCase().contains("a")) {
            System.out.println("Nome inválido (contém a letra 'a').");
            return null;
        }
        return nome;
    }

    // Setter do nome
    public void setNome(String nome) {
        // nome = nome
        this.nome = nome;
    }

    // Getter da idade
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida (não pode ser negativa).");
        }
    }
}



package Aula6part2;
public class Contato {
    private String nome;
    private String telefone;
    private String email;

    //Construtor
    public Contato(String nome, String telefone, String email){
        this.nome=nome;
        this.telefone=telefone;
        this.email=email;
    }

    // Getters e Setters
    public String getNome(){return nome; }
    public void setNome(String nome){this.nome = nome;}

    public String getTelefone(){return telefone;}
    public void setTelefone(String telefone){this.telefone = telefone;}

    public String getEmail(){return email;}
    public void setEmail(String email){this.email = email;}


    public void mostrarResumo() {
        System.out.println("\n[ Contato Cadastrado ]");
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
    }
}





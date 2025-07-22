public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Cláudio");
        p1.setIdade(20);

        Pessoa2 p2 = new Pessoa2();
        p2.setNome("João");
        p2.setIdade(19);
        p2.setCpf("20.567.832-40");
        p2.setRg("32.986.32-70");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());

        System.out.println("Nome: " + p2.getNome());
        System.out.println("Idade: " + p2.getIdade());
        System.out.println("Cpf: " + p2.getCpf());
        System.out.println("Rg: " + p2.getRg());
    }
}

package Aula4;

public class Main {   // Método principal para execução
    public static void main(String[] args) {
        // Criação de um objeto da classe Carro
        Carro meuCarro01 = new Carro();

        // Definindo valores para os atributos
        meuCarro01.cor = "Vermelho";
        meuCarro01.modelo = "Fiat Toronto";
        meuCarro01.ano = 2025;

        // Testando o comportamento dos métodos
        meuCarro01.ligar();    // Deve ligar o carro
        meuCarro01.ligar();    // Deve avisar que já está ligado
        meuCarro01.desligar(); // Deve desligar o carro
        meuCarro01.desligar(); // Deve avisar que já está desligado
    }
}



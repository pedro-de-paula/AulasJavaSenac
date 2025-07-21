package Aula4;

public class Carro {
    // Atributos da classe Carro
    String cor;
    String modelo;
    int ano;
    boolean estaLigado = false; // Por padrão, o carro começa desligado


    // Método para ligar o carro
    void ligar() {
        if (estaLigado) {
            System.out.println("O carro " + modelo + " " + cor + " " + ano + " já está ligado.");
        } else {
            estaLigado = true;
            System.out.println("O carro " + modelo + " " + cor + " " + ano + " foi ligado.");
        }
    }

    // Método para desligar o carro
    void desligar() {
        if (!estaLigado) {
            System.out.println("O carro " + modelo + " " + cor + " " + ano + " já está desligado.");
        } else {
            estaLigado = false;
            System.out.println("O carro " + modelo + " " + cor + " " + ano + " foi desligado.");
        }
    }
}






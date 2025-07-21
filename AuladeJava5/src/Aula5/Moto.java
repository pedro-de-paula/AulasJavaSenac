package Aula5;

public class Moto {
    String cor;
    String modelo;
    int ano;
    boolean bauaberto = false;

    void abribau() {
        if (bauaberto) {
            System.out.println("O baú da moto  " + modelo + " " + cor + " " + ano + " Já está aberto. ");
        } else {
            bauaberto = true;
            System.out.println("O baú da moto  " + modelo + " " + cor + " " + ano + " Foi aberto. ");
        }
    }

    void fecharbau() {
        if (!bauaberto) {
            System.out.println("O baú da moto  " + modelo + " " + cor + " " + ano + " Já está fechado. ");
        } else {
            bauaberto = false;
            System.out.println("O baú da moto  " + modelo + " " + cor + " " + ano + " Foi fechado. ");
        }
    }
}

package Aula7;

public class Carro {
    private String modelo;
    private String marca;
    private double preco;

    public Carro(String marca, String modelo, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " - R$ " + preco;
    }
}


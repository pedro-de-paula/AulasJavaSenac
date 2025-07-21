package Aula3;

public class Matematica {
    public static void main(String[] args) {
        int base = 3;
        int expoente = 5;

        System.out.println("1. Potenciação:");
        System.out.println(base + " elevado à " + expoente + " é: " + Math.pow(base, expoente));

        int negativo = -135;
        System.out.println("\n2. Valor absoluto:");
        System.out.println("O valor absoluto de " + negativo + " é: " + Math.abs(negativo));

        int a = 20, b = 35;
        System.out.println("\n3. Maior valor:");
        System.out.println("O maior entre " + a + " e " + b + " é: " + Math.max(a, b));

        System.out.println("\n4. Menor valor:");
        System.out.println("O menor entre " + a + " e " + b + " é: " + Math.min(a, b));

        double valor = 7.2;
        System.out.println("\n5. Arredondamento:");
        System.out.println("Arredondando " + valor + ": " + Math.round(valor));

        System.out.println("\n6. Número aleatório:");
        double aleatorio = Math.random() * 200;
        System.out.println("Número aleatório entre 0 e 200: " + aleatorio + " ≈ " + String.format("%.3f", aleatorio));
    }
}


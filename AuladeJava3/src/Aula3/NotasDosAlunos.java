//Pedro de Paula Camargo Araújo

// Define o pacote onde esta classe está localizada
package Aula3;

// Declaração da classe pública NotasDosAlunos

public class NotasDosAlunos {

    // Método principal que será executado quando o programa iniciar
    public static void main(String[] args) {

        // Imprime o título principal
        System.out.println("Médias Finais do Curso de Ads:\n");

        // Declaração e inicialização das notas do aluno João
        double a = 7.0;
        double b = 6.5;
        double c = 6.2;
        double d = 6.8;
        double e = 7.1;
        double f = 6.0;

        // Impressão das notas do João
        System.out.println("Notas do João:");
        System.out.println("7.0");
        System.out.println("6.5");
        System.out.println("6.2");
        System.out.println("6.8");
        System.out.println("7.1");
        System.out.println("6.0\n");

        // Cálculo da média das notas do João
        double media = (a + b + c + d + e + f) / 6;

        // Impressão da média do João com 2 casas decimais
        System.out.printf("A média do João é: %.2f\n\n", media);

        // Declaração e inicialização das notas do aluno Cláudio
        double g = 6.0;
        double h = 6.3;
        double i = 6.0;
        double j = 6.2;
        double k = 6.5;
        double l = 6.1;

        // Impressão das notas do Cláudio
        System.out.println("Notas do Cláudio:");
        System.out.println("6.0");
        System.out.println("6.3");
        System.out.println("6.0");
        System.out.println("6.2");
        System.out.println("6.5");
        System.out.println("6.1\n");

        // Cálculo da média das notas do Cláudio
        double media2 = (g + h + i + j + k + l) / 6;

        // Impressão da média do Cláudio com 2 casas decimais
        System.out.printf("A média do Cláudio é: %.2f\n\n", media2);

        // Declaração e inicialização das notas do aluno Henrique
        double m = 5.0;
        double n = 4.5;
        double o = 6.0;
        double p = 5.5;
        double q = 4.8;
        double r = 5.3;

        // Impressão das notas do Henrique
        System.out.println("Notas do Henrique:");
        System.out.println("5.0");
        System.out.println("4.5");
        System.out.println("6.0");
        System.out.println("5.5");
        System.out.println("4.8");
        System.out.println("5.3\n");

        // Cálculo da média das notas do Henrique
        double media3 = (m + n + o + p + q + r) / 6;

        // Impressão da média do Henrique com 2 casas decimais
        System.out.printf("A média do Henrique é: %.2f\n", media3);
    }
}




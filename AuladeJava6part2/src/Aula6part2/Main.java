package Aula6part2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== Nova Entrada de Contato ===");

        // Nome
        System.out.print("Nome: ");
        String nomeDigitado = entrada.nextLine();
        String nome = nomeDigitado.isBlank() ? "Desconhecido" : nomeDigitado;

        // Telefone
        System.out.print("Telefone (apenas números): ");
        String tel = entrada.nextLine();
        String telefone = tel.matches("\\d{10,11}") ? tel : "N/A";
        if (!tel.matches("\\d{10,11}")) {
            System.out.println("Telefone inválido. Será salvo como 'N/A'.");
        }

        // E-mail
        System.out.print("Email: ");
        String emailDigitado = entrada.nextLine();
        String email = (emailDigitado.contains("@") && emailDigitado.contains(".")) ? emailDigitado : "N/A";
        if (!emailDigitado.contains("@") || !emailDigitado.contains(".")) {
            System.out.println("Email inválido. Será salvo como 'N/A'.");
        }

        //Construtor com os dados prontos
        Contato c = new Contato(nome, telefone, email);

        c.mostrarResumo();
        entrada.close();
    }
}


package Aula7;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Carro> carrosDisponiveis = new ArrayList<>();

        carrosDisponiveis.add(new Carro("BMW", "X5", 350000));
        carrosDisponiveis.add(new Carro("Ferrari", "F8", 3200000));
        carrosDisponiveis.add(new Carro("Lamborghini", "Huracan", 3500000));

        Scanner scanner = new Scanner(System.in);
        double totalComprado = 0;

        System.out.println("=== Bem-vindo à Loja de Carros ===");
        System.out.println("Carros disponíveis para compra:");

        for (int i = 0; i < carrosDisponiveis.size(); i++) {
            System.out.println((i + 1) + ". " + carrosDisponiveis.get(i));
        }

        System.out.println("Digite o número do carro que deseja comprar (0 para sair):");

        while (true) {
            int escolha = scanner.nextInt();

            if (escolha == 0) {
                break;  // sair do loop
            }

            if (escolha < 1 || escolha > carrosDisponiveis.size()) {
                System.out.println("Opção inválida. Tente novamente.");
            } else {
                Carro escolhido = carrosDisponiveis.get(escolha - 1);
                totalComprado += escolhido.getPreco();
                System.out.println("Você comprou: " + escolhido);
                System.out.println("Total gasto até agora: R$ " + totalComprado);
                System.out.println("Escolha outro carro ou digite 0 para sair.");
            }
        }

        System.out.println("Obrigado pela compra! Total final: R$ " + totalComprado);
        scanner.close();
    }
}


package Aula5Part2;

//Pedro de Paula Camargo Araújo

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Me diga a cor do seu jaleco para saber seu cargo dentro do hospital: ");
        String cor = scanner.nextLine().toLowerCase();

        switch (cor) {
            case "branco":
                CargosdoHospital.Medico medico = new CargosdoHospital.Medico();
                System.out.println("Seu cargo é: " + medico.getCargo());
                break;
            case "azul":
                CargosdoHospital.Enfermeiro enfermeiro = new CargosdoHospital.Enfermeiro();
                System.out.println("Seu cargo é: " + enfermeiro.getCargo());
                break;
            case "verde":
                CargosdoHospital.Paciente paciente = new CargosdoHospital.Paciente();
                System.out.println("Seu cargo é: " + paciente.getCargo());
                break;
            default:
                System.out.println("Cor de jaleco não reconhecida. Cargo desconhecido.");
        }

        scanner.close();
    }
}

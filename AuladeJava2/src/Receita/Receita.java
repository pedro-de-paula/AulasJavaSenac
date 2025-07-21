package Receita;

import java.util.Scanner; 

public class Receita {

    // Matheus Alves, Pedro Augusto, Pedro de Paula, Rafaela Leite e Sabrina de Sá

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // <- Instancie o Scanner aqui

        System.out.println(" Para fazer uma macarronada servida em um prato ");

        String ingrediente1 = "1/2 Pacote de macarrão";
        String ingrediente2 = "1 pacote de molho de tomate";
        String ingrediente3 = "1 Litro de água";
        String ingrediente4 = "1 fio de óleo";
        String ingrediente5 = "1 colher de sal";
        String ingrediente6 = "1/4 de cebola";
        String ingrediente7 = "1 dente de alho";
        String ingrediente8 = "1 pacote de queijo ralado";

        String utensilio1 = "Fogão";
        String utensilio2 = "Panela";
        String utensilio3 = "Concha";
        String utensilio4 = "Escorredor";
        String utensilio5 = "Faca";
        String utensilio6 = "Prato";

        System.out.println("Início : ");
        System.out.println("1 - Pegar " + utensilio1);
        System.out.println("2 - Colocar " + ingrediente3 + " na " + utensilio2);
        System.out.println("3 - Adicionar um " + ingrediente4 + " na " + utensilio2);
        System.out.println("4 - Adicionar uma " + ingrediente5 + " na " + utensilio2);
        System.out.println("5 - Ligar o " + utensilio1);
        System.out.println("6 - Colocar a " + utensilio2 + " no " + utensilio1 + " até ferver a água ");
        System.out.println("7 - Cortar a cebola em uma parte de " + ingrediente6 + " com a " + utensilio5);
        System.out.println("8 - Cortar o alho na medida de um " + ingrediente7 + " com a " + utensilio5);
        System.out.println("9 - Adicionar o macarrão com a parte de um " + ingrediente1 + " na " + utensilio2);
        System.out.println("10 - Aguardar o cozimento do macarrão ");
        System.out.println("11 - Desligar o " + utensilio1);
        System.out.println("12 - Escorrer o macarrão ");
        System.out.println("13 - Colocar o macarrão no " + utensilio6);
        System.out.println("14 - Ligar novamente o " + utensilio1);
        System.out.println("15 - Colocar a " + utensilio2 + " no " + utensilio1);
        System.out.println("16 - Adicionar um " + ingrediente4 + " na " + utensilio2);
        System.out.println("17 - Refogar a cebola na " + utensilio2);
        System.out.println("18 - Refogar o alho na " + utensilio2);
        System.out.println("19 - Adicionar o " + ingrediente1 + " na " + utensilio2);
        System.out.println("20 - Esperar ferver o molho ");
        System.out.println("21 - Desligar o " + utensilio1);
        System.out.println("22 - Adicionar uma " + utensilio3 + " do molho no " + utensilio6 + " de macarrão ");

        System.out.println("\nQuer queijo ralado? ");
        String queijo = scanner.nextLine();

        if (queijo.equalsIgnoreCase("sim")) {
            System.out.println("Pegar " + ingrediente8);
            System.out.println("Abrir " + ingrediente8 + " com a " + utensilio5);
            System.out.println("Despejar " + ingrediente8);
        } else {
            System.out.println("Não adicionar " + ingrediente8);
        }


    }
}

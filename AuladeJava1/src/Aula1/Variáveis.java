package Aula1;

public class Variáveis {  public static void main(String[] args) {
    double preco = 19.99;
    boolean isJavaFun = true;
    String saudacao = " Olá, Progamador ";
    char primeiraletra = 'J';
    String nome = " Pedro ";
    int idade = 19;

    //sout
    System.out.println(idade);
    // Imprimindo os valores da variáveis
    System.out.println(" idade " + idade);
    System.out.println(" Preço " + preco);
    System.out.println(" Java é divertido " + isJavaFun);
    System.out.println(" Primeira letra " + primeiraletra);
    System.out.println(" Saudação " + saudacao);
    System.out.println(" Meu nome é" + nome + "e tenho " + idade + " anos!");

    //Modificando uma variável
    idade = 20;
    System.out.println(" Nova idade " + idade);
      }
}

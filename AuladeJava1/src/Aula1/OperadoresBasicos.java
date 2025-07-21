package Aula1;

public class OperadoresBasicos { public static void main (String[] args) {
    int a = 10;
    int b = 5;
    //sout
    //Aritiméticos
    System.out.println("a + b = " + (a+b)); // 15
    System.out.println("a - b = " + (a-b)); // 5
    System.out.println("a * b = " + (a*b)); // 50
    System.out.println("a / b = " + (a/b)); // 2
    System.out.println("a % b = " + (a%b)); // 0

    //Comparação
    System.out.println("a > b? " + (a>b)); // true
    System.out.println("a == b? " + (a==b)); // false

    //Lógicas
    boolean condicao1 = (a>0); // true
    boolean condicao2 = (a<1); // false
    System.out.println("condição1 && condição2 " + (condicao1 && condicao2));
    System.out.println("condição1 || condição2 " + (condicao1 || condicao2));
    System.out.println("condição1: " + (condicao1)); //false
      }
}

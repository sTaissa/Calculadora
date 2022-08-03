package Calculations;

import java.util.Scanner;

public class Calculator {
    
    private Scanner scan = new Scanner(System.in);

    public void soma() {

        System.out.println("Digite o primeiro número:");
        int n1 = scan.nextInt();
        System.out.println("Digite o segundo número:");
        int n2 = scan.nextInt();

        System.out.println("O resultado da soma é: " + (n1 + n2));
        System.out.println();
    
    }

    public void subtracao() {

      System.out.println("Digite o primeiro número:");
      int n1 = scan.nextInt();
      System.out.println("Digite o segundo número:");
      int n2 = scan.nextInt();

      System.out.println("O resultado da subtração é: " + (n1 - n2));
      System.out.println();

    }

    public void multiplicacao() {

      System.out.println("Digite o primeiro número:");
      int n1 = scan.nextInt();
      System.out.println("Digite o segundo número:");
      int n2 = scan.nextInt();

      System.out.println("O resultado da multiplicação é: " + (n1 * n2));
      System.out.println();

    }

    public void divisao() {

      System.out.println("Digite o primeiro número:");
      int n1 = scan.nextInt();
      System.out.println("Digite o segundo número:");
      int n2 = scan.nextInt();

      System.out.println("O resultado da divisão é: " + (n1 / n2));
      System.out.println();

    }

    public void quadrado() {

      System.out.println("Digite o número:");
      int n = scan.nextInt();

      System.out.println("O quadrado do número é: " + (n * n));
      System.out.println();

    }
}

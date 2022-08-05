package Calculadora;

import java.util.Scanner;

//classe para fazer os cálculos da calculadora
public class Calculadora {
    
    private Scanner scan = new Scanner(System.in);

    //soma os números até que seja digitado 0 e apresenta o resultado
    public void soma() {
        int num, soma = 0;

        System.out.println("Digite os números para somar ou 0 para concluir a conta:");

        do {
          num = scan.nextInt();
          soma += num;
        } while(num != 0);

        System.out.println("O resultado da soma é: " + soma);
        System.out.println();
    }

    //subtrai os números até que seja digitado 0 e apresenta o resultado
    public void subtracao() {
        System.out.println("Digite os números para subtrair ou 0 para concluir a conta:");
        int num = scan.nextInt();
        int sub = num;
        
        while(num != 0) {
          num = scan.nextInt();
          sub -= num;
        }

        System.out.println("O resultado da subtração é: " + sub);
        System.out.println();
    }

    //multiplica os números até que seja digitado 1 e apresenta o resultado
    public void multiplicacao() {
        int mult = 0;

        System.out.println("Digite os números para multiplicar ou 1 para concluir a conta:");
        int num = scan.nextInt();
        
        while(num != 0) {
          mult *= num;
          num = scan.nextInt();
        }

        System.out.println("O resultado da multiplicação é: " + mult);
        System.out.println();
    }

    //divide os números até que seja digitado 0 e apresenta o resultado
    public void divisao() {
        System.out.println("Digite os números para dividir ou 0 para concluir a conta:");
        int num = scan.nextInt();
        int div = num;
        
        while(num != 0) {
          num = scan.nextInt();
          if(num == 0 ){
              break;
          }
          div /= num;
        }

        System.out.println("O resultado da divisão é: " + div);
        System.out.println();
    }

    //pede um número e mostra o seu quadrado
    public void quadrado() {
      System.out.println("Digite o número:");
      int n = scan.nextInt();

      System.out.println("O quadrado do número é: " + (n * n));
      System.out.println();
    }
}

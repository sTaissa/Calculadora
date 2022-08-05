package Calculadora;

import java.util.Scanner;

//classe para fazer os cálculos da calculadora
public class Calculadora {
    
    private Scanner scan = new Scanner(System.in);

    //soma os números até que seja digitado 0 e apresenta o resultado
    public void soma() {
        float num, soma = 0;

        System.out.println("Digite os números para somar ou 0 para concluir a conta:");

        do {
          num = scan.nextFloat();
          soma += num;
        } while(num != 0);

        System.out.printf("O resultado da soma é: %.2f", soma);
        System.out.println();
    }

    //subtrai os números até que seja digitado 0 e apresenta o resultado
    public void subtracao() {
        System.out.println("Digite os números para subtrair ou 0 para concluir a conta:");
        float num = scan.nextFloat();
        float sub = num;
        
        while(num != 0) {
          num = scan.nextFloat();
          sub -= num;
        }

        System.out.printf("O resultado da subtração é: %.2f", sub);
        System.out.println();
    }

    //multiplica os números até que seja digitado 1 e apresenta o resultado
    public void multiplicacao() {
        float mult = 1;

        System.out.println("Digite os números para multiplicar ou 1 para concluir a conta:");
        float num = scan.nextFloat();
        
        while(num != 0) {
          mult *= num;
          num = scan.nextFloat();
        }

        System.out.printf("O resultado da multiplicação é: %.2f", mult);
        System.out.println();
    }

    //divide os números até que seja digitado 0 e apresenta o resultado
    public void divisao() {
        System.out.println("Digite os números para dividir ou 0 para concluir a conta:");
        float num = scan.nextFloat();
        float div = num;
        
        while(num != 0) {
          num = scan.nextFloat();
          if(num == 0 ){
              break;
          }
          div /= num;
        }

        System.out.printf("O resultado da divisão é: %.2f\n", div);
        System.out.println();
    }

    //pede um número e mostra o seu quadrado
    public void quadrado() {
      System.out.println("Digite o número:");
      float n = scan.nextFloat();

      System.out.printf("O quadrado do número é: %.2f\n", (n * n));
      System.out.println();
    }
}

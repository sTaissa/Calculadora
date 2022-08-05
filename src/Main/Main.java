package Main;

import java.util.Scanner;
import Calculadora.Calculadora;

public class Main {
    
    public static void main(String[] args) {

    Calculadora calc = new Calculadora();
    Scanner scan = new Scanner(System.in);
    int n;

    do {
        System.out.println("Escolha uma opção:");
        System.out.println("[0] Sair\n[1] Soma\n[2] Subtração\n[3] Multiplicação\n[4] Divisão\n[5] Quadrado do número\n");
        System.out.print("Digite a opção desejada: ");
        n = scan.nextInt();
        System.out.println();

        switch (n) {
          case 0:
            break;
          case 1:
            calc.soma();
            break;
          case 2:
            calc.subtracao();
            break;
          case 3:
            calc.multiplicacao();
            break;
          case 4:
            calc.divisao();
            break;
          case 5:
            calc.quadrado();
            break;
          default:
            System.out.println("Número inválido\n");
        }
      } while (n != 0);
    }
}

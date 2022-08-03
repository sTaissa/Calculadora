package Main;

import java.util.Scanner;
import Calculations.Calculator;

public class Main {
    
    public static void main(String[] args) {

    Calculator calc = new Calculator();
    Scanner scan = new Scanner(System.in);
    int n;

    do {
      System.out.println("0 - Sair");
      System.out.println("1 - Soma");
      System.out.println("2 - Subtração");
      System.out.println("3 - Multiplicação");
      System.out.println("4 - Divisão");
      System.out.println("5 - Quadrado do número");
      System.out.println("Digite a opção desejada:");
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

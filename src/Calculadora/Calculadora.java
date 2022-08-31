package Calculadora;

import java.util.Scanner;

//classe para fazer os cálculos da calculadora
public class Calculadora {
    
    private Scanner scan = new Scanner(System.in);

    //soma os números até que seja digitado '=' e apresenta o resultado
    public void soma() {
        float num, total = 0;
        String op;

        System.out.println("Digite o número para somar ou = para concluir a conta:");

        do {
          op = scan.nextLine();
          
          if(!op.equals("=")){
              num = Float.parseFloat(op);
              total += num;
          } else{
              break;
          }
        } while(!op.equals("="));

        System.out.printf("%.2f\n", total);
        System.out.println();
    }

    //subtrai os números até que seja digitado '=' e apresenta o resultado
    public void subtracao() {
        float num, total = 0;
        
        System.out.println("Digite os números para subtrair ou = para concluir a conta:");
        String op = scan.nextLine();
        
        if(!op.equals("=")){
            num = Float.parseFloat(op);
            total = num;
        }
        
        while(!op.equals("=")) {
            op = scan.nextLine();
          
            if(!op.equals("=")){
                num = Float.parseFloat(op);
                total -= num;
            } else{
                break;
            }
        }

        System.out.printf("%.2f\n", total);
        System.out.println();
    }

    //multiplica os números até que seja digitado '=' e apresenta o resultado
    public void multiplicacao() {
        float num, total = 1;
        String op;

        System.out.println("Digite os números para multiplicar ou = para concluir a conta:");
        
        do {
          op = scan.nextLine();
          
          if(!op.equals("=")){
              num = Float.parseFloat(op);
              total *= num;
          } else{
              break;
          }
        } while(!op.equals("="));

        System.out.printf("%.2f\n", total);
        System.out.println();
    }

    //divide os números até que seja digitado '=' e apresenta o resultado
    public void divisao() {
        float num, total = 0;
        
        System.out.println("Digite os números para dividir ou = para concluir a conta:");
        String op = scan.nextLine();
        
        if(!op.equals("=")){
            num = Float.parseFloat(op);
            total = num;
        }
        
        while(!op.equals("=")) {
            op = scan.nextLine();
          
            if(!op.equals("=")){
                num = Float.parseFloat(op);
                total /= num;
            } else{
                break;
            }
        }

        System.out.printf("%.2f\n", total);
        System.out.println();
    }

    //pede um número e mostra o seu quadrado
    public void quadrado() {
      System.out.println("Digite o número:");
      //string pois de forma direta dava divergência nos formatos, só aceitava decimal com ','
      //dessa forma aceita com '.' igual a todos os outros métodos
      String n = scan.nextLine();
      float num = Float.parseFloat(n);
      
      System.out.printf("O quadrado do número é: %.2f\n", (num * num));
      System.out.println();
    }
}

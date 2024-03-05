/*
      João recebeu seu salário e precisa pagar 2 contas atrasadas. Em razão do atraso, ele deverá pagar multa de 
      2% sobre cada conta. Faça um programa que receba o salário do João e o valor de cada conta, calcule e 
      mostre quanto restará de salário após o pagamento das duas contas.
*/

import java.util.Scanner;
public class Exercicio8{
   public static void main (String []args){
      Scanner scanner = new Scanner (System.in);
      
      int salario, conta1, conta2, valorConta, multa, salNovo;
      
      System.out.print("Digite o valor do salario: ");
      salario = scanner.nextInt();
      
      System.out.print("Digite o valor da primeira conta: ");
      conta1 = scanner.nextInt();
      
      System.out.print("Digite o valor da segunda conta: ");
      conta2 = scanner.nextInt();
      
      valorConta = conta1 + conta2;
      
      multa = valorConta*2/100;
      
      salNovo = salario - conta1 - conta2 - multa;
      
      System.out.println("O restante do salario e de: " + salNovo);
      
      scanner.close();
      
   }
}
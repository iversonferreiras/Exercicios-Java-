/*
      Funcionários da IFVende tem como benefício a receber ao final de cada mês um salário fixo mais 4% de 
      comissão sobre as vendas realizadas pelo mesmo. Assim, faça um algoritmo que receba o salário fixo e o 
      valor de vendas realizadas por um funcionário, calcule e mostre o benefício a ser recebido pelo mesmo.
*/

import java.util.Scanner;
public class Exercicio6{
   public static void main (String []args){
      Scanner scanner = new Scanner (System.in);
      
      int salario, vendas, beneficio, novoSal;
      
      System.out.print("Digite o salario do funcionario: ");
      salario = scanner.nextInt();
      
      System.out.print("Digite o valor das vendas realizadas: ");
      vendas = scanner.nextInt();
      
      beneficio = (vendas*4)/100;
      
      novoSal = salario + beneficio;
      
      System.out.println("O salario do funcionario e de: " + salario + " e o beneficio e de: " + beneficio + " O valor a receber e de: " + novoSal);
      
      scanner.close();
   }
}

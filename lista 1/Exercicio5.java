/* 
      Faça um programa que receba o salário base de um funcionário, calcule e mostre o salário a receber, 
      sabendo que esse funcionário possui uma gratificação de 10% sobre o salário base e paga 5% de imposto 
      sobre o valor acumulado (salário base + gratificação)
*/

import java.util.Scanner;
public class Exercicio5{
   public static void main (String []args){
      Scanner scanner = new Scanner (System.in);
      
      int salB, grat, salR, imp;
      
      System.out.print("Digite o salario base do funcionario:");
      salB = scanner.nextInt();
      
      grat = salB + (salB*10/100);
      
      imp = grat*5/100;
      
      salR = grat - imp;
      
      
      System.out.println(" O salario a receber e de: " + salR);
      
      scanner.close();
   
   }
}
   
   
   
   
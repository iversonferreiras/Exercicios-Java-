/*
      Crie um algoritmo que calcule a soma e a média de 3 números informados pelo usuário.
*/

import java.util.Scanner;
public class Exercicio1{
   public static void main (String []args){
      Scanner scanner = new Scanner(System.in);

         int num1, num2, num3, soma, media;
               
         System.out.print("Escreva o primeiro numero: ");
         num1 = scanner.nextInt();
         
         System.out.print("Digite o segundo numero: ");
         num2 = scanner.nextInt();
         
         System.out.print("Digite o terceiro numero: ");
         num3 = scanner.nextInt();
         
         soma = num1 + num2 + num3;
         media = soma/3;
         
         System.out.print("A soma dos numeros e: " + soma + " e a media e: " +media);
         
         scanner.close();
   }
}

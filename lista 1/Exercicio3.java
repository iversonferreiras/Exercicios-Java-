/*
      Implemente um algoritmo que receba 3 números reais de entrada. Calcule e mostre o resultado da 
      multiplicação dos dois primeiros números dividido pelo terceiro número fornecido pelo usuário. Sabe-se 
      que o denominador não pode ser zero, mas neste momento não se preocupe com as validações.
*/

import java.util.Scanner;
public class Exercicio3{
   public static void main (String []args){
      Scanner scanner = new Scanner (System.in);
      
      int num1, num2, num3, multiplicacao, divisao;
      
      System.out.print("Digite o primeiro numero: ");
      num1 = scanner.nextInt();
      
      System.out.print("Digite o segundo numero: ");
      num2 = scanner.nextInt();
      
      System.out.print("Digite o terceiro numero: ");
      num3 = scanner.nextInt();
      
      multiplicacao = num1 * num2;
      divisao = multiplicacao / num3;
      
      System.out.println("A multiplicacao dos dois primeiros numeros e: " + multiplicacao + 
      " e a divisao do resultado da multiplicacao dividido pelo terceiro numero e: " + divisao);
      
      scanner.close();
      
   }
}

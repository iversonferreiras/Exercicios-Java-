/*
      Ler um número inteiro e imprimir o seu sucessor e seu antecessor
*/

import java.util.Scanner;
public class Exercicio2{
   public static void main (String []args){
      Scanner scanner = new Scanner(System.in);
      
      int num, antecessor, sucessor;
      
      System.out.print("Digite um numero inteiro: ");
      num = scanner.nextInt();
      
      antecessor = num - 1;
      sucessor = num + 1;
      
      System.out.println("O antecessor do numero " + num + " e: " + antecessor + " e o sucessor e: " + sucessor);
      
      scanner.close();
      
   }
}

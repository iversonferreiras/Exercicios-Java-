/* 
      Faça um algoritmo que receba 3 notas e seus respectivos pesos, calcule e mostre a media ponderada dessas 
      notas.
*/

import java.util.Scanner;
public class Exercicio4{
   public static void main (String []args){
      Scanner scanner = new Scanner (System.in);
   
      int nota1, nota2, nota3, p1, p2, p3, mediap;
      System.out.print("Digite a primeira nota: ");
      nota1 = scanner.nextInt();
      
      System.out.print("Digite o peso da primeira nota: ");
      p1 = scanner.nextInt();
      
      System.out.print("Digite a segunda nota: ");
      nota2 = scanner.nextInt();
      
      System.out.print("Digite o peso da segunda nota: ");
      p2 = scanner.nextInt();

      System.out.print("Digite a terceira nota: ");
      nota3 = scanner.nextInt();
      
      System.out.print("Digite o peso da terceira nota: ");
      p3 = scanner.nextInt();
      
      mediap = ((nota1 * p1) + (nota2 * p2) + (nota3 * p3)) / (p1 + p2 + p3);
      
      System.out.println("A media ponderada das tres notas e: " + mediap);
      
      scanner.close();
      
   }
}

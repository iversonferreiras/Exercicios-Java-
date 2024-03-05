/*
      A copa do mundo de futebol da FIFA é uma competição internacional que iniciou em 1930, acontecendo 
      desde então de 4 em 4 anos, exceto durante o período das guerras mundiais que impossibilitaram a 
      realização 2 copas mundiais. Sabendo dessas informações, faça um algoritmo em JAVA que dado o ano 
      atual calcule o número de copas já realizadas e exiba o resultado ao usuário.
*/

import java.util.Scanner;
public class Exercicio9{
   public static void main (String []args){
      Scanner scanner = new Scanner (System.in);
         int anoAtual, copasR;
         
         System.out.print("digite o ano atual: ");
         anoAtual = scanner.nextInt();
         
         copasR = (anoAtual-1930)/4-2;
         
         System.out.println("O numero de copas realizadas e de: " + copasR);
         
         scanner.close();
         
   }
}
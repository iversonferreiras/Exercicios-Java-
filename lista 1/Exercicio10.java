/*
      Sabe-se que, para iluminar corretamente os cômodos de uma casa, para cada m², deve-se usar 18 W de 
      potência. Faça um programa que receba as dimensões de um cômodo retangular (em metros), calcule e 
      mostre a área de mesmo (em m²) e a potência de iluminação necessária para iluminar corretamente o 
      cômodo
*/

import java.util.Scanner;
public class Exercicio10{
   public static void main (String []args){
      Scanner scanner = new Scanner(System.in);
      
      int comprimento, largura,mQuadrados, luz;
      System.out.print("Digite a comprimento do comodo: ");
      comprimento = scanner.nextInt();
      
      System.out.print("Digite a largura do comodo: ");
      largura = scanner.nextInt();
      
      mQuadrados = comprimento * largura;
      
      luz = mQuadrados * 18;
      
      System.out.println("A quantidade de potencia necessaria para iluminar o comodo e de " + luz + " watts");
      
      scanner.close();
   }
}
/*
      Chico é dono de um terreno na cidade de Belo Horizonte e deseja saber qual seria o preço médio de venda 
      desse terreno. Conforme visto na planta do mesmo, nota-se que o lote possui um formato de trapézio. Assim sendo, 
      dados os valores das medidas da base maior, base menor e da altura do terreno (em metros), e 
      sabendo o valor médio (R$) pago por metro quadrado no local onde se encontra o lote, calcule e mostre a área 
      total e o valor médio de venda (R$) que Zé Borba Gato pode pedir pelo terreno.
*/

import java.util.Scanner;
public class Exercicio7{
   public static void main (String []args){
      Scanner scanner = new Scanner (System.in);
      
      int bMaior, bMenor, altura, valorLote, valorPagar;
      
      System.out.print("Digite os metros da base maior do lote: ");
      bMaior = scanner.nextInt();
      
      System.out.print("Digite os metros da base menor do lote: ");
      bMenor = scanner.nextInt();
      
      System.out.print("Digite os metros da altura do lote: ");
      altura = scanner.nextInt();
      
      System.out.print("Digite o valor do metro quadrado: ");
      valorLote = scanner.nextInt();
      
      valorPagar = (bMaior*bMenor*altura) * valorLote;
      
      System.out.println("O valor a ser pago pelo lote e de: " + valorPagar);
      
      scanner.close();
      
   }
}

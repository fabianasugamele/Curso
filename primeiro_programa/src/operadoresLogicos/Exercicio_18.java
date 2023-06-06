package operadoresLogicos;

import java.util.Scanner;

public class Exercicio_18 {
  /*  18) Faça um algoritmo para ler: o nome do produto, a quantidade
    adquirida e o preço unitário. Em seguida, ele deverá calcular e
    escrever o total (total = quantidade adquirida * preço unitário), o
    desconto e o total a pagar (total a pagar = total - desconto),
    sabendo-se que:
            • Se quantidade <= 5 o desconto será de 2%;
• Se quantidade > 5 e quantidade <=10 o desconto será de 3%;
• Se quantidade > 10 o desconto será de 5%/*
   */
     public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         String nomeProduto;
         double precoUnitario,vaLorComDesconto=0,
                 valorSemDesconto=0,percentualDesconto,
                 qtdProduto;
         System.out.println("Qual o produto? ");
         nomeProduto = teclado.next();
         System.out.println("Preco do produto: ");
         precoUnitario = teclado.nextDouble();
         System.out.println("Quantos você vai levar? ");
         qtdProduto = teclado.nextDouble();

         if (qtdProduto>0 &&qtdProduto<=5){
          percentualDesconto = 0.02;
          valorSemDesconto = qtdProduto*precoUnitario;
          vaLorComDesconto = valorSemDesconto-(valorSemDesconto*percentualDesconto);
         } else if (qtdProduto>5 && qtdProduto<=10) {
             percentualDesconto = 0.03;
             valorSemDesconto = qtdProduto*precoUnitario;
             vaLorComDesconto = valorSemDesconto-(valorSemDesconto*percentualDesconto);
         }else {
             percentualDesconto = 0.05;
             valorSemDesconto = qtdProduto*precoUnitario;
             vaLorComDesconto = valorSemDesconto-(valorSemDesconto*percentualDesconto);
         }
         System.out.println("Produto: "+nomeProduto);
         System.out.println("Quantidade "+qtdProduto);
         System.out.println("Preço sem desconto "+valorSemDesconto);
         System.out.println("Preço a pagar com desconto "+vaLorComDesconto);

  }
}

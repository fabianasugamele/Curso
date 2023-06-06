package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio_17 {
 /*   17) Faça um programa que receba o valor de um carro e mostre
    uma tabela com os seguintes dados: preço final, quantidade de
    parcelas e valor da parcela. Considere o seguinte:
    O preço final para compra à vista tem um desconto de 20%;
    A quantidades de parcelas pode ser: 12, 24, 36, 48, e 60;
    Os percentuais de acréscimo seguem a tabela a seguir:
    Quantidade de
    parcelas
    Percentual sobre preço
    final
        12 6%
        24 12%
        36 18%
        48 24%
        60 30%
  */
           public static void main(String[] args) {
               Scanner teclaSdo = new Scanner(System.in);
               double valorCarro;
               double precoFinal = 0;
               int qtdePacelas;
               double valorParcela = 0;
               double percentualAcrescimo;
               double valorDesconto =0.20;

               System.out.println("Qual valor do carro");
               valorCarro = teclaSdo.nextDouble();
               System.out.println("Em quantas vezes");
               qtdePacelas = teclaSdo.nextInt();

               if (qtdePacelas > 1 && qtdePacelas < 24) {
                   percentualAcrescimo = 0.06;
                   precoFinal = valorCarro + (valorCarro * percentualAcrescimo);
                   valorParcela = precoFinal / qtdePacelas;
               } else if (qtdePacelas >= 24 && qtdePacelas < 36) {
                   percentualAcrescimo = 0.12;
                   precoFinal = valorCarro + (valorCarro * percentualAcrescimo);
                   valorParcela = precoFinal / qtdePacelas;
               } else if (qtdePacelas >= 36 && qtdePacelas < 48) {
                   percentualAcrescimo = 0.18;
                   precoFinal = valorCarro + (valorCarro * percentualAcrescimo);
                   valorParcela = precoFinal / qtdePacelas;

               } else if (qtdePacelas >= 48 && qtdePacelas < 60) {
                   percentualAcrescimo = 0.24;
                   precoFinal = valorCarro + (valorCarro * percentualAcrescimo);
                   valorParcela = precoFinal / qtdePacelas;

               }else if (qtdePacelas>=60){
                   percentualAcrescimo = 0.30;
                   precoFinal = valorCarro + (valorCarro * percentualAcrescimo);
                   valorParcela = precoFinal / qtdePacelas;

               }else {
                   precoFinal =valorCarro- (valorCarro * valorDesconto);
                   valorParcela = precoFinal / qtdePacelas;
               }
               System.out.println("Preço Final " + precoFinal);
               System.out.println("Parcelas: " + qtdePacelas);
               System.out.println("Valor das Parcelas: " + Math.ceil(valorParcela));
           }

        }


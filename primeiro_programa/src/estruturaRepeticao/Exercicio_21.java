package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio_21 {
/* 21) Faça um programa que verifique e mostre os números entre
1.000 e 1200 que, quando divididos por 11 produzam resto igual a
2
 */
        public static void main(String[] args) {
            int  inicio =1000, fim=1200;

            while (inicio<=fim){
               int resultado = inicio++;
               if (resultado%11 ==2){
                   System.out.println(resultado);
               }


            }

        }
}

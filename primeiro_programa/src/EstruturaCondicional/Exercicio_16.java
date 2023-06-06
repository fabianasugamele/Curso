package EstruturaCondicional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Exercicio_16 {
 /*   16) Faça um programa que leia três valores (A, B, C)
        e mostre-os na ordem lida. Em seguida, mostre-os
         em ordem crescente e  decrescente
  */
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            Integer[] lista = new Integer[3];
            Integer i;
            for (i =0;i<lista.length;i++){
                System.out.println("Digite um numero "+ i);
                lista[i] = teclado.nextInt();
            }
            System.out.println(Arrays.toString(lista));
            Arrays.sort(lista);
            System.out.println(Arrays.toString(lista));
            Arrays.sort(lista, Comparator.reverseOrder());
            System.out.println(Arrays.toString(lista));

 }
}

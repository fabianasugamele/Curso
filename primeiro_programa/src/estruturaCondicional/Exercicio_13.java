package estruturaCondicional;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_13 {
   /* 13) Leia 6 valores (considere que não serão
   informados valores iguais)
    e escreva-os em ordem crescente
    */
   public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int [] lista = new int[6];
       int i;
      for ( i =0; i<lista.length;i++){
          System.out.println("Digite um numero ");
          lista[i] = teclado.nextInt();

       }
       teclado.close();
        System.out.println(Arrays.toString(lista));
        Arrays.sort(lista);
         System.out.println(Arrays.toString(lista));
   }
}

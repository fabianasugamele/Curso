package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio_20 {

 /*20) Faça um programa que receba um número e, usando laços de
    repetição, calcule e mostre a tabuada desse número.
  */
 public static void main(String[] args) {
     Scanner teclado= new Scanner(System.in);
     int numero=0; int contador=0, tabuadaFinal =10;
     int resultado;
     System.out.println("Qual a tabuada você quer?: ");
     numero = teclado.nextInt();
     for (contador =0; contador<=tabuadaFinal;contador++){
         resultado = numero * contador;
         System.out.println(contador+"*"+numero+"="+resultado);
     }




 }
}

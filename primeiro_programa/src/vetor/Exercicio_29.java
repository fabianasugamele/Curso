package vetor;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_29 {
    /*29) Escreva um algoritmo que permita a leitura dos nomes de 10
    pessoas e armazene os nomes lidos em um vetor. Após isto, o
    algoritmo deve permitir a leitura de mais 1 nome qualquer de
    pessoa e depois escrever a mensagem ACHEI se o nome estiver
    entre os 10 nomes lidos anteriormente (guardados no vetor), ou
    NÃO ACHEI caso contrário.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nome = new String[3];
        String testaNome;
        for (int i = 0; i < nome.length; i++) {
            System.out.println("Digite o nome " + i);
            nome[i] = teclado.next();
            Arrays.toString(nome);
            if (i == nome.length) {
                System.out.println("Digite outro nome ");
                testaNome = teclado.next();
                if (testaNome.equals(Arrays.toString(nome))) ;
                {
                    System.out.println("Achei");

                }
                System.out.println("Não achei");
            }


        }
    }
    //Arrays.toString(nome);
    // System.out.println(nome);
    //System.out.println("Digite outro nome ");
    // testaNome = teclado.next();
           /* if (testaNome.equals(nome)){
                System.out.println("Achei");
            }else {


            */


}






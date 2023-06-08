package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio_25 {
    /*
       25) Leia o número de alunos existentes em uma turma e, após isto,
       leia as notas destes alunos, calcule e escreva a média aritmética
       dessas notas lidas.

     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int qtdAlunos;
        double media=0, notas=0;
        double somaNotas=0;
        double incremento;
        System.out.println("Quantos alunos tem a sala");
        qtdAlunos = teclado.nextInt();

        for (incremento = 0; incremento < qtdAlunos; incremento++) {
            System.out.println("Digita a nota ");
            notas = teclado.nextDouble();
            notas = notas;
            somaNotas += notas;

            //System.out.println(incremento);
            //System.out.println(notas);
           // System.out.println(somaNotas);

        }
        media = Math.round(somaNotas / qtdAlunos);
        System.out.println(media);

    }




}


package estruturaCondicional;

import java.util.Scanner;

public class Exercicio_14 {
/*14) Leia 3 valores (A, B e C) representando as medidas dos
    lados de um triângulo e escrever se formam ou não um triângulo.
    OBS: para formar um triângulo, o valor de cada lado deve ser
    menor que a soma dos outros 2 lados.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ladoA,ladoB,ladoC;
        int resultado;
        System.out.println("Digite o lado A");
        ladoA = teclado.nextInt();
        System.out.println("Digite o Lado B");
        ladoB = teclado.nextInt();
        System.out.println("Digite o Lado C");
        ladoC = teclado.nextInt();

        if ((ladoA + ladoB) > ladoC && ((ladoB+ladoC)>ladoA)
                &&((ladoA+ladoC)>ladoB)){
            System.out.println("Não é triangulo");
        }else {
            System.out.println("Forma um triangulo");
        }


    }


}

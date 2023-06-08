package estruturaRepeticao;

import java.util.Scanner;

public class testaRestoDivisao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero ");
        numero = teclado.nextInt();
        if (numero%11==2){

            System.out.println("verdadeiro");
        }else {
            System.out.println("Falso");
        }

    }
}

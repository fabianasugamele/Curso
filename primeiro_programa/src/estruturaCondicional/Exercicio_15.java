package estruturaCondicional;

import java.util.Scanner;

public class Exercicio_15 {
/*15) Leia dois valores e imprimir uma das três mensagens a
    seguir:
            • ‘Números iguais’,  caso os números sejam iguais;
• ‘Primeiro é maior’, caso o primeiro seja maior que o segundo;
• ‘Segundo maior’, caso o segundo seja maior que o primeiro.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1,  numero2;
        int resultado=0;
        System.out.println("Digite um numero ");
        numero1 = teclado.nextInt();
        System.out.println("Digite outro numero ");
        numero2 = teclado.nextInt();

        if (numero1==numero2){
            System.out.println("Numeros iguais");
        } else if (numero1>numero2) {
            System.out.println("Numero 1 é maior");
        }else {
            System.out.println("Numero 2 é maior");
        }

    }
}

package estruturaRepeticao;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Exercicio_26 {
    /*26) Escreva um algoritmo para ler 10 números e ao final da leitura
escrever a soma total dos 10 números lidos.
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroDigitado=0,soma=0,fim = 10;

        for (int i = 1;i<=fim;i++){
            System.out.println("Digite o numero "+i);
            numeroDigitado = teclado.nextInt();
            numeroDigitado = numeroDigitado;
            soma += numeroDigitado;
        }

        System.out.println("a somo foi de "+soma);

    }
}

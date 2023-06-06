package EstruturaCondicional;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int primeiroNumero, segundoNumero,terceiroNumero,soma;
        System.out.println("Digite o primeiro numero ");
        primeiroNumero = teclado.nextInt();
        System.out.println("Digite o segundo numero ");
        segundoNumero = teclado.nextInt();
        System.out.println("Digite o terceiro numero ");
        terceiroNumero = teclado.nextInt();

        if (primeiroNumero > segundoNumero && segundoNumero < terceiroNumero) {
            soma= primeiroNumero+terceiroNumero;
            System.out.println(soma);

        }else if(terceiroNumero>primeiroNumero){
            soma = segundoNumero+terceiroNumero;
            System.out.println(soma);
        }else {
            soma = primeiroNumero+segundoNumero;
            System.out.println(soma);

        }


    }
}

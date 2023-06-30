package variaveisSimples;

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String nome, sobrenome;

        System.out.println("Digite seu nome ");
        nome = teclado.nextLine();
        System.out.println("Digite seu sobrenome");
        sobrenome = teclado.nextLine();
        System.out.println("Seja bem vindo "+nome+" "+sobrenome);

    }
}

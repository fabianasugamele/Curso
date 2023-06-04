package OperadoresRelacionais;

import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero ");
        numero = teclado.nextInt();
        if(numero>10){
            System.out.println("É Mais que  10");
        }else {
            System.out.println("Não é mais que  10");
        }


    }
}

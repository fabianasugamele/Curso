package OperadoresRelacionais;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int quantidadeLaranja;
        double  resultado;
        System.out.println("Quantas laranjas você quer? ");
        quantidadeLaranja = teclado.nextInt();

        if (quantidadeLaranja<15){
            resultado = (quantidadeLaranja * 1.30);
            System.out.println(resultado);
        }else {
            resultado = (quantidadeLaranja*1.00);
            System.out.println(resultado);
        }

    }
}

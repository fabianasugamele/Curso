package operadoresAritimeticos;

import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int anoDias, meses, anoVida, dias;

        System.out.println("Digite quantos sua idade em anos, meses e dias ");
        System.out.println("Anos");
        anoVida = teclado.nextInt();
        System.out.println("Meses");
        meses = teclado.nextInt();
        System.out.println("Dias");
        dias = teclado.nextInt();
        anoDias =((anoVida*365)+(meses*30)+dias);
        System.out.println("Você já viveu "+anoDias+" dias");


    }
}

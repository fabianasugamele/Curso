package operadoresAritimeticos;

import java.util.Scanner;

public class Exeercio_3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double altura, largura, profundidade, volume;

        System.out.println("Digita a altura ");
        altura = teclado.nextDouble();
        System.out.println("Digite a largura ");
        largura = teclado.nextDouble();
        System.out.println("Difite a profundidade ");
        profundidade = teclado.nextDouble();

        volume = (altura*largura*profundidade);
        System.out.println("O volume é "+ volume);
    }
}

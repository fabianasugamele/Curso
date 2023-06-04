package OperadoresAritimeticos;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int primeiroNumero,segundoNumero, difrenca;

        System.out.println("Digite um número ");
        primeiroNumero = teclado.nextInt();
        System.out.println("digite outro numero ");
        segundoNumero = teclado.nextInt();
        difrenca = (primeiroNumero  - segundoNumero);
        System.out.println("A dferença entre "+primeiroNumero+" e "
                +segundoNumero+" é "+difrenca);
    }
}

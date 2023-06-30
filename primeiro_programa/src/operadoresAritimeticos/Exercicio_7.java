package operadoresAritimeticos;

import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario, reajuste, novoSlario;
        System.out.println("Digite seu salrio atual");
        salario = teclado.nextDouble();
        System.out.println("Digite Reajuste");
        reajuste = teclado.nextDouble();

        novoSlario = salario + (salario * (reajuste/100));

        System.out.println("Seu salrio novo "+novoSlario);
    }
}

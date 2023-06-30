package operadoresRelacionais;

import java.util.Scanner;

public class Exercicio_9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero ");
        numero = teclado.nextInt();
        if(numero%2 ==0){
            System.out.println("è par");

        }else {
            System.out.println("impar");
        }
    }


}

package operadoresAritimeticos;

import java.util.Scanner;

public class Exercicio_5 {

    public static void main(String[] args) {
        Scanner tecladdo = new Scanner(System.in);
        int numero, antecessor;
        System.out.println("Digite um numero");
        numero = tecladdo.nextInt();
        antecessor= numero -1;
        System.out.println("O antecessor de "+numero+" é "+antecessor);



    }
}

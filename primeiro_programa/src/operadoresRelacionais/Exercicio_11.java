package operadoresRelacionais;

import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int anoNascimento,anoAtual = 2023;
        int idadeVoto = 16;
        System.out.println("Digite o ano que você nasceu ");
        anoNascimento = teclado.nextInt();
        int resultadoIdade = anoAtual - anoNascimento;

        if(resultadoIdade>idadeVoto){
            System.out.println("Você pode votar");
        }else {
            System.out.println("você não pode votar");

        }


    }


}

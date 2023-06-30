package desafioFinal;

import desafioFinal.conta.Conta;
import desafioFinal.menu.Menu;
import desafioFinal.menu.Principal;
import desafioFinal.services.ContaCorrente;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioBanco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Menu menu = new Principal();
        menu.showMenu();
        menu.capturaTeclado(teclado);
        menu.executaMenu();

        for (Conta element : Conta.conta) {
            System.out.println(element.toString());
        }
    }
}

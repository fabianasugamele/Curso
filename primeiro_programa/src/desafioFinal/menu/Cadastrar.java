package desafioFinal.menu;

import desafioFinal.services.ContaCorrente;
import desafioFinal.services.ContaPoupanca;

import java.util.Scanner;

public class Cadastrar extends Menu {
    @Override
    public void showMenu() {
        System.out.println("");
        System.out.println("Qual tipo de conta deseja cadastrar ?");
        System.out.println("1 - Conta Corrente");
        System.out.println("2 - Conta Poupança");
        System.out.println("3 - Voltar");
    }

    @Override
    public void executaMenu() {
        Menu menuCadastrar = new Cadastrar();
        while (this.opcaoMenu>3 || this.opcaoMenu == 0){
            System.out.println("Número inválido");
            System.out.println("Digite numero entre 1 e 3 para retornar ao menu");
            this.capturaTeclado(this.teclado);
        }if (this.opcaoMenu == 3){
            Menu menu = new Principal();
            menu.showMenu();
            menu.capturaTeclado(this.teclado);
            menu.executaMenu();
        }switch (this.opcaoMenu) {
            case 1:
                ContaCorrente contaCorrente = new ContaCorrente();
                contaCorrente.cadastrar();

                menuCadastrar.showMenu();
                menuCadastrar.capturaTeclado(this.teclado);
                menuCadastrar.executaMenu();
                break;
            case 2:
                ContaPoupanca contaPoupanca = new ContaPoupanca();
                contaPoupanca.cadastrar();

                menuCadastrar.showMenu();
                menuCadastrar.capturaTeclado(this.teclado);
                menuCadastrar.executaMenu();
                break;
        }
    }
}

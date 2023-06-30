package desafioFinal.menu;

import java.util.Scanner;

public class Principal extends Menu{
    @Override
    public void showMenu() {
        System.out.println("");
        System.out.println("Escolha uma opção :");
        System.out.println("1 - Cadastrar Conta");
        System.out.println("2 - Acessar Contas");
        System.out.println("3 - Sair");
    }

    public void executaMenu() {
        while (this.opcaoMenu>3 || this.opcaoMenu == 0){
            System.out.println("Número inválido");
            System.out.println("Digite numero entre 1 e 3 para retornar ao menu");
            this.capturaTeclado(this.teclado);
        }if (this.opcaoMenu == 3){
            System.out.println("Programa Encerrado Com sucesso ");
        }switch (this.opcaoMenu) {
            case 1:
                Menu menu = new Cadastrar();
                menu.showMenu();
                menu.capturaTeclado(this.teclado);
                menu.executaMenu();
                break;
            case 2:
                System.out.println("Acessar ");
                break;
        }
    }
}

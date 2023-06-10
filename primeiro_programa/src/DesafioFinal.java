import java.util.Arrays;
import java.util.Scanner;

public class DesafioFinal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String [] contaCliente = new String[10];
        int[] numeroConta = new int[10];
        int[] numeroAgencia=new int[10];
        String [] nomeConta = new String[10];
        double [] saldoInicial = new double[10];
        int posicaoSaldo=0;
        int posicaoTipoConta=0;
        int menu=0;
        int posicaoNomeConta=0,posicaoNumeroConta=0,
            posicaoNumeroAgencia=0;
        int tipoDeConta=0;
        while (menu<4){
            System.out.println("Escolhe as opçoes");
            System.out.println("1 -Cadastrar Conta");
            System.out.println("2 -Consultar Contas");
            System.out.println("3 -Remover conta");
            System.out.println("4 = Sair");
            menu = teclado.nextInt();
            while (menu>4){
                System.out.println("Número inválido");
                System.out.println("Digite numero entre 1 e 4 para retornar ao menu");
                menu = teclado.nextInt();
            }if (menu == 4){
                System.out.println("Programa Encerrado Com sucesso ");
            }switch (menu){
                case 1:
                    System.out.println("Digite o nome do cliente ");
                    contaCliente[posicaoNomeConta++] = teclado.next();
                    System.out.println("Digte numero da conta");
                    numeroConta[posicaoNumeroConta++] = teclado.nextInt();
                    System.out.println("Digite o numero da agencia");
                    numeroAgencia[posicaoNumeroAgencia++] = teclado.nextInt();
                    System.out.println("Qual o saldo Inicial ");
                    saldoInicial[posicaoSaldo++] = teclado.nextDouble();
                    System.out.println("Escolha o tipo de Conta");
                    System.out.println("20 - Conta Corrente");
                    System.out.println("21 -Conta Poupança");
                    System.out.println("22 - Conta Salario");
                    tipoDeConta = teclado.nextInt();
                    while (tipoDeConta<20 || tipoDeConta>22){
                        System.out.println("Escolha entre 20 a 23");
                        tipoDeConta = teclado.nextInt();
                    }
                    if (tipoDeConta>=20 &&tipoDeConta<=23){
                        System.out.println("Conta criada com sucesso");
                    }
                    break;
                case 2:
                    for (int i =0;i<contaCliente.length;i++)
                    System.out.println("Posicao"+i+" = "
                            +contaCliente[i]
                            +"Conta Numero "+numeroConta[i]+
                            " Agência "+numeroAgencia[i]+
                            " Saldo inicial "+saldoInicial[i]);
            }


        }

    }
}

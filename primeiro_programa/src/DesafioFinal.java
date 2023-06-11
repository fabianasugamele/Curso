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
            showMenu();
            menu = checkInt(teclado);
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
                    numeroConta[posicaoNumeroConta++] = checkInt(teclado);
                    System.out.println("Digite o numero da agencia");
                    numeroAgencia[posicaoNumeroAgencia++] = checkInt(teclado);
                    System.out.println("Qual o saldo Inicial ");
                    saldoInicial[posicaoSaldo++] = checkDouble(teclado);
                    printTipoDeConta();
                    tipoDeConta = checkInt(teclado);
                    while (tipoDeConta<20 || tipoDeConta>22){
                        System.out.println("Escolha entre 20 a 23");
                        tipoDeConta = checkInt(teclado);
                    }
                    if (tipoDeConta>=20 &&tipoDeConta<=23){
                        System.out.println("\u001B[32mConta criada com sucesso\u001B[0m");
                    }
                    break;
                case 2:
                    for (int i =0;i<contaCliente.length;i++) {
                        if(contaCliente[i] == null || contaCliente[i].isEmpty()) {
                            continue;
                        }
                        System.out.println("Posicao " + i + " = "
                                + contaCliente[i] + " "
                                + "Conta Numero " + numeroConta[i] +
                                " Agência " + numeroAgencia[i] +
                                " Saldo inicial " + saldoInicial[i]);
                    }
                break;
            }

        }

    }

    private static void showMenu() {
        System.out.println("Escolhe as opçoes");
        System.out.println("1 -Cadastrar Conta");
        System.out.println("2 -Consultar Contas");
        System.out.println("3 -Remover conta");
        System.out.println("4 = Sair");
    }

    private static void printTipoDeConta(){
        System.out.println("Escolha o tipo de Conta");
        System.out.println("20 - Conta Corrente");
        System.out.println("21 -Conta Poupança");
        System.out.println("22 - Conta Salario");
    }

    private static int checkInt(Scanner teclado) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED_BACKGROUND = "\u001B[41m";

        while (true) {
            try {
                return teclado.nextInt();
            } catch (Exception e) {
                System.out.println(ANSI_RED_BACKGROUND + "O valor deve ser um inteiro. Tente novamente." + ANSI_RESET);
            } finally{
                teclado.nextLine();
            }
        }
    }

    private static double checkDouble(Scanner teclado) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED_BACKGROUND = "\u001B[41m";

        while (true) {
            try {
                return teclado.nextDouble();
            } catch (Exception e) {
                System.out.println(ANSI_RED_BACKGROUND + "O valor deve ser um número. Tente novamente." + ANSI_RESET);
            } finally{
                teclado.nextLine();
            }
        }
    }

}

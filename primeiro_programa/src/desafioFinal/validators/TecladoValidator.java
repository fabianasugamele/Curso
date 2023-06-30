package desafioFinal.validators;

import java.util.Scanner;

public class TecladoValidator {
    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public int checkInputTecladoInt(Scanner teclado) {
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

    public String checkInputTecladoString(Scanner teclado) {
        String inputString = "";

        while (inputString.isEmpty()) {
            inputString = teclado.nextLine();

            if (inputString.isEmpty()) {
                System.out.println(ANSI_RED_BACKGROUND + "O campo não pode ser vazio" + ANSI_RESET);
            }
        }

        return inputString;
    }

    public double checkInputTecladoDouble(Scanner teclado) {
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

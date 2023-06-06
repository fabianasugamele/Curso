package operadoresLogicos;

import java.util.Scanner;

public class Exercicio_19 {
 /*   19) Uma empresa quer verificar se um empregado está qualificado
    para a aposentadoria ou não. Para estar em condições, um dos
    seguintes requisitos deve ser cumprido:
• Ter no mínimo 65 anos de idade;
• Ter trabalhado no mínimo 30 anos;
• Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
    Com base nas informações acima, faça um algoritmo que leia: o
    número do empregado (código), o ano de seu nascimento e o ano
    de seu ingresso na empresa. O programa deverá escrever a idade e
    o tempo de trabalho do empregado e a mensagem 'Requerer
    aposentadoria' ou 'Não requerer'.

  */
 public static void main(String[] args) {
     Scanner teclado= new Scanner(System.in);
     int anoNascimento,anoEntrouNaEmpresa,
             idadeAtual,codigoFuncionario,
             anosTrabalhado, anoAtual=2023;

     System.out.println("Código do Funcionario ");
     codigoFuncionario = teclado.nextInt();
     System.out.println("Ano de Nascimento do Funcionario? ");
     anoNascimento= teclado.nextInt();
     System.out.println("Ano que ingressou na empresa");
     anoEntrouNaEmpresa = teclado.nextInt();

     idadeAtual = anoAtual - anoNascimento;
     anosTrabalhado = anoAtual - anoEntrouNaEmpresa;

     if(idadeAtual>=65 || anosTrabalhado>=30){
         System.out.println("Requerer aposentadoria");
     } else if (idadeAtual>=60 && anosTrabalhado>=25) {
         System.out.println("Requerer aposentadoria");
     }else {
         System.out.println("Não requerer aposentadoria");
     }
     System.out.println("Codigo funcionario "+codigoFuncionario);
     System.out.println("Idade atual "+idadeAtual);
     System.out.println("Anos trabalhados "+anosTrabalhado);

 }

}

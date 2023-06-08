package estruturaRepeticao;

public class Exercicio_27 {
    /*27) Uma loja tem uma política de descontos de acordo com o valor
da compra do cliente. Os descontos começam acima dos R$500. A
cada 100 reais acima dos R$500,00 o cliente ganha 1% de
desconto cumulativo até 25%. Por exemplo: R$500 = 1% ||
R$600,00 = 2% … etc.
Faça um programa que exiba essa tabela de descontos no seguinte
formato: Valor da compra – porcentagem de desconto – valor
fina
     */

    public static void main(String[] args) {
        double  valorCompra=400,valorFinal,
                percentualDesconto=0.00, desconto=0;
        for (int i = 1; i<=25;i++){
            valorCompra +=100;
            desconto++;
            percentualDesconto = (desconto/100);
            valorFinal = valorCompra -(valorCompra *percentualDesconto);

            System.out.println("Valor da compra "+" = "
                    +valorCompra+"  Porcentagem de desconto"+
                    " = "+desconto+"%"+" Valor Final"+" = "+valorFinal);
        }

    }
}


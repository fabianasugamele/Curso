package desafioFinal.conta;

import desafioFinal.usuario.Pessoa;

import java.util.Random;

public class Poupanca extends Conta{

    String tipo;

    public Poupanca(Pessoa pessoa) {
        Random random = new Random();
        this.pessoa = pessoa;
        this.agencia = random.nextInt(9000) + 1000;
        this.contacorrente = random.nextInt(90000) + 1000;
        this.tipo = "Conta Poupança";
    }

    @Override
    public String toString() {
        return "Poupanca{" +
                "tipo=" + tipo +
                ", senha=" + senha +
                ", saldo=" + saldo +
                ", agencia=" + agencia +
                ", contacorrente=" + contacorrente +
                ", pessoa=" + pessoa.toString() +
                '}';
    }
}

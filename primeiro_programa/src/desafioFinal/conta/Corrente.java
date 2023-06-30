package desafioFinal.conta;

import desafioFinal.usuario.Pessoa;

import java.util.Random;

public class Corrente extends Conta{
    int pix;

    String tipo;

    public Corrente(Pessoa pessoa) {
        Random random = new Random();
        this.pessoa = pessoa;
        this.agencia = random.nextInt(9000) + 1000;
        this.contacorrente = random.nextInt(90000) + 1000;
        this.tipo = "Conta Corrente";
    }

    public int getPix() {
        return pix;
    }

    public void setPix(int pix) {
        this.pix = pix;
    }

    @Override
    public String toString() {
        return "Corrente{" +
                "tipo=" + tipo  +
                ", senha=" + senha +
                ", saldo=" + saldo +
                ", agencia=" + agencia +
                ", contacorrente=" + contacorrente +
                ", pix=" + pix +
                ", pessoa=" + pessoa.toString() +
                '}';
    }
}

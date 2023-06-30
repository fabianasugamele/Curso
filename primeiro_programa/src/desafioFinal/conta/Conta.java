package desafioFinal.conta;

import desafioFinal.usuario.Pessoa;

import java.util.ArrayList;

public abstract class Conta {

    int senha = 0;
    double saldo = 0;

    int agencia;

    int contacorrente;

    Pessoa pessoa;

    public static ArrayList<Conta> conta = new ArrayList<>();

    public int getAgencia() {
        return agencia;
    }

    public int getContacorrente() {
        return contacorrente;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

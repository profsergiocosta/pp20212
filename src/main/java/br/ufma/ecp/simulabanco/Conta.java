package br.ufma.ecp.simulabanco;

public class Conta {

    private double saldo;
    private int codigo;

    public Conta (int codigo, double saldoInicial) {
        this.codigo = codigo;
        this.saldo =saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public boolean saque(double valor) {
        if (valor <= saldo){
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    
    }

    
}

package br.ufma.ecp.simulabanco;

import java.util.List;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

import java.util.ArrayList;

public class Agencia {

    List<Conta> contas;

    private int codigo;

    public Agencia(int codigo) {
        contas = new ArrayList<Conta>();
        this.codigo = codigo;
    }

    public void addConta(Conta conta) {
        contas.add(conta);
    }

    public int saque(double valor, int codigoConta) {
        
      Conta c = buscaConta(codigoConta);
      if (c != null) {
          if (c.saque(valor)){
              return 0; // sem erros
          } else {
              return 1; /// saldo insuficiente
          }
      } else {
        return 2; // conta invalida
      }
      
    }

    public double getSaldo(int codigoConta) {
        for (Conta conta : contas) {
                if (conta.getCodigo() == codigoConta) {
                    return conta.getSaldo();
                }
        }
        return 0;
    }

    private Conta buscaConta(int codigoConta) {
           for (Conta conta : contas) {
                if (conta.getCodigo() == codigoConta) {
                    return conta;
                }
        }
        return null;
    }
    
}

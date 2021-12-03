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

    public void saque(double valor, int codigoConta) throws Exception {
        
      Conta c = buscaConta(codigoConta);
      if (c != null) {
         c.saque(valor);  
      } else {
        throw new Exception("Conta Invalida");
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

package br.ufma.ecp.simulabanco;

public class App {
    
    public static void main(String[] args) {
        Agencia ag = new Agencia (1234);

        ag.addConta (new Conta (456, 100));
        ag.addConta (new Conta (489, 50));

        int codigoConta = 456;
        double valor = 1000;

        int codigoerro = ag.saque (valor, codigoConta);

        switch (codigoerro) {
            case 0:
                System.out.println("sucesso");
                break;
            case 1:
                System.out.println("saldo insuficiente");
                break;
            case 2:
                System.out.println("conta invalida");
                break;
            default:
                break;  


        }


        
        /*
        if () {
            System.out.println("saque realizado com sucesso");
            System.out.print("Saldo atual:");
            System.out.println(ag.getSaldo(codigoConta));
        } else {
            System.out.println("saldo insuficiente");
            System.out.print("saldo atual:");
            System.out.println(ag.getSaldo(codigoConta));
        }
        */

        

    }
}

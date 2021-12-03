package br.ufma.ecp.simulabanco;

public class App {
    
    public static void main(String[] args) {
        Agencia ag = new Agencia (1234);

        ag.addConta (new Conta (456, 100));
        ag.addConta (new Conta (489, 50));

        int codigoConta = 4569;
        double valor = 100;

        try {
            ag.saque (valor, codigoConta);
            System.out.println("sucesso");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }

        

    }
}

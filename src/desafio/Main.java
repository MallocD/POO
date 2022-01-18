package desafio;

import java.lang.ref.Cleaner;

public class Main {
    public static void main(String[] args) {
        Contas cc = new ContaCorrente(new Cliente("José"));
        Contas cp = new ContaPoupanca(new Cliente("Marcio"));
        Banco contas = new Banco();



        cc.depositar(100);
        cc.transferir(50d,cp);

        cc.imprimirExtrato();
        System.out.println("========");
        cp.imprimirExtrato();

    }
}

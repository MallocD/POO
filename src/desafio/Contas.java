package desafio;

public abstract class Contas implements IConta {
    private int agencia;
    private int numero;
    private double saldo;
    protected  Cliente cliente;

    private static  int AGENCIA_PADRAO = 1;
    private static  int SEQUENCIAL = 1 ;

    public Contas(Cliente cliente){
        agencia = Contas.AGENCIA_PADRAO++;
        numero = SEQUENCIAL++;
        setSaldo(0);
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo-=valor;
    }

    @Override
    public void depositar(double valor) {
        saldo+=valor;
    }

    @Override
    public void transferir(Double valor, Contas contadestino) {
        this.sacar(valor);
        contadestino.depositar(valor);

    }

    public int getAgencia() {
        return agencia;
    }

    protected void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    protected void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }


     public void imprimirExtrato(){
        System.out.println("Informaçõe sobre a conta bancária: ");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Agência: " + this.agencia);
        System.out.println("Numero da conta: " + this.numero);
        System.out.println("Saldo da conta " + this.saldo);
    }
}

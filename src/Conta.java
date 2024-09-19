//import java.util.SortedMap;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1; //Constante para agencia padrao
    private static int SEQUENCIAL = 1; // Número sequencial para o número da conta não ser repetido e criado sequencial

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    //Método contrutor da Classe Conta
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++; // "++" add 1 número a mais na sequencia
        this.cliente = cliente;
    }
    //Implementação de metodos da interfaceIContas
    @Override
    public  void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Valor sacado: " + valor);
        } else {
            System.out.println("Saldo insuficiente para o saque!");
        }
    }
    @Override
    public void  depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Saldo atual: " + valor);
        }
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor > 0 && saldo >= valor) {
            sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("O valor de " + valor + " foi tranferido com sucesso!");
            System.out.println("Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para efetuar a transferência!");
        }

    }
    @Override
    public void imprimirExtrato(){

    }

    //Getters e Setters
    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    //Sobrescreve toString
    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }

    public Cliente getCliente() {
        return cliente;
    }
    //Imprimir informações comuns em extratos
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));  // pode ou não udar o "THIS"
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}

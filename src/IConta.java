//Interface da Conta
public interface IConta {

    void sacar(double valor); //não precisa colocar "public' pois em Interface só pode ser publico
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}

//import java.util.Formatter;
public class Main {
    public static void main(String[] args) {
        Banco bancoInicial = new Banco(); //instancia novo banco

        bancoInicial.setNome("Royal Bank"); //insere nome do banco

        Cliente renan = new Cliente("Renan", bancoInicial);  //criado novo cliente renan
        renan.setNome("Renan"); //insere o nome do cliente

        Conta ccorrente = new ContaCorrente(renan); //instanciada nova conta corrente

        ccorrente.depositar(100); //criado um deposito em conta corrente

        Cliente flavia = new Cliente("Flávia", bancoInicial);  //instancia novo cliente
        Conta cpoupanca = new ContaPoupanca(flavia);  //instanciada nova conta poupanca

        ccorrente.imprimirExtrato();  //imprime extrato de ccorrente renan
        cpoupanca.imprimirExtrato();  //imprime estrato de cpoupanca flavia

        ccorrente.transferir(110, cpoupanca);  //faz tranferencia de ccorrente renan pra cpoupanca flavia

        ccorrente.imprimirExtrato(); //imprime extrato atualizado de ccorrente renan
        cpoupanca.imprimirExtrato(); //imprime extrato atualizado de cpoupanca flavia
        bancoInicial.mostrarClientes(); //mostra lista de clientes

        Cliente fernando = new Cliente("Fernando", bancoInicial);  //instancia novo cliente fernando
        Conta ccorrente2 = new ContaCorrente(fernando); //instancia nova ccorrente2 de fernando
        ccorrente.transferir(20, ccorrente2);
        cpoupanca.transferir(20,ccorrente2);
        ccorrente2.sacar(30);
        ccorrente2.imprimirExtrato();  //imprime  ccorrente2 de fernando
        bancoInicial.mostrarClientes(); //mostra lista atualizada de clientes do banco







// abaixo, Prof fez na aula
        //Cliente flavia = new Cliente();
        //flavia.setNome("Flávia");


        //Conta cc = new ContaCorrente(flavia);
        //Conta poupanca = new ContaPoupanca(flavia);

        //cc.depositar(100);
        //cc.transferir(80, poupanca);

        //cc.imprimirExtrato();
        //poupanca.imprimirExtrato();


    }
}
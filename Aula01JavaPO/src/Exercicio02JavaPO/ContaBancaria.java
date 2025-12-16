
package Exercicio02JavaPO;

public class ContaBancaria {
    
    String numeroConta;
    double saldo;
    String titular;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

}
    
    

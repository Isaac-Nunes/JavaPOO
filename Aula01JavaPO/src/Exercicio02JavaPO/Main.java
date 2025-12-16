
package Exercicio02JavaPO;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria();
        conta.numeroConta = "12345-6";
        conta.titular = "Maria";
        conta.saldo = 1000.0;

        conta.depositar(500.0);
        conta.sacar(200.0);

        System.out.println("Saldo atual: " + conta.saldo);
    }
}
       
        
        
        
   
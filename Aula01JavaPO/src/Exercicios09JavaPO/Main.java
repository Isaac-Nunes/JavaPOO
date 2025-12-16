/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios09JavaPO;

/**
 *
 * @author ISAACOLIVEIRANUNES
 */
public class Main {
    public static void main(String[] args) {
        Produto prod = new Produto();
        prod.nome = "Notebook";
        prod.preco = 3500.0;
        prod.quantidadeEmEstoque = 10;

        prod.vender(2);
        System.out.println("Estoque após venda: " + prod.quantidadeEmEstoque);

        prod.reporEstoque(5);
        System.out.println("Estoque após reposição: " + prod.quantidadeEmEstoque);
    }
}

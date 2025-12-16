/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios09JavaPO;

/**
 *
 * @author ISAACOLIVEIRANUNES
 */
public class Produto {
    String nome;
    double preco;
    int quantidadeEmEstoque;

    public void vender(int quantidade) {
        quantidadeEmEstoque -= quantidade;
    }

    public void reporEstoque(int quantidade) {
        quantidadeEmEstoque += quantidade;
    }
}

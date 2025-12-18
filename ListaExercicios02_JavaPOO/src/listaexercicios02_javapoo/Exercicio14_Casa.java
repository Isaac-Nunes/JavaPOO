/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaexercicios02_javapoo;

/**
 *
 * @author AJN
 */
public class Exercicio14_Casa {
    private int numero;
    private String cor;
    private Exercicio01_Pessoa proprietario;

    public Exercicio14_Casa(int numero, String cor,  Exercicio01_Pessoa proprietario) {
        this.numero = numero;
        this.cor = cor;
        this.proprietario = proprietario;
    }

    public int getNumero() { return numero; }
    public String getCor() { return cor; }
    public Exercicio01_Pessoa getProprietario() { return proprietario; }
}


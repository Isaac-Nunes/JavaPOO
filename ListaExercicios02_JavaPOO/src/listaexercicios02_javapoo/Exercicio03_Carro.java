/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaexercicios02_javapoo;

/**
 *
 * @author AJN
 */
public class Exercicio03_Carro {

    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;

    
    public Exercicio03_Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false; 
    }

    
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }
    public boolean isLigado() { return ligado; }

    
    public void ligar() { this.ligado = true; }
    public void desligar() { this.ligado = false; }
}


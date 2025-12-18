/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaexercicios02_javapoo;

/**
 *
 * @author AJN
 */
public class Exercicio06_Retangulo {
    private double largura;
    private double altura;

    public Exercicio06_Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() { return largura; }
    public void setLargura(double largura) { this.largura = largura; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}


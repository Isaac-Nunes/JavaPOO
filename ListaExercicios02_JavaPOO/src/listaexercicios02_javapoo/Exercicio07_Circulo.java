/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaexercicios02_javapoo;

/**
 *
 * @author AJN
 */
public class Exercicio07_Circulo {
    private double raio;

    public Exercicio07_Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() { return raio; }
    public void setRaio(double raio) { this.raio = raio; }

    public double calcularArea() {
        return Math.PI * (raio * raio);
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio05JavaPO;

/**
 *
 * @author ISAACOLIVEIRANUNES
 */
public class Circulo {
    double raio;

    public double calcularArea() {
        return Math.PI * (raio * raio);
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }
}


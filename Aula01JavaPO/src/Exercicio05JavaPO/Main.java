/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio05JavaPO;

/**
 *
 * @author ISAACOLIVEIRANUNES
 */
public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.raio = 5.0;

        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Circunferência: " + circulo.calcularCircunferencia());
    }
}

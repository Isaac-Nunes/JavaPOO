/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio03JavaPO;

/**
 *
 * @author ISAACOLIVEIRANUNES
 */
public class Main {
    public static void main(String[] args) {
        
        Carro carro = new Carro();
        carro.marca = "Toyota";
        carro.modelo = "Corolla";
        carro.ano = 2022;
        carro.ligado = false;

        carro.ligar();
        System.out.println("O carro está ligado? " + carro.ligado);

        carro.desligar();
        System.out.println("O carro está ligado? " + carro.ligado);
      
        
    }
}

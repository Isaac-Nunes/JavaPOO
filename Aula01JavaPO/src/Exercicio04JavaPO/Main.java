/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio04JavaPO;

/**
 *
 * @author ISAACOLIVEIRANUNES
 */
public class Main {

        public static void main(String[] args) {
            Retangulo ret = new Retangulo();
            ret.base = 5.0;
            ret.altura = 10.0;

            System.out.println("Área: " + ret.calcularArea());
            System.out.println("Perímetro: " + ret.calcularPerimetro());

        }
    }

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio08JavaPO;

/**
 *
 * @author ISAACOLIVEIRANUNES
 */
public class Aluno {
    String nome;
    int matricula;
    double[] notas;

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}

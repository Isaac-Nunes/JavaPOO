/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio08JavaPO;

/**
 *
 * @author ISAACOLIVEIRANUNES
 */
public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Ana";
        aluno.matricula = 101;
        aluno.notas = new double[]{8.5, 7.0, 9.5};

        System.out.println("Média: " + aluno.calcularMedia());
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio06JavaPO;

/**
 *
 * @author ISAACOLIVEIRANUNES
 */
public class Main {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        func.nome = "Carlos";
        func.salario = 2000.0;
        func.departamento = "TI";

        System.out.println("Salário antigo: " + func.salario);
        
        func.aumentarSalario(10.0);
        
        System.out.println("Salário novo: " + func.salario);
    }
}


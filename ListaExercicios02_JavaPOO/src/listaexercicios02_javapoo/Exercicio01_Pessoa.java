/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaexercicios02_javapoo;

/**
 *
 * @author AJN
 */
public class Exercicio01_Pessoa {


        private String nome;
        private int idade;
        private double altura;

       
        public Exercicio01_Pessoa(String nome, int idade, double altura) {
            this.nome = nome;
            this.idade = idade;
            this.altura = altura;
        }

        
        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        public double getAltura() {
            return altura;
        }
    }


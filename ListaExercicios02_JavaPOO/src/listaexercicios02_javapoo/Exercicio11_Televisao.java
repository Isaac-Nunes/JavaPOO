/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaexercicios02_javapoo;

/**
 *
 * @author AJN
 */
public class Exercicio11_Televisao {
    private int volume;
    private int canal;

    public Exercicio11_Televisao(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }

    public int getVolume() { return volume; }
    public void setVolume(int volume) { this.volume = volume; }

    public int getCanal() { return canal; }
    public void setCanal(int canal) { this.canal = canal; }

    public void aumentarVolume() {
        this.volume++;
    }

    public void diminuirVolume() {
        this.volume--;
    }

    public void trocarCanal(int novoCanal) {
        this.canal = novoCanal;
    }
}


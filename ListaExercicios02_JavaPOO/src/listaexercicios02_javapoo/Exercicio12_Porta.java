/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaexercicios02_javapoo;

/**
 *
 * @author AJN
 */
public class Exercicio12_Porta {
    private boolean aberta;
    private String cor;

    public Exercicio12_Porta(boolean aberta, String cor) {
        this.aberta = aberta;
        this.cor = cor;
    }

    public boolean isAberta() { return aberta; }
    public void setAberta(boolean aberta) { this.aberta = aberta; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public void abrir() {
        this.aberta = true;
    }

    public void fechar() {
        this.aberta = false;
    }
}


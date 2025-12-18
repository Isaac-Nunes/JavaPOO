/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaexercicios02_javapoo;

/**
 *
 * @author AJN
 */
public class Exercicio04_Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    
    public  Exercicio04_Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true; 
    }

   
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
    public int getAnoPublicacao() { return anoPublicacao; }
    public void setAnoPublicacao(int anoPublicacao) { this.anoPublicacao = anoPublicacao; }
    public boolean isDisponivel() { return disponivel; }

 
    public void emprestar() { this.disponivel = false; }
    public void devolver() { this.disponivel = true; }
}


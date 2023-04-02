package br.com.dio.desafio.dominio;

import java.time.LocalDate;

//modelar a classe
public class Mentoria {

    //1º) atributos da classe Mentoria
    private String titulo;
    private String descricao;
    private LocalDate data;

    //4º) criar o construtor vazio

    public Mentoria() {
    }


    //2º)criar os métodos getter e setter dos atributos

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    //3º) criar o método toString()

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}

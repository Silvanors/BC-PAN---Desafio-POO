package br.com.dio.desafio.dominio;

import java.time.LocalDate;

//modelar a classe
public class Mentoria extends Conteudo {
    //Após o uso da classe mãe com "extends Conteudo" deve-se usar o titulo e descrição da classe mãe

    //1º) atributos da classe Mentoria
    /**private String titulo;
    private String descricao;
     Obs: a variável "data" não existe na classe mãe "Conteudo"*/
    private LocalDate data;

    //5º) Após ajuste das atributos que já existem na classe mãe deve-se criar o método calcularXP()
    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    //4º) criar o construtor vazio
    public Mentoria() {

    }

    //2º)criar os métodos getter e setter dos atributos
    /**
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
    }*/

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
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }


}

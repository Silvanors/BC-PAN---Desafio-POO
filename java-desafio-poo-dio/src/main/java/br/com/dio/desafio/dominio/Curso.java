package br.com.dio.desafio.dominio;

//modelar a Classe
public class Curso {

    //1º) atributos da classe Curso
    //modificadores de acesso: private (só a classe tem acesso), protect (só a classe e as classe filhas),
    //public (qualquer classe pode ter acesso, por padrao é puplic quando não coloca-se nada)
    //por boa prática usa-se "private"
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    //4º) criar o construtor vazio


    public Curso() {
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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    //3º) criar o toString()

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}

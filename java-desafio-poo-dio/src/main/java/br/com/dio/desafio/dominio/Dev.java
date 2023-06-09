package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    //1º) atributos da classe: nome, conteudoInscritos e conteudosConcluidos
    private String nome;
    //o LinkedHashSet salva os conteúdos na memória na ordem da inserção e sem repetição
    private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    //2º) criar os métodos
    public void inscreverBootcamp(Bootcamp bootcamp){
        //inserindo tudo que está no bootcamp no conteudoInscritos
        this.conteudoInscritos.addAll(bootcamp.getConteudos());
        //adicionar o dev no bootcamp
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        //pegar os conteudosInscritos e colocar dentro de conteudosConcluidos
        Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();

        //para tirar o conteudo de conteudoInscritos e colocar em conteudoConcluidos
        //isPresente() verifica se o primeiro conteúdo é existente
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudoInscritos.remove(conteudo.get());
        }else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXp(){
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(conteudo -> conteudo.calcularXP())
                .sum();

    }

    //3º) criar os getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscritos() {
        return conteudoInscritos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    //4º) quando se trabalha com HashSet deve-se implementar equals e hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoInscritos, dev.conteudoInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoInscritos, conteudosConcluidos);
    }
}

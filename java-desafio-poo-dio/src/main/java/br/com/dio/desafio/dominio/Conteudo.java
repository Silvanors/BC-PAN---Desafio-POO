package br.com.dio.desafio.dominio;

//"mentorias" e "curos" são conteúdos, por isso está sendo criado a Classe Conteudo
public abstract class Conteudo {

    //1º) criar os atributos da Classe Conteudo
    //static para ser usado fora da clase
    //protected para que só as classes filhas possam usar
    protected static final double XP_PADRAO =10d;

    private String titulo;
    private String descricao;

    //2º) criar o método calcularXp() para ser usado nas classes filhas que estenderem para evitar repetição
    //de código
    public abstract double calcularXP();

    //3º)criar os métodos getter e setter dos atributos "titulo" e "descrição"
    //Após a criação colocar nas classe filhas "extends Conteudo"
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
}

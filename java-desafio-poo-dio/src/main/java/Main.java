import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //com a palavra "new" se instancia um objeto
        //Por exemplo, a Classe Curso é como se fosse a planta da casa e o objeto formado com "new"
        //fosse a casa
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        //criar a mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        //LocalDate.now() vai atribuir a data da criação
        mentoria.setData(LocalDate.now());

        //imprimindo curso para verificar se foi criado
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}

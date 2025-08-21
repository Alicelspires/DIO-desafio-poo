import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Dev;

public class Main {
    public static void main(String[] args) throws Exception {

        // Adicionando conteudos (dois cursos e uma mentoria)
        Curso curso1 =  new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descricao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 =  new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("descricao curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descricao mentoria Java");
        mentoria.setData(LocalDate.now());

        // Adicionando os conteudos ao Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        // Inscrevendo o primeiro dev -------------------
        System.out.println("\n=============================");
        Dev devAlice = new Dev();
        devAlice.setNome("Alice");
        devAlice.inscreverBootcamp(bootcamp);

        // Antes de progredir no curso
        System.out.println("Conteudo Inscritos Alice: "+ devAlice.getConteudoInscritos());
        System.out.println("\nXP: "+ devAlice.calcularTotalXp());

        // Depois de progredir no curso
        devAlice.progredir();
        System.out.println("Conteudo Inscritos Alice: "+ devAlice.getConteudoInscritos());
        System.out.println("XP: "+ devAlice.calcularTotalXp());

        System.out.println("Conteudo Concluidos Alice: "+ devAlice.getConteudoConcluidos());
        

        System.out.println("\n=============================");

        // Inscrevendo o Segundo dev -------------------
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos João: "+ devJoao.getConteudoInscritos());
        System.out.println("Conteudo Concluidos João: "+ devJoao.getConteudoConcluidos());
        System.out.println("XP: "+ devJoao.calcularTotalXp());
        System.out.println("\n=============================");
    }
}

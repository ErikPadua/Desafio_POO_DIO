
import java.time.LocalDate;

import Dominio.Bootcamp;
import Dominio.Curso;
import Dominio.Dev;
import Dominio.Mentoria;

public class Main 
{
    public static void main(String[] args) 
    {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4); 
  
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRodrigo = new Dev();
        devRodrigo.setNome("Rodrigo");
        devRodrigo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rodrigo: " + devRodrigo.getConteudosIncritos());
        devRodrigo.pogredir();
        System.out.println("Conteúdos Inscritos Rodrigo: " + devRodrigo.getConteudosIncritos());
        System.out.println("Conteúdos Concluidos Rodrigo: " + devRodrigo.getConteudosConcluidos());
        System.out.println("Xp: " + devRodrigo.calcularTotalXp());

        System.out.println("------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosIncritos());
        devJoao.pogredir();
        devJoao.pogredir();
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosIncritos());
        System.out.println("Conteúdos Concluidos João: " + devRodrigo.getConteudosIncritos());
        System.out.println("Xp: " + devJoao.calcularTotalXp());

    }
}

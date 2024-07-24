package dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Introdução ao Spring");
        cursoJava.setDescricao("Framework SpringBoot para Java");
        cursoJava.setDuracaoHoras(16);

        Curso cursoPython = new Curso();
        cursoPython.setTitulo("Fundamentos de Python");
        cursoPython.setDescricao("Python com bibliotecas pandas e pyautogui");
        cursoPython.setDuracaoHoras(12);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Sessão de Mentoria em Java");
        mentoriaJava.setDescricao("Exploração dos frameworks do ecossistema Java");
        mentoriaJava.setData(LocalDate.now());

        Bootcamp bootcampTech = new Bootcamp();
        bootcampTech.setNome("Bootcamp Santander Java 2024");
        bootcampTech.setDescricao("Programa intensivo de desenvolvimento em Java");
        bootcampTech.getConteudos().add(cursoJava);
        bootcampTech.getConteudos().add(cursoPython);
        bootcampTech.getConteudos().add(mentoriaJava);

        System.out.println("=======================================================================");

        Dev desenvolvedorAnderson = new Dev();
        desenvolvedorAnderson.setNome("Anderson");
        desenvolvedorAnderson.matricularDev(bootcampTech);

        desenvolvedorAnderson.imprimirConteudosMatriculados();
        desenvolvedorAnderson.avancar();
        desenvolvedorAnderson.avancar();
        System.out.println(desenvolvedorAnderson.getNome() + " avançou no aprendizado!");
        desenvolvedorAnderson.imprimirConteudosMatriculados();
        desenvolvedorAnderson.imprimirConteudosFinalizados();
        System.out.println("XP acumulado: " + desenvolvedorAnderson.calcularExperiencia());

        System.out.println("=======================================================================");

        Dev desenvolvedorRodrigo = new Dev();
        desenvolvedorRodrigo.setNome("Rodrigo");
        desenvolvedorRodrigo.matricularDev(bootcampTech);

        desenvolvedorRodrigo.imprimirConteudosMatriculados();
        desenvolvedorRodrigo.avancar();
        System.out.println(desenvolvedorRodrigo.getNome() + " avançou no aprendizado!");
        desenvolvedorRodrigo.imprimirConteudosMatriculados();
        desenvolvedorRodrigo.imprimirConteudosFinalizados();
        System.out.println("XP acumulado: " + desenvolvedorRodrigo.calcularExperiencia());
    }
}

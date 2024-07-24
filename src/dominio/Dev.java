package dominio;

import java.util.*;

public class Dev {
    private String nome;
    private List<Conteudo> conteudosMatriculados = new ArrayList<>();
    private List<Conteudo> conteudosFinalizados = new ArrayList<>();

    // Método para se inscrever em um bootcamp
    public void matricularDev(Bootcamp bootcamp) {
        this.conteudosMatriculados.addAll(bootcamp.getConteudos());
//        bootcamp.getDevsInscritos().add(this);
    }

    // Método para progredir no conteúdo
    public void avancar() {
        Optional<Conteudo> conteudo = this.conteudosMatriculados.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosFinalizados.add(conteudo.get());
            this.conteudosMatriculados.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }


    // Método para calcular a experiência acumulada
    public double calcularExperiencia() {
        return this.conteudosFinalizados.stream()
                .mapToDouble(Conteudo::calcularExperiencia)
                .sum();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Dev)) return false;
        Dev outro = (Dev) obj;
        return Objects.equals(nome, outro.nome) &&
                Objects.equals(conteudosMatriculados, outro.conteudosMatriculados) &&
                Objects.equals(conteudosFinalizados, outro.conteudosFinalizados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosMatriculados, conteudosFinalizados);
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conteudo> getConteudosMatriculados() {
        return conteudosMatriculados;
    }

    public void imprimirConteudosFinalizados() {
        System.out.println("Conteúdos finalizados para " + nome + ":");
        for (Conteudo conteudo : conteudosFinalizados) {
            System.out.println(conteudo);
        }
        System.out.println("_");
    }

    public void imprimirConteudosMatriculados() {
        System.out.println("Conteúdos em progresso para " + nome + ":");
        for (Conteudo conteudo : conteudosMatriculados) {
            System.out.println(conteudo);
        }
        System.out.println("_");
    }
}

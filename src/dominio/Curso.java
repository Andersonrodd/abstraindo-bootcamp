package dominio;

public class Curso extends Conteudo {

    private int duracaoHoras;

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

    @Override
    public String toString() {
        return "Curso: " + getTitulo() +
                " - " + getDescricao() +
                ". Duração: "  + getDuracaoHoras() + " horas";
    }

    @Override
    public double calcularExperiencia() {
        return XP_PADRAO * duracaoHoras;
    }
}

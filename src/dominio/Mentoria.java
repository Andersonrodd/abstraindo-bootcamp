package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularExperiencia() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return  "Mentoria: " + getTitulo() +
                " - " + getDescricao() +
                ". Data do Evento: "  + data;
    }
}

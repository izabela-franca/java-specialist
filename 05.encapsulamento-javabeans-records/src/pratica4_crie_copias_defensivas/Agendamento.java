package pratica4_crie_copias_defensivas;

public class Agendamento {

    private final Horario horario;
    private String descricao;

    public Agendamento(Horario horario, String descricao) {
        // this.horario = horario
        this.horario = new Horario(horario.getHora(), horario.getMinuto()); //Cópia defensiva
        this.descricao = descricao;
    }

    public Horario getHorario() {
        return new Horario(horario.getHora(), horario.getMinuto()); //Cópia defensiva
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHorarioFormatado() {
        return horario.formatar();
    }

}

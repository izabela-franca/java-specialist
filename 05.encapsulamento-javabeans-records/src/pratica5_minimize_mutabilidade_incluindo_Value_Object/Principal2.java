package pratica5_minimize_mutabilidade_incluindo_Value_Object;

public class  Principal2 {

    public static void main(String[] args) {
        Horario horario = new Horario(10, 30);
        Agendamento agendamentoCabelo = new Agendamento(horario, "Corte de cabelo");

        Horario novoHorario = CalculadoraHorario.somarDuasHoras(horario);

        //Não está alterando horário, mas sim atribuindo um novo
        agendamentoCabelo.setHorario(new Horario(16, 20));

        System.out.println(agendamentoCabelo.getHorarioFormatado());
        System.out.println(novoHorario.formatar());
    }

}

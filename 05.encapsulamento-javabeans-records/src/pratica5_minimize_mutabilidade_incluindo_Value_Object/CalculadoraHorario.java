package pratica5_minimize_mutabilidade_incluindo_Value_Object;

public class CalculadoraHorario {

    private CalculadoraHorario() {
    }

    public static Horario somarDuasHoras(Horario horario) {
        int hora = horario.getHora() + 2;

        if (hora > 24) {
            hora = hora - 24;
        }

//        horario.setHora(hora);
//        return horario;

        return new Horario(hora, horario.getMinuto());
    }

}

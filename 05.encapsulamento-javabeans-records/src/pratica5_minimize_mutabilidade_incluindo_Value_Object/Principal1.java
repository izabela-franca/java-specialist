package pratica5_minimize_mutabilidade_incluindo_Value_Object;

public class Principal1 {

    public static void main(String[] args) {
        Integer idade = 30; //classe imutável
        Integer novaIdade = idade + 1;

        Horario horario = new Horario(10, 30);
//        horario.setHora(15);
    }

}

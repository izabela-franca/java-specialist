package pratica5_minimize_mutabilidade_incluindo_Value_Object;

    /*
    Criando uma classe imuntável:
        - Não permitir que esta classe seja herdada
        - As variáveis de instâncias precisam ser private e final
        - Não podem existir métodos setters
     */

    //usado para classe não ser extendida
public final class Horario {

    //variáveis de instancias private e final
    private final int hora;
    private final int minuto;

    public Horario(int hora, int minuto) {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora inválida: " + hora);
        }
        if (minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException("Minuto inválido: " + minuto);
        }

        this.hora = hora;
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public String formatar() {
        return String.format("%dh%dm", getHora(), getMinuto());
    }

}

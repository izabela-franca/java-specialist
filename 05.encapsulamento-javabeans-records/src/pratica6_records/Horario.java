package pratica6_records;

//Criando uma classe Record para armazenar dados (imutável)
//Devemos colocar as propriedades da classe no próprio cabeçalho (na prórpia declaração)
//Classes Records não possuem setters (pois são imutáveis)
public record Horario(int hora, int minuto) {

    //Construtor é criado de forma implícita e de forma padrão

    //Criando um construtor customizado seguindo a regra de negócio
    //Construtor compacto: omite os parâmetros e as atribuições dos mesmos
    public Horario {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora inválida: " + hora);
        }
        if (minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException("Minuto inválido: " + minuto);
        }
    }

    public String formatar() {         //Getter dos Records não tem a palavra get
        return String.format("%dh%dm", hora(), minuto());
    }

}

package pratica1.servico;

import pratica1.Cartao;
import pratica1.Estabelecimento;
import pratica1.Recibo;

public class ServicoDePagamentoOnline {

    public Recibo efetuarPagamento(Estabelecimento estabelecimento,
                                   Cartao cartao, double valor) {
        cartao.debitar(valor);

        // TODO realiza outras lógicas para efetuar o pagamento ao estabelecimento

        return new Recibo(cartao.getTitular(), "Pagamento", valor);
    }

}

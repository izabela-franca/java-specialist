package pratica1;

import pratica1.Cartao;
import pratica1.Estabelecimento;
import pratica1.Recibo;
import pratica1.servico.ServicoDeDepositoPix;
import pratica1.servico.ServicoDePagamentoOnline;

public class Principal {

    public static void main(String[] args) {
        var supermercado = new Estabelecimento("Supermercado do Zé");
        var cartao = new Cartao("João Souza Silva");

        var servicoDeDeposito = new ServicoDeDepositoPix();
        Recibo reciboDeposito = servicoDeDeposito.efetuarDeposito(cartao, 500);
        reciboDeposito.imprimir();

        var servicoDePagamento = new ServicoDePagamentoOnline();
        Recibo reciboPagamento = servicoDePagamento.efetuarPagamento(supermercado, cartao, 100);
        reciboPagamento.imprimir();

        System.out.printf("Titular: %s%n", cartao.getTitular());
        System.out.printf("Saldo: R$%.2f%n", cartao.getSaldo());
    }

}

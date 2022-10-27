import model.Conta;
import model.TipoTransacao;
import model.Transacao;

public class GerenciarConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta(1, "Maromo");
        Transacao t1 = new Transacao(conta1, 200, TipoTransacao.Depositar);
        Transacao t2 = new Transacao(conta1, 200, TipoTransacao.Depositar);
        Transacao t3 = new Transacao(conta1, 200, TipoTransacao.Depositar);
        Transacao t4 = new Transacao(conta1, 200, TipoTransacao.Depositar);
        Transacao t5 = new Transacao(conta1, 200, TipoTransacao.Depositar);
        Transacao t6 = new Transacao(conta1, 0, TipoTransacao.ExibirSaldo);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
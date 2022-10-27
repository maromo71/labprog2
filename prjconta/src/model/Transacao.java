package model;

public class Transacao extends Thread {
    private Conta conta;
    private double valor;
    private TipoTransacao tipo;

    public Transacao(Conta conta, double valor, TipoTransacao tipo){
        this.conta = conta;
        this.valor = valor;
        this.tipo = tipo;
    }

    @Override
    public void run() {
        try{
            if(tipo==TipoTransacao.Depositar){
                boolean ok = conta.depositar(valor);
                if(ok) System.out.println("Dep. feito, saldo: " +
                        conta.getSaldo());
            } else if (tipo==TipoTransacao.Sacar) {
                boolean ok = conta.sacar(valor);
                if(ok) System.out.println("Saque efetuado, saldo: " +
                        conta.getSaldo());
            } else{
                System.out.println("Saldo atual: " + conta.getSaldo());
            }
        }catch (Exception ex){
            System.out.println("Erro: " + ex.getMessage());
        }

    }
}

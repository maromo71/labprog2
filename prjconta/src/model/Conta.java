package model;

public class Conta {
    private int idConta;
    private String nome;
    private double saldo;

    public Conta(int idConta, String nome){
        this.idConta = idConta;
        this.nome = nome;
    }
    public boolean depositar(double valor) throws IllegalArgumentException{
        synchronized (this){
            if(valor <=0){
                throw new IllegalArgumentException("Valor inválido");
            }
            saldo+= valor;
            return true;
        }

    }

    public boolean sacar(double valor) throws IllegalArgumentException{
        synchronized (this){
            if(valor>saldo){
                throw new IllegalArgumentException("Sem limite para saque");
            }
            saldo-=valor;
            return true;
        }

    }

    public double getSaldo() {
        synchronized (nome){
            return saldo;
        }

    }
}

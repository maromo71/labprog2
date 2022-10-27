package model;

public class NotaFiscal implements Runnable {
    private int idPrograma;

    public NotaFiscal(int idPrograma){
        this.idPrograma = idPrograma;
    }

    public int getIdPrograma() {
        return idPrograma;
    }

    @Override
    public void run() {
        System.out.println("Criando NF pelo programa: " +
                idPrograma);
        System.out.println("Gerando pdf do programa " +
                idPrograma);
    }
}

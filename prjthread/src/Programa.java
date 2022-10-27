import model.BarraProgresso;
import model.NotaFiscal;

public class Programa {
    public static void main(String[] args) {
        NotaFiscal nf1 = new NotaFiscal(1);
        BarraProgresso bp1 = new BarraProgresso();

        //Criar uma thread para a nf1
        Thread t1 = new Thread(nf1);
        //Criar outra thread para a bp1
        Thread t2 = new Thread(bp1);

        t2.start();
        try{
            t2.join();
        }catch (Exception e){
            System.out.println("Aconteceu um erro");
        }
        t1.start();
    }
}
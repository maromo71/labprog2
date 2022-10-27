package model;

public class BarraProgresso implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 20000; i++) {
            if(i % 80== 0) System.out.println();
            System.out.print("*");
        }
    }
}

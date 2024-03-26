package ejerciciosVarios;

public class Ejercicio26 {
    public static void main(String[] args) {

        int posActual=15;
        int anchoMax=30;

        boolean primera=true;

        while(true) {
            try {
                Thread.sleep(100);

                for(int i=0; i<anchoMax;i++) {
                    if (i==posActual) {
                        if (primera) {
                            System.out.print("@");
                            primera=false;
                        } else {
                            System.out.print("|-|");
                        }
                    } else System.out.print(" ");
                }

                System.out.println();
                int cambio=(int) (Math.random()*3)-1;
                posActual+=cambio;
                if (posActual == -1) posActual=0;
                if (posActual == 31) posActual=30;

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

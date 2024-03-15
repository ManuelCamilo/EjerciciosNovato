package ejercicio22;

public class Ejercicio22 {

    int numCaras;
    int tiradas[];

    public Ejercicio22(int numCaras, int numDados) {
        this.numCaras = numCaras;
        this.tiradas = new int[numDados];

    }

    public void tirarDados() {
        for(int i=0; i<tiradas.length; i++) {
            tiradas[i] = (int)(Math.random()*numCaras+1);
        }
        comprobarIguales();

    }

    private void comprobarIguales() {
        boolean iguales = true;
        int numComprobar = tiradas[0];

        for (int i=0; i<tiradas.length; i++) {
            System.out.print("[" + tiradas[i] + "] ");
            if (numComprobar != tiradas[i]) iguales = false;
        }
        System.out.println();

        if(iguales) System.out.println("Todos los número son iguales. GOD!");
        else System.out.println("No son iguales SAD.");
    }

}

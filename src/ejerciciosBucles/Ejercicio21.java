package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numElegido, diasElegidos;


        System.out.println("Elige un número entre 0 y 99999");

        numElegido=sc.nextInt();

        if(numElegido<0 || numElegido>99999) {
            System.out.println("RESPETA LAS REGLAS!");
            System.exit(0);
        }

        System.out.println("¿Cuantos días quieres jugar?");
        diasElegidos = sc.nextInt();

        if(diasElegidos<1) {
            System.out.println("Pues no juegues...");
            System.exit(0);
        }

        compruebaNumeros(numElegido, diasElegidos);
    }
    private static void compruebaNumeros (int numElegido,int diasElegidos) {
        int numGanador, numSerie, dia=0;
        double dineroGastado=0, dineroGanado=0;

        for (int i=0; i<diasElegidos; i++) {
            dia++;
            dineroGastado+= 3.5;
            numSerie =(int)(Math.random()*20+1);

            numGanador = (int)(Math.random()*100000);
            if (numElegido==numGanador) {

                if(numSerie==1) {
                    System.out.println("Ganaste el preimo GRANDE!!! EN EL DIA: "+ dia);
                    dineroGanado+=1000000;
                } else {
                    System.out.println("Tu numero ha salido!!, premio medio");
                    dineroGanado+=50000;
                }

            } else if (numElegido%10==numGanador%10) {
                dineroGanado+=3.5;
            }
        }
        System.out.println("Te has gastado " + dineroGastado + "$ y has ganado " + dineroGanado + "$");
    }
}

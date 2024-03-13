package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas entradas quieres?");
        int nEntradas = sc.nextInt();
        sc.nextLine();
        System.out.println("Que día quieres ir?");
        String dia = sc.nextLine();
        System.out.println("Tienes tarjeta de socio?");
        String tarjeta = sc.nextLine();
        double precioTotal;

        switch (dia.toLowerCase()) {
            case "miercoles":
                precioTotal=nEntradas*5;
                break;
            case "jueves":
                if (nEntradas%2==0) {
                    precioTotal=(nEntradas/2)*11;
                } else {
                    precioTotal=(nEntradas/2)*11;
                    precioTotal+=8;
                }
                break;
            default:
                precioTotal=nEntradas*8;
        }
        if (tarjeta.toUpperCase().equals("S")) {
            precioTotal-=(precioTotal*0.10);
        }
        System.out.println("Has comprado un total de: " + nEntradas + " entradas. El precio total es de: " + precioTotal + " Pesitos .\nDisfruta de la película.");
    }
}

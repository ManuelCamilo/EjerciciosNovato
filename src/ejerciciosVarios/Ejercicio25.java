package ejerciciosVarios;

import javax.swing.*;
import java.util.Random;

public class Ejercicio25 {
    public static void main(String[] args) {

        int capacidad=0, agua;
        final int ANCHO=14;
        Random rnd = new Random();

        //comprobamos si es un número o cae en la escepción.
        do {
            try{
                capacidad = Integer.parseInt(JOptionPane.showInputDialog("Dime la capacidad del barril. \nMínimo 1."));
            }catch (NumberFormatException e) {
                System.out.println("El número es invalido.");
            }
        } while(capacidad==0);

        agua = rnd.nextInt(capacidad+1);

        System.out.println("Capacidad = " + capacidad + " Agua = " + agua);

        for (int i=capacidad; i>=0; i--) {

            for(int j=ANCHO; j>0; j--) {

                //suelo de barril.
                if (i==0) System.out.print("*");
                else {
                    //comprobamos si estamos en la 1, o ultima fila, que seran las paredes del barril
                    if(j==ANCHO || j==1) System.out.print("*");
                    //sino, no estamos en la primera o ultima fila, por lo que debe ir agua o vacio.
                    else {
                        //si es menor al nivel del agua, dibuja agua.. sino y esta por encima, dibujara espacios.
                        if (i<=agua) System.out.print("=");
                        else System.out.print(" ");
                    }
                }
            }
            System.out.println();

        }
    }
}

package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número\nTiene que ser positivo y como máximo 5 cifras.");
        int num = sc.nextInt();
        int aux = num;
        if (num<0 || num>99999){
            System.out.println("Porfavor! revisa el número ingresado\nRecuerda que no puede ser negativo y no puede tener más de 5 cifras");
            System.exit(0);
        }
        System.out.println("La última cifra del número " + num + " es: " + num%10); // cualquier número modulo 10, devolverá la ultima cifra.

        if(num<10) System.out.println("La primera cifra es la misma que la última.");
        else if(num<100) {
            aux/=10;
            System.out.println("la primera cifra del número " + num + " es: " + aux%10);
        } else if(num<1000){
            aux/=100;
            System.out.println("la primera cifra del número " + num + " es: " + aux%10);
        } else if(num<10000){
            aux/=1000;
            System.out.println("la primera cifra del número " + num + " es: " + aux%10);
        } else {
            aux/=10000;
            System.out.println("la primera cifra del número " + num + " es: " + aux%10);
        }
    }
}

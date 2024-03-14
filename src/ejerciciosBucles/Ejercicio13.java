package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        double sumaTotal = 0;
        double num;

        do {
            System.out.println("Introduce un número!\nSi quieres salir, introduce uno negativo.");
            num = sc.nextDouble();
            if (num>=0) {
                contador++;
                sumaTotal+=num;
            }
        } while(num>=0);
        System.out.println("Has introducido " + contador + " números. La media de todos ellos es de " + sumaTotal/contador);

    }
}

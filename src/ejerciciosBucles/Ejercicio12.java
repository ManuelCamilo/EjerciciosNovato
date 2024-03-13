package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, numInt, intentos;

        num = (int)Math.round((Math.random()*99)+1);
        intentos = 0;

        System.out.println("He generado un número aleatorio entre 1 y 100 --- Adivinalo en menos de 10 intentos!");
        do {
            System.out.println("Introduce un número: ");
            numInt = sc.nextInt();
            if (numInt < num) System.out.println("Tu número es menor.");
            if (numInt > num) System.out.println("Tu número es mayor.");

            intentos++;
        } while(numInt!=num && intentos < 10);
        if (numInt!=num) System.out.println("No has adivinado!,\nEl numero era: " + num);
        else System.out.println("Lo has conseguido!!!\n el numero era: "+ num + "!\nlo conseguiste en " + intentos + " intentos!");
    }
}

package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        int num1 = sc.nextInt();
        System.out.println("Introduce un segundo número entero.\nDebe ser diferente al primer número");
        int num2 = sc.nextInt();
        if (num1==num2) {
            System.out.println("LOS NÚMEROS DEBEN SER DIFERENTES!!!!!");
            System.exit(0); //terminará la ejecución!!!
        }
        if (num2>num1) num1 = num2; //una intrucción no hace falta las llaves!!!
        if (num1%2==0) System.out.println("El número " + num1 + " es par.");
        else System.out.println("El número" + num1+ " no es par.");

        if (num1%5==0) System.out.println("El número es divisible por 5");
        else System.out.println("El número no es divisible por 5");
    }
}

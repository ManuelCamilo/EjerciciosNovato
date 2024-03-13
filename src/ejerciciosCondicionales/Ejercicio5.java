package ejerciciosCondicionales;

import java.util.Scanner;

//aprobado o no?
public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("introduce la primer nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("introduce la segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("introduce la tercera nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("tu media es de: " + media);

        if (media < 5) {
            System.out.println("Suspendido");
        } else if (media < 6) {
            System.out.println("Suficiente");
        } else if (media< 7) {
            System.out.println("Bueno");
        } else if (media< 9) {
            System.out.println("Notable");
        } else if (media < 10) {
            System.out.println("Sobresaliente");
        } else if (media == 10) {
            System.out.println("Excelente");
        } else {
            System.out.println("Escribe bien las notas.");
        }


    }
}
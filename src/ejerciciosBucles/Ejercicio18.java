package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long num, numReves = 0;
        int suma=0;

        System.out.println("Introduce un número: ");
        num = sc.nextLong();

        //le damos la vuelta al numero
        while (num!=0) {
            numReves=(numReves*10)+(num%10);
            num/=10;
        }

        while (numReves!=0) {
            //guardar en aux, el ultimo digito del numero al reves
            long aux= numReves%10;
            //comprobamos si es par..
            if (aux%2==0) {
                System.out.print(aux + " ");
                suma+=aux;
            }
            //divide el num en 10, y reduce en 1 1.
            numReves/=10;
        }
        System.out.println("\nLa suma de todos ellos es de: " + suma);

        //al dar vuelta el numero, lo devolvera en orden del que nosotros lo fuimos poniendo.. al no darle la vuelta corrobora de derecha a izquierda
        // por lo que veremos los digitos pares en otro orden por ej, 19402472 -> veremos si no damos vuelta 2 4 2 0 4 -> y si damos vuelta  4 0 2 4 2
    }
}

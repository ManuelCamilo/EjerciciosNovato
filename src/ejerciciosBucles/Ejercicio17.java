package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        long resultado;

        System.out.println("Porfavor, introduce un número y te diré su factorial.");

        num = sc.nextInt();
        resultado = num;
        //factorial del numero introducido
        for(int i=num-1; i>0; i--) {
            resultado=resultado*i;
        }
        System.out.println(num + "! = " + resultado);

    }
}

package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num, numReves = 0, aux;
        boolean esCapicua=true;

        System.out.println("Introduce un número y te diré si es capicúa");

        num = sc.nextLong();
        aux = num;
        while(aux != 0) {
            numReves=(numReves*10)+aux%10;
            aux/=10;
        }
        while(num!=0) {
            if(num%10!=numReves%10) esCapicua=false;
            num/=10;
            numReves/=10;
        }
        if (esCapicua) System.out.println("El número ingresado es capicúa!");
        else System.out.println("El número ingresado no es capicúo!!");
    }
}

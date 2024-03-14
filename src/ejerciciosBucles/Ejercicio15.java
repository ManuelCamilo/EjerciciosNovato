package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número, le daré la vuelta y mostrare sus cantidad de cifras!");
        long num = sc.nextLong();
        long numReves = 0;
        int contador = 0;

        while(num!=0) {
            numReves = (numReves*10)+(num%10);
            num/=10;
            contador ++;
        }
        System.out.println("El número al reves es: " + numReves + ".\nTiene " + contador + " cifras.");
    }
}

/*
Inicialmente, tenemos numReves = 0 y contador = 0.

Entramos en el bucle while ya que num (inicializado con el número ingresado, en este caso, 123) no es igual a 0.

En la primera iteración:
numReves se actualiza multiplicando su valor actual por 10 (0 * 10 = 0) y sumándole el resto de la división de num entre 10 (123 % 10 = 3).
Por lo tanto, numReves se convierte en 3.
num se actualiza dividiéndolo entre 10, lo que resulta en 12 (123 / 10 = 12).
Incrementamos contador en 1, ya que hemos procesado un dígito.


En la segunda iteración:
numReves se actualiza multiplicando su valor actual por 10 (3 * 10 = 30) y sumándole el resto de la división de num entre 10 (12 % 10 = 2).
Por lo tanto, numReves se convierte en 32.
num se actualiza dividiéndolo entre 10, lo que resulta en 1 (12 / 10 = 1).
Incrementamos contador en 1.


En la tercera iteración:
numReves se actualiza multiplicando su valor actual por 10 (32 * 10 = 320) y sumándole el resto de la división de num entre 10 (1 % 10 = 1).
Por lo tanto, numReves se convierte en 321.
num se actualiza dividiéndolo entre 10, lo que resulta en 0 (1 / 10 = 0).
Incrementamos contador en 1.


Ahora, num es igual a 0, por lo que salimos del bucle while.

Imprimimos el número al revés, que es 321, y la cantidad de dígitos, que es 3.
 */
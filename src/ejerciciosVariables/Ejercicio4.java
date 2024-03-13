package ejerciciosVariables;

public class Ejercicio4 {
    public static void main(String[] args) {
        char letraA = 'A';
        char letraE = 'E';
        char letraI = 'I';
        char letraO = 'O';
        char letraU = 'U';

        System.out.println(letraA + letraE + letraI + letraO + letraU);
        // Esto devuelve 371 --> por que JAVA trata los CHAR como codigo ascii, y su suma es esa. pero con una cadena vacia ya los trata como string
        System.out.println("" + letraA + letraE + letraI + letraO + letraU);
        // Ahora si devuelve AEIOU
    }
}

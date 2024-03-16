package onePiece;

import java.util.Scanner;

public class OnePiece {

    char mapa[][] = new char [10][10];
    char num = 48;
    int x, y, contador = 0;
    int xNuestra, yNuestra;
    Scanner sc = new Scanner(System.in);

    private void rellenaMapa() {

        for (int i=0; i<mapa.length; i++) {
            for (int j=0; j<mapa.length; j++) {

                if(i==0 && j!=0) mapa[i][j]=num;
                else if(i!=0 && j==0) mapa[i][j]=num;
                else if(i!=0 && j!=0) mapa[i][j]='?';

                if(num==57) num=49;
                else num++;
            }
        }

    }

    private void dibujaMapa() {
        for (int i=0; i<mapa.length; i++) {
            for (int j=0; j<mapa.length; j++) {

                System.out.print(mapa[i][j] + " ");

            }
            System.out.println();
        }
    }

    private boolean desenterrar(int x, int y) {
        if (x > 0 && x < 10 && y > 0 && y < 10) {
            contador++;

            if (this.x == x && this.y == y) {
                mapa[y][x] = 'X'; // Invertir la coordenada x e y
                dibujaMapa();
                return true;
            } else {
                if (this.y != y) {
                    if (this.y < y) mapa[y][x] = '\u2191'; // flecha arriba
                    else mapa[y][x] = '\u2193'; // flecha abajo
                } else {
                    if (this.x < x) mapa[y][x] = '<'; // flecha izquierda
                    else mapa[y][x] = '>'; // flecha derecha
                }
            }

            dibujaMapa();
            return false;
        } else {
            System.out.println("Las coordenadas son incorrectas. Por favor, revisa los números ingresados.");
            return false;
        }
    }

    public void jugar() {
        x = (int) (Math.random()*9+1);
        y = (int) (Math.random()*9+1);

        rellenaMapa();
        dibujaMapa();

        do {
            System.out.println("Elige la coordenada X: ");
            xNuestra = sc.nextInt();

            System.out.println("Elige la coordenada Y: ");
            yNuestra = sc.nextInt();

        }while (!desenterrar(xNuestra, yNuestra));

        System.out.println("¡¡¡ Has encontrado el One Piece!!! Eres el nuevo rey de los piratas.");
        System.out.println("Lo has conseguido en " + contador + " intentos.");
    }
}

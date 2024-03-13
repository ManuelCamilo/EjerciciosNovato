package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué Eliges?\n(Piedra, Papel, Tijers, Lagarto, Spock)");
        String eleccion = sc.nextLine();
        int num = (int) ((Math.random()*5)+1);

        String eleccionVS;

        switch (num) {
            case 1:
                eleccionVS="Piedra";
                break;
            case 2:
                eleccionVS="Papel";
                break;
            case 3:
                eleccionVS="Tijeras";
                break;
            case 4:
                eleccionVS="Lagarto";
                break;
            default:
                eleccionVS="Spock";
                break;
        }
        if (eleccion.toLowerCase().equals("piedra")&& eleccionVS.equals("Tijeras")) {
            System.out.println("Has ganado!. Piedra rompe sus tijeras");
        } else if (eleccion.toLowerCase().equals("piedra")&& eleccionVS.equals("Lagarto")) {
            System.out.println("Has ganado!. Tu piedra aplasta su lagarto.");
        } else if (eleccion.toLowerCase().equals("papel")&& eleccionVS.equals("piedra")) {
            System.out.println("Has ganado!. Tu papelenvuelve su piedra!");
        } else if (eleccion.toLowerCase().equals("papel")&& eleccionVS.equals("Spock")) {
            System.out.println("Has ganado. Tu papel desautoriza a Spock. ");
        } else if (eleccion.toLowerCase().equals("tijeras")&& eleccionVS.equals("papel")) {
            System.out.println("Has ganado. Tus tijeras cortan el papel. ");
        } else if (eleccion.toLowerCase().equals("tijeras")&& eleccionVS.equals("lagarto")) {
                System.out.println("Has ganado. Tus tijeras decapitan su lagarto. ");
        } else if (eleccion.toLowerCase().equals("lagarto")&& eleccionVS.equals("papel")) {
            System.out.println("Has ganado. Tu lagarto se come su papel.");
        } else if (eleccion.toLowerCase().equals("lagarto")&& eleccionVS.equals("Spock")) {
            System.out.println("Has ganado. Tu lagarto envenena a Spock ");
        } else if (eleccion.toLowerCase().equals("spock")&& eleccionVS.equals("tijeras")) {
                System.out.println("Has ganado. Spock destruye sus tijeras");
        } else if (eleccion.toLowerCase().equals("spock")&& eleccionVS.equals("piedra")) {
            System.out.println("Has ganado. Spock vaporiza su piedra.");
        } else if (eleccion.toLowerCase().equals(eleccionVS.toLowerCase())) {
            System.out.println("Empate!!!");
        } else {
            System.out.println("Has perdido. Elegiste " + eleccion + " y tu contrinante eligió " + eleccionVS);
        }
    }
}

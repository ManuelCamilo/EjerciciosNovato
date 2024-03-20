package ejerciciosVarios;

import java.io.*;

public class Ejercicio24 {
    public static void main(String[] args) {
        try {
            FileWriter archivo = new FileWriter("C:\\Users\\Manu\\Desktop\\Programación con el novato\\ArchivosNovato\\primerTexto.txt");

            archivo.write("Borren yummi!\n");
            archivo.write("o me lastimo.");

            archivo.close();

            FileReader archivoLectura = new FileReader("C:\\Users\\Manu\\Desktop\\Programación con el novato\\ArchivosNovato\\primerTexto.txt");

            BufferedReader leyendo = new BufferedReader(archivoLectura);

            String linea = leyendo.readLine();
            while (linea!=null){
                System.out.println(linea);
                linea = leyendo.readLine();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

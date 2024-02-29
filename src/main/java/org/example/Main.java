package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Creamos instancias de URLManager y DownloaderAndZipper
        URLManager manager = new URLManager();
        DownloaderAndZipper downloaderAndZipper = new DownloaderAndZipper();
        // Agregar el downloaderAndZipper como listener a la lista de URLs en manager
        manager.getUrlList().addListener(downloaderAndZipper);

        try (Scanner scanner = new Scanner(System.in)) {
            // Bucle infinito para leer las entradas del usuario
            while (true) {
                System.out.println("Introduce una URL para descargar y comprimir, o escribe 'salir' para terminar:");

                String input = scanner.nextLine().trim();

                // Si el usuario escribe "salir", se termina el bucle.
                if ("salir".equalsIgnoreCase(input)) {
                    break;
                }

                // Si el usuario presiona Enter sin introducir texto, se añade una cadena vacía a la lista.
                manager.addURL(input);
            }
        }

        // Después de que el usuario pulse salir finaliza el programa y se lo indicamos
        System.out.println("Finalizando el programa...");



    }
}
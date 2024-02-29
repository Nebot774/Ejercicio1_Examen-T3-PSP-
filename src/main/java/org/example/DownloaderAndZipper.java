package org.example;

import javafx.collections.ListChangeListener;


public class DownloaderAndZipper implements ListChangeListener<String> {
    // Método llamado cuando la lista de URLs cambia
    @Override
    public void onChanged(Change<? extends String> c) {
        // Iterar sobre los cambios en la lista
        while (c.next()) {
            // Verificar si se han añadido elementos a la lista
            if (c.wasAdded()) {
                // Iterar sobre los elementos añadidos
                for (String s : c.getAddedSubList()) {
                    // Verificar si el elemento añadido es una cadena vacía
                    if (s.isEmpty()) {
                        // Si es una cadena vacía, indicar que se procederá a descargar y comprimir los archivos
                        System.out.println("Se va a proceder a descargar y comprimir los ficheros");
                    } else {
                        // Si no es una cadena vacía, imprimir la URL junto con el mensaje de encolado
                        System.out.println(s);
                    }
                }
            }
        }
    }
}

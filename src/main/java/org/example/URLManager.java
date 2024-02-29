package org.example;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.security.SecureRandom;
import java.util.Base64;


public class URLManager {
    // Lista observable para almacenar las URLs
    private final ObservableList<String> urlList;

    // Constructor para inicializar la lista observable
    public URLManager() {
        urlList = FXCollections.observableArrayList();
    }

    // Método para añadir una URL a la lista
    public void addURL(String url) {
        // Verificar si la URL es nula o está vacía
        if (url == null || url.isEmpty()) {
            // Si la URL es nula o está vacía, añadir una entrada vacía a la lista
            urlList.add(""); // Añadir una entrada vacía para indicar la descarga y compresión.
        } else {
            // Generar una cadena aleatoria para identificar la URL encolada
            String randomString = generateRandomString();
            // Añadir la URL junto con la cadena aleatoria a la lista
            urlList.add(url + " encolado como " + randomString);
        }
    }

    // Método privado para generar una cadena aleatoria de 20 caracteres
    private String generateRandomString() {
        SecureRandom random = new SecureRandom();
        byte[] bytes = new byte[20]; // 20 caracteres
        random.nextBytes(bytes);
        // Codificar los bytes en Base64 y eliminar el relleno para obtener una cadena legible
        return Base64.getUrlEncoder().withoutPadding().encodeToString(bytes);
    }

    // Método para obtener la lista observable de URLs
    public ObservableList<String> getUrlList() {
        return urlList;
    }
}


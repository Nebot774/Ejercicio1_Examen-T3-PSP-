# Ejercicio 1 Examen

Este proyecto es un ejercicio de programación en Java que simula la descarga y compresión de archivos desde URLs introducidas por el usuario. Utiliza el patrón de diseño Observer-Listener y clases de JavaFX Observable para el seguimiento de la lista de URLs.

## Funcionalidades

- Permite a los usuarios introducir URLs para ser encoladas para descarga y compresión.
- Genera una cadena aleatoria y única de 20 caracteres para cada URL encolada.
- Notifica al usuario a través de la consola cuando una URL es encolada o cuando todas las URLs están listas para ser procesadas.
- Sale del programa cuando el usuario escribe 'salir'.

## Uso

Para ejecutar el programa, sigue estos pasos:

1. Compila el código con tu entorno de desarrollo de Java o línea de comandos.
2. Ejecuta el archivo `Main.class`.
3. Cuando el programa esté corriendo, introduce las URLs que desees en la consola.
4. Si deseas terminar de introducir URLs y comenzar con la descarga y compresión, simplemente escribe 'salir' y presiona Enter.

## Requisitos

- Java SDK 8 o superior.
- Conocimiento básico de operaciones de consola.

## Estructura del Proyecto

El proyecto contiene las siguientes clases principales:

- `Main`: Punto de entrada al programa que maneja la entrada del usuario.
- `URLManager`: Clase Observable que maneja la lista de URLs y notifica a los observadores de los cambios.
- `DownloaderAndZipper`: Clase Observer que reacciona a los cambios en la lista de URLs y muestra mensajes en consola.


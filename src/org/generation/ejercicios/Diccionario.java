package org.generation.ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {
    public static void main(String[] args) {

    	HashMap<String, String> diccionario = new HashMap<>();
        
        // Agregamos palabras al diccionario
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("casa", "house");
        diccionario.put("coche", "car");
        diccionario.put("manzana", "apple");
        diccionario.put("agua", "water");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("amigo", "friend");
        diccionario.put("familia", "family");
        diccionario.put("trabajo", "work");
        diccionario.put("escuela", "school");
        diccionario.put("libro", "book");
        diccionario.put("ciudad", "city");
        diccionario.put("comida", "food");
        diccionario.put("musica", "music");
        diccionario.put("tiempo", "weather");
        diccionario.put("feliz", "happy");
        diccionario.put("jugar", "play");
        diccionario.put("canción", "song");

        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Solicita una palabra en español al usuario
            System.out.print("Escribe una palabra en español (o 'salir' para finalizar): ");
            String palabraEspanol = scanner.nextLine().toLowerCase();

            if (palabraEspanol.equals("salir")) {
                break; // Si el usuario escribe "salir," el programa termina
            }

            // Busca la traducción en el diccionario
            if (diccionario.containsKey(palabraEspanol)) {
                String palabraIngles = diccionario.get(palabraEspanol);
                System.out.println("La traducción al inglés es: " + palabraIngles);
            } else {
                System.out.println("La palabra no se encuentra en el diccionario.");
            }
        }
        scanner.close();
    }
}

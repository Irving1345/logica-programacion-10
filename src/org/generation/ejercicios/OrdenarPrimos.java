package org.generation.ejercicios;

import java.util.Scanner;

public class OrdenarPrimos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        // Solicitar al usuario 10 números y almacenarlos en el array
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar el array original
        System.out.println("Array original:");
        mostrarArray(numeros);

        // Organizar los números primos al principio del array
        organizarPrimosAlPrincipio(numeros);

        // Mostrar el array con primos al principio
        System.out.println("Array con primos al principio:");
        mostrarArray(numeros);
    }

    // Método para mostrar un array con sus índices
    private static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Índice " + i + ": " + array[i]);
        }
    }

    // Método para organizar los números primos al principio del array
    private static void organizarPrimosAlPrincipio(int[] array) {
        int[] tempArray = new int[array.length];
        int primosCount = 0;

        // Identificar números primos y moverlos al principio
        for (int i = 0; i < array.length; i++) {
            if (esPrimo(array[i])) {
                tempArray[primosCount] = array[i];
                primosCount++;
            }
        }

        // Mover los números no primos al final
        for (int i = 0; i < array.length; i++) {
            if (!esPrimo(array[i])) {
                tempArray[primosCount] = array[i];
                primosCount++;
            }
        }

        // Copiar el contenido del tempArray al array original
        System.arraycopy(tempArray, 0, array, 0, array.length);
    }

    // Método para verificar si un número es primo
    private static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

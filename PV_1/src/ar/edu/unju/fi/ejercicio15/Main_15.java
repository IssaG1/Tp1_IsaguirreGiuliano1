package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

import java.util.Scanner;

public class Main_15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanoArray; // se pide al user que ingrese un numero0]
        do {
            System.out.println("-----------------------------------------------------------");
            System.out.println("| Ingrese un número entero en el rango entre ->> [5 , 10]: |");
            System.out.println("-----------------------------------------------------------");
            // creamo arreglo tipo strng con el tamaño que mando el user

            tamanoArray = scanner.nextInt();
        } while (tamanoArray < 5 || tamanoArray > 10);

        String[] nombres = new String[tamanoArray];
        // aqui usuario debe ingresa nomrre de las personas 
        System.out.println("---------------------------------------");
        System.out.println("| Ingrese los nombres de las personas: |");
        System.out.println("---------------------------------------");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("| Nombre para la posición " + i + ": ");
            nombres[i] = scanner.next();
        }

        System.out.println("---------------------------------------");
        System.out.println("| Contenido del array (primer índice): |");
        System.out.println("---------------------------------------");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("| Posición " + i + ": " + nombres[i]);
        }

        System.out.println("-----------------------------------------");
        System.out.println("| Contenido del array (última posición): |");
        System.out.println("-----------------------------------------");
        for (int i = nombres.length - 1; i >= 0; i--) {
            System.out.println("| Posición " + i + ": " + nombres[i]);
        }

        scanner.close();
    }
}


package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main_13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un array de 8 elementos para almacenar números enteros
        int[] numeros = new int[8];

        // Pedir al usuario que ingrese los valores para cada posición del array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("\n---------------------------------");
            System.out.print("ingrese valor para la posicion " + i + ": ");
         

            numeros[i] = scanner.nextInt();
        }

        // Mostrar por consola el índice y el valor almacenado en esa posición
        System.out.println("---------------------------");
        System.out.println("Elementos del array:");
        System.out.println("---------------------------");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("indice " + i + " : " + numeros[i]);
        }

        scanner.close();
    }
}

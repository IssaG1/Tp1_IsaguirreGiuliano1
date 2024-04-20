package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

import java.util.Scanner;

public class Main_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanoArray;
        do {
            System.out.println("--------------------------------------------------------");
            System.out.println("| ingrese un número entero en el rango entre ->> [3 , 10]:         |");
            System.out.println("--------------------------------------------------------");
            tamanoArray = scanner.nextInt();
        } while (tamanoArray < 3 || tamanoArray > 10);

        int[] numeros = new int[tamanoArray];

        System.out.println("--------------------------------------------------------");
        System.out.println("| ingrese los valores para el array:                    |");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("| Valor para la posicion " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }

        System.out.println("--------------------------------------------------------");
        System.out.println("| Valores almacenados en el array:                      |");//valores almacenados
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("| Posición " + i + ": " + numeros[i] + "                                   |");
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("| La suma de todos los valores es: " + suma + "                  |");//sumando valores
        System.out.println("--------------------------------------------------------");
        System.out.println("nasheii");

        scanner.close();
    }
}


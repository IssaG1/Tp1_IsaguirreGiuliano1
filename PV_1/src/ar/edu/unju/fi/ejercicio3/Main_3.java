package ar.edu.unju.fi.ejercicio3; // aqui el nombre de mi paquete

import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args) {
        // acá creamos un objeto scanner para leer lo que ingrese el user
        Scanner scanner = new Scanner(System.in);
        
        // se solicita al user que ingrese un numero 
        System.out.println("Ingrese un número entero:");
        int numero = scanner.nextInt();
        
        // aqui deteerminamos si el numero es par o impar
        if (numero % 2 != 0) {
            System.out.println("El doble del número es: " + (numero * 2));
        } else {
            System.out.println("El triple del número es: " + (numero * 3));
        }
        
        // aqui cerramos el ciclo scanner pa liberar recursos
        scanner.close();
    }
}

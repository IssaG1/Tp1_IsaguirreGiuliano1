package ar.edu.unju.fi.ejercicio7.main;
import ar.edu.unju.fi.ejercicio7.model.*;

import java.util.Scanner;


public class Main_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el legajo del empleado:");
        int legajo = scanner.nextInt();

        System.out.println("Ingrese el salario del empleado:");
        double salario = scanner.nextDouble();

        // creamo objeto empleado usando cont parametr
        Empleado empleado = new Empleado(nombre, legajo, salario);

        // mostrando datos del empleado con 
        System.out.println("-------------------------------------");
        System.out.println("Datos del empleado antes del aumento");
        System.out.println("-------------------------------------");
        empleado.mostrarDatos();

        // dando aumento
        empleado.darAumento();

        // datos despues del aumento
        System.out.println("-----------------------------------------");
        System.out.println("\nDatos del empleado después del aumento");
        System.out.println("-----------------------------------------");
        empleado.mostrarDatos();

        scanner.close();
    }
}

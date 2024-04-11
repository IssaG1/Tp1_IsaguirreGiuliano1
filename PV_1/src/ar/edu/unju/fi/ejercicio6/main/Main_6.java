package ar.edu.unju.fi.ejercicio6.main;


import ar.edu.unju.fi.ejercicio6.model.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Objeto utilizando constructor por defecto
        Persona persona1 = new Persona();
        System.out.println("Ingrese DNI:");
        persona1.setDni(scanner.nextLine());
        System.out.println("Ingrese nombre:");
        persona1.setNombre(scanner.nextLine());
        System.out.println("Ingrese fecha de nacimiento (yyyy-MM-dd):");
        LocalDate fechaNacimiento1 = LocalDate.parse(scanner.nextLine());
        persona1.setFechaNacimiento(fechaNacimiento1);
        persona1.mostrarDatos();

        // Objeto utilizando constructor parametrizado
        System.out.println("\nIngrese DNI:");
        String dni = scanner.nextLine();
        System.out.println("Ingrese nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese fecha de nacimiento (yyyy-MM-dd):");
        LocalDate fechaNacimiento2 = LocalDate.parse(scanner.nextLine());
        System.out.println("Ingrese provincia:");
        String provincia = scanner.nextLine();
        Persona persona2 = new Persona(dni, nombre, fechaNacimiento2, provincia);
        persona2.mostrarDatos();

        // Objeto utilizando constructor con dni, nombre y fecha de nacimiento
        System.out.println("\nIngrese DNI:");
        dni = scanner.nextLine();
        System.out.println("Ingrese nombre:");
        nombre = scanner.nextLine();
        System.out.println("Ingrese fecha de nacimiento (yyyy-MM-dd):");
        LocalDate fechaNacimiento3 = LocalDate.parse(scanner.nextLine());
        Persona persona3 = new Persona(dni, nombre, fechaNacimiento3);
        persona3.mostrarDatos();

        scanner.close();
    }
}

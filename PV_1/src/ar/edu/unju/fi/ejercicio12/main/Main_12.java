package ar.edu.unju.fi.ejercicio12.main;


import ar.edu.unju.fi.ejercicio12.model.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main_12 {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    // pedir que ingrese datos el usuario
	    System.out.print("Ingrese el nombre de la persona: ");
	    String nombre = scanner.nextLine();

	    int dia, mes;

	    do { //para q cuando ponga un dia arriba de 31 no salte error y lo mismo con el mes
	        System.out.print("Ingrese el día de nacimiento (1-31): ");
	        dia = scanner.nextInt();
	    } while (dia < 1 || dia > 31);

	    do {
	        System.out.print("Ingrese el mes de nacimiento (1-12): ");
	        mes = scanner.nextInt();
	    } while (mes < 1 || mes > 12);

	    System.out.print("Ingrese el año de nacimiento: ");
	    int anio = scanner.nextInt();

	    Calendar fechaNacimiento = new GregorianCalendar(anio, mes - 1, dia);

	    // objeto person
	    Persona persona = new Persona(nombre, fechaNacimiento);

	    // mostrando en consola
	    System.out.println("-----------------------------------------------");
	    System.out.println("\n           |Datos de la persona|");
	    System.out.println("\n"+persona);
	    System.out.println("Edad: " + persona.calcularEdad() + " años");
	    System.out.println("Signo del zodiaco: " + persona.determinarSignoZodiaco());
	    System.out.println("Estación: " + persona.determinarEstacion());
	    System.out.println("\n-----------------------------------------------");
	    if (persona.determinarSignoZodiaco().equals("Tauro")) {
	        System.out.println("un kpo");
	    }

	    scanner.close();
	}
}

package ar.edu.unju.fi.ejercicio4; //aqui el nombre de mi paquete

	import java.util.Scanner;

	public class Main_4 {
	    public static void main(String[] args) {
	        // Crear un objeto Scanner para leer la entrada del usuario
	        Scanner scanner = new Scanner(System.in);
	        
	        // pedir que el usuario ingrese un numero entre 0 y 10
	        System.out.println("Ingrese un número entero entre 0 y 10:");
	        int numero = scanner.nextInt();
	        
	        // aqui se calcula el factorial usando el bucle while
	        int factorial = 1;
	        int i = 1;
	        while (i <= numero) {
	            factorial *= i;
	            i++;
	        }
	        
	        // Mostrar el resultado del factorial por consola
	        System.out.println("El factorial de " + numero + " es: " + factorial);
	        
	        // Cerrar el objeto Scanner
	        scanner.close();
	
	
	    	}	
	
	
	
	
	
	    }
